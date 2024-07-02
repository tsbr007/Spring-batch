package com.example.springbatch.config;

import com.example.springbatch.job2.Job2Processor;
import com.example.springbatch.job2.Job2Reader;
import com.example.springbatch.job2.Job2Writer;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("job2")
public class Job2Config {

    @Bean
    public Job job2(JobBuilderFactory jobBuilderFactory, Step step2) {
        return jobBuilderFactory.get("job2")
                .start(step2)
                .build();
    }

    @Bean
    public Step step2(StepBuilderFactory stepBuilderFactory, Job2Reader reader, Job2Processor processor, Job2Writer writer) {
        return stepBuilderFactory.get("step2")
                .<String, String>chunk(10)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }
}
