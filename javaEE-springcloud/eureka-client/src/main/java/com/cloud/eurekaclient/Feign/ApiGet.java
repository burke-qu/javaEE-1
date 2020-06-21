package com.cloud.eurekaclient.Feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("zuul")
public interface ApiGet {


}
