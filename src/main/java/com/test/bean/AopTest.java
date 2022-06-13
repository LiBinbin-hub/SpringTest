package com.test.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public class AopTest {

    public void after() {
        System.out.println("我是执行之后");
    }

    public void before(JoinPoint point) {
        System.out.println("我是执行之前");
        System.out.println(point.getTarget());
        System.out.println(Arrays.toString(point.getArgs()));
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法开始之前");
        Object value = joinPoint.proceed();
        System.out.println("方法执行完成， 结果为：" + value);
        return value;
    }
}
