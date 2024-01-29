package fr.hsabek.tondeuse.batch;


import fr.hsabek.tondeuse.validators.JobParamsValidator;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersValidator;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.job.CompositeJobParametersValidator;
import org.springframework.batch.core.job.DefaultJobParametersValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Arrays;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Bean
    public JobParametersValidator defaultJobParametersValidator(){
        DefaultJobParametersValidator beanValidator = new DefaultJobParametersValidator();
        beanValidator.setRequiredKeys(new String[]{"instructFile"});
       // beanValidator.setOptionalKeys(new String[]{"run.id"}); // pour designer le id du job
        return beanValidator;
    }

    @Bean
    public JobParametersValidator jobParametersValidator(){
        return new JobParamsValidator();
    }
    @Bean
    public JobParametersValidator compositeJobParametersValidator(){
        CompositeJobParametersValidator bean = new CompositeJobParametersValidator();
        bean.setValidators(Arrays.asList(defaultJobParametersValidator(),jobParametersValidator()));
        return bean;
    }

    @Bean
    public Job job(final JobBuilderFactory jobBuilderFactory,final  Step chargementInstructionStep){
        return jobBuilderFactory.get("tondeuse-batch")
                .start(chargementInstructionStep)
                .validator(compositeJobParametersValidator())
                //.incrementer(new RunIdIncrementer()) // lié au job id
                .build();
    }

}
