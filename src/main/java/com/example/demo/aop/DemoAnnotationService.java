package com.example.demo.aop;

import org.springframework.stereotype.Service;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/8
 * Time：16:24
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(String name){
        //System.out.println("name = "+name);
    }
}
