package com.example.springbatch.job2;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Job2Processor implements ItemProcessor<String, String> {
    @Override
    public String process(String item) {
        return item.toLowerCase();
    }
}
