package fr.hsabek.tondeuse.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TondeuseTasklet implements Tasklet {

	@Override
	public RepeatStatus execute(final StepContribution stepContribution, final ChunkContext chunkContext)
			throws Exception {
		System.out.println("hello " + chunkContext.getStepContext().getJobParameters().get("name"));
		return RepeatStatus.FINISHED;
	}

}
