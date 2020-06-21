package com.cloud.eurekaclient.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/api/v1/demo/get")
    public String getService(){
        // 3.第三种方式，利用@LoadBalanced注解，可在restTemplate里使用应用名称进行调用
        return restTemplate.getForObject("http://ZUUL/consumer/v1", String.class);
    }

    @Value("${hello}")
    private  String hello;

    @RequestMapping("/hello")
    public String getConfigFile(){

        return this.hello;
    }

}
