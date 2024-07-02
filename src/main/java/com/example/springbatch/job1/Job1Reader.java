package com.example.springbatch.job1;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

@Component
public class Job1Reader implements ItemReader<String> {
    private int count = 0;

    @Override
    public String read() throws Exception {
        if (count < 10) {
            return "Item" + ++count;
        } else {
            return null;
        }
    }
}
