package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/8
 * Time：11:37
 */
@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;

    public String use(String world){
        return functionService.helloWorld(world);
    }
}
