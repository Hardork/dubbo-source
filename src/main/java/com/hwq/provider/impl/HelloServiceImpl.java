package com.hwq.provider.impl;

import com.hwq.provider.api.HelloService;

/**
 * @Author:HWQ
 * @DateTime:2023/12/4 21:39
 * @Description:
 **/
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello:" + name ;
    }
}
