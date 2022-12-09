package com.gu.cn.advice;

import org.springframework.stereotype.Component;

@Component("dpc")
public class DiyPointCut {
    public void before(){
        System.out.println("======方法执行前======");
    }

    public void after(){
        System.out.println("======方法执行后======");
    }
}

