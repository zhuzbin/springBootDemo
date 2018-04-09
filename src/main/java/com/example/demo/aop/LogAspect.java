package com.example.demo.aop;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/8
 * Time：16:40
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.example.demo.aop.Action)")
    public void annotationPointCut(){}

    @Pointcut("execution(* com.example.demo.aop.DemoMethodService.*(..))")
    public void methodPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截"+action.name());
    }

    @Before("methodPointCut()")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法式拦截"+method.getName());

        //获取方法值
/*        Object obj[] = joinPoint.getArgs();
        System.out.println(obj[0]);*/
    }

    @Around("methodPointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("环绕通知"+method.getName());
        joinPoint.proceed();
    }
}
