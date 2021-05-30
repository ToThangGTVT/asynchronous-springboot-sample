package com.example.demo_thread.controller;

import com.example.demo_thread.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAsync
public class NumberController {

    @Autowired
    NumberService numberService;

    @GetMapping("/async/{id}")
    String async(@PathVariable Integer id) throws InterruptedException {
        numberService.asyncFunc(id);
        System.out.println("id = " + id);
        return "done";
    }
}
