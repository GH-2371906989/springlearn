package com.gu.cn;

import com.gu.cn.service.UserService;
import com.gu.cn.utils.ApplicationContextUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService bean = context.getBean(UserService.class);
        bean.add("s");
    }
}
