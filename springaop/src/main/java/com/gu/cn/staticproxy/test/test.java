package com.gu.cn.staticproxy.test;

import com.gu.cn.staticproxy.pojo.Host;
import com.gu.cn.staticproxy.pojo.Proxy;
import com.gu.cn.staticproxy.service.UserServiceImpl;
import com.gu.cn.staticproxy.service.UserServiceProxy;

public class test {

    public static void main(String[] args) {
       /* Proxy proxy = new Proxy(new Host());
        proxy.rent();*/
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserServiceImpl());
        userServiceProxy.add();
    }
}
