package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/8
 * Time：11:35
 */
@Service
public class FunctionService {

    public String helloWorld(String world){
        return "Hello,"+world;
    }
}
