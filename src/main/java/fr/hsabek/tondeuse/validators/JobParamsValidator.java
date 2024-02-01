package fr.hsabek.tondeuse.validators;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;
import org.springframework.util.StringUtils;

public class JobParamsValidator implements JobParametersValidator {
    @Override
    public void validate(final JobParameters jobParameters) throws JobParametersInvalidException {
        if(!StringUtils.endsWithIgnoreCase(jobParameters.getString("instructFile"),"txt")){
            throw new JobParametersInvalidException("Le fichier d'instruction doit etre au format txt");
        }


    }
}
