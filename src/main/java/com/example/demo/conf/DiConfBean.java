package com.example.demo.conf;

import com.example.demo.scope.DemoPrototypeService;
import com.example.demo.scope.DemoSingletonService;
import com.example.demo.service.FunctionService;
import com.example.demo.service.UseFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/8
 * Time：15:19
 */
@Configuration
public class DiConfBean {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        return new UseFunctionService();
    }

    @Bean
    @Scope("singleton")
    public DemoSingletonService demoSingletonService(){
        return new DemoSingletonService();
    }

    @Bean
    @Scope("prototype")
    public DemoPrototypeService demoPrototypeService(){
        return new DemoPrototypeService();
    }
}
