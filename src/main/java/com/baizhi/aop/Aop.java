package com.baizhi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
//代表这个类是一个切面
@Aspect
//将类交给spring工厂
@Configuration
public class Aop {
    @Pointcut("execution(* com.baizhi.service.*.*(..))")
    public  void pp(){

    }

   /* //前置增强
    @Before(value = "pp()")
    public  void qianzhi(JoinPoint joinPoint){
        System.out.println("前置增强处理");
    }
    //后置增强
    @After(value= "pp()")
    public void houzhi(JoinPoint joinPoint){
        System.out.println("后置增强处理");
    }
    */
    //环绕增强
    @Around(value = "pp()")
    public Object huanrao(ProceedingJoinPoint proceedingJoinPoint){
        Object proceed = null;
        try {
            System.out.println("环绕前置");
            //放行
             proceed = proceedingJoinPoint.proceed();
            System.out.println("环绕后置");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;
    }
}
