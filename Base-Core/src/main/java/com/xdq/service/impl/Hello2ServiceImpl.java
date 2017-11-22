package com.xdq.service.impl;

import com.xdq.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Auther Dongqiang
 * @Date 2017/11/22 17:35
 */
@Service(value = "hello2Service")
public class Hello2ServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello 2";
    }
}
