package com.gu.cn.dynamicproxy.test;


import com.gu.cn.dynamicproxy.pojo.Host;
import com.gu.cn.dynamicproxy.pojo.ProxyInvocationHandler;
import com.gu.cn.dynamicproxy.pojo.Rent;

public class test {

    public static void main(String[] args) {
        ProxyInvocationHandler handler = new ProxyInvocationHandler(new Host());
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();
    }
}
