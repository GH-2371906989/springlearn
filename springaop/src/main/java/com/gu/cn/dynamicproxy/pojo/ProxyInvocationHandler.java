package com.gu.cn.dynamicproxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Data
@AllArgsConstructor
public class ProxyInvocationHandler<T> implements InvocationHandler {
    private T rent;

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }


    //看房
    public void seeHouse(){
        System.out.println("中介带着看房子！");
    }

    //签合同
    public void sign(){
        System.out.println("和中介签署租赁合同！");
    }

    //收费用
    public void fee(){
        System.out.println("中介收取费用！");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(rent, args);
        seeHouse();
        sign();
        fee();
        return invoke;
    }
}
