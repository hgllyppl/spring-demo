package com.spring.aop.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xin on 2019/4/28.
 */
@Component
public class CircularReferenceA {

    @Autowired
    private CircularReferenceB referenceB;

    public void sayHello() {
        System.out.println("hello, i'm CircularReferenceA");
    }
}
