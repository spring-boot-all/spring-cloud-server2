package com.wj.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/getPortInfo")
    public String getPortInfo(@RequestParam String name) {
        return "The port is 9013 " + name;
    }
}
