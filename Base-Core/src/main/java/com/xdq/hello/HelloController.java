package com.xdq.hello;

import com.xdq.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Dongqiang
 * @Date 2017/10/19 14:50
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private HelloService hello1Service;

    @Autowired
    private HelloService hello2Service;

    @Autowired
    private ApplicationContext context;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name;
    }

    @GetMapping("/hello")
    public String hello(){

        return hello1Service.sayHello() + hello2Service.sayHello();
    }
}
