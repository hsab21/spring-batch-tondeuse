package fr.hsabek.tondeuse.batch;

import fr.hsabek.tondeuse.domain.entites.Instruction;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class ChargementInstructionStepConfig {

        @Bean
        @StepScope
        public FlatFileItemReader<Instruction> instructionItemReader(@Value("#{jobParameters['instructFile']}")final Resource inputFile){
            return new FlatFileItemReaderBuilder<Instruction>()
                    .name("InstructionItemReader")
                    .resource(inputFile)
                    .delimited()
                    .delimiter(" ")
                    .names(new String[]{"xmax","ymax","x","y","codeOrientation","codeInstruction"})
                    .targetType(Instruction.class)
                    .build();
        }

        @Bean
        public ItemWriter<Instruction> instructionItemWriter(){
            return (items) -> items.forEach(System.out::println);
        }

        @Bean
        public Step chargementInstructionStep(final StepBuilderFactory builderFactory){
            return builderFactory.get("chargementInstructionStep")
                    .<Instruction, Instruction>chunk(1)
                    .reader(instructionItemReader(null))
                    .writer(instructionItemWriter())
                    .build();
        }
}

