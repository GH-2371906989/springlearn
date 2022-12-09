package com.gu.cn.dynamicproxy.pojo;

//房东
public class Host implements Rent {
    public void rent() {
        System.out.println("房东出租房子！");
    }
}

