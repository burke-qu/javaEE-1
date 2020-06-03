package com.cloud.producer.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

    @RequestMapping("/get")
    public String getService(){

        return "Hello,you succeed in getting me!";
    }

}
