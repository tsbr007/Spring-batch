package com.example.springbatch.job1;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Job1Processor implements ItemProcessor<String, String> {
    @Override
    public String process(String item) throws Exception {
        return item.toUpperCase();
    }
}
