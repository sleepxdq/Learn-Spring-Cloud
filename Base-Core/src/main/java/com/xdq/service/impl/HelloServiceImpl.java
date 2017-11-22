package com.xdq.service.impl;

import com.xdq.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Auther Dongqiang
 * @Date 2017/11/22 17:51
 */
@Service(value = "helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello spring default bean name";
    }
}
