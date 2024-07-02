package com.example.springbatch.job2;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

@Component
public class Job2Reader implements ItemReader<String> {
    private int count = 0;

    @Override
    public String read() {
        if (count < 10) {
            return "Item" + ++count;
        } else {
            return null;
        }
    }
}
