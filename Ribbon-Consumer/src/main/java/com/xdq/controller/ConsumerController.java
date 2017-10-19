package com.xdq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther Dongqiang
 * @Date 2017/10/19 16:46
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello-ribbon")
    public String helloRibbon() {
        return restTemplate.getForObject("http://Base-Core/hello"+"/ribbon", String.class);
    }

}
