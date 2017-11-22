package com.xdq.service.impl;

import com.xdq.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Auther Dongqiang
 * @Date 2017/11/22 17:34
 */
@Service(value = "hello1Service")
public class Hello1ServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello 1";
    }
}
