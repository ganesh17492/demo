package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @RequestMapping("/demo")
    public String greetings() {
        log.info("DemoController::greetings");
        return "hello, there";
    }
}
