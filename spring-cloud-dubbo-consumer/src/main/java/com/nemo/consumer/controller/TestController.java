package com.nemo.consumer.controller;

import com.nemo.api.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("sayHello")
    public String sayHello(String name) {
        return testService.sayHello(name);
    }
}
