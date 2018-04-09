package com.example.demo.main;

import com.example.demo.aop.DemoAnnotationService;
import com.example.demo.aop.DemoMethodService;
import com.example.demo.conf.AopConfig;
import com.example.demo.conf.DiConf;
import com.example.demo.conf.DiConfBean;
import com.example.demo.scope.DemoPrototypeService;
import com.example.demo.scope.DemoSingletonService;
import com.example.demo.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/8
 * Time：11:41
 */
public class Main1 {
    public static void main(String[] args) {
/*        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfBean.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.use("world"));*/

        //aop
/*        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add("aaa");

        demoMethodService.add("bbb");

        context.close();*/


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfBean.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        System.out.println(s1.equals(s2));
        System.out.println(p1.equals(p2));
    }
}
