package com.anla.rpc.conditions.groupprovider.service.impl;

import com.anla.rpc.conditions.groupprovider.service.HelloService;

/**
 * @author anLA7856
 * @date 19-7-28 下午3:51
 * @description
 */
public class HelloCatService implements HelloService {
    @Override
    public String hello(String name) {
        return "hello anLA7856, I am "+ name + ". This is my cat";
    }
}