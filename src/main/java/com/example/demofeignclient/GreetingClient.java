package com.example.demofeignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("os-demo-java-restservice-eureka")
public interface GreetingClient {
    @RequestMapping("/api/greeting")
    String greeting();
}
