package com.example.demo_thread.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

    @Async
    public String asyncFunc(Integer id) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < id; i++) {
            sb.append(i).append("\t");
            Thread.sleep(1000);
            System.out.println("i = " + i);
        }
        return sb.toString();
    }
}
