package com.gu.cn.advice;

import com.alibaba.fastjson.JSON;
import com.gu.cn.SystemConfig;
import com.gu.cn.service.UserService;
import com.gu.cn.service.UserServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
public class AnnotationPointCut {

    @Pointcut("execution(* com.gu.cn.service.UserServiceImpl.*(..))")
    public void tt(){}

    @Before("tt()")
    public void beforeRun(JoinPoint joinPoint) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//定义时间格式，时间的粒度，控制在毫秒；
        String now = sdf.format(new Date());//获取系统当前时间的格式化字符串
        String className = joinPoint.getTarget().getClass().getName();//获取目标类的名称
        String s = joinPoint.getTarget().getClass().getSimpleName();
        System.out.println(s);
        Class<?> aClass = joinPoint.getTarget().getClass();
        SystemConfig annotation = aClass.getAnnotation(SystemConfig.class);

        System.out.println(JSON.toJSONString(annotation.age()));
        String methodName = joinPoint.getSignature().getName();//获取目标方法的名称；
        System.out.println("----->" + now + ":" + className + "." + methodName);//输出时间，附带对应的类和方法的名称；
        Object[] args = joinPoint.getArgs();
        System.out.println("----->参数个数：" + args.length);
        for (Object arg : args) {
            System.out.println("----->参数" + arg);
        }
    }

    @Around("tt()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        String name = pjp.getSignature().getName();
        Object[] args = pjp.getArgs();

        return pjp.proceed(args);
    }
}
