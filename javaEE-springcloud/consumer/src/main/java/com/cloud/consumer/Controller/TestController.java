package com.cloud.consumer.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/v1")
    public String getService(){
        // 3.第三种方式，利用@LoadBalanced注解，可在restTemplate里使用应用名称进行调用
        return restTemplate.getForObject("http://PRODUCER/demo/get", String.class);
    }
}
