package com.example.demo.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/8
 * Time：17:35
 */
@Configuration
@ComponentScan("com.example.demo.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
