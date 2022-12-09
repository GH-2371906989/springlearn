package com.gu.cn.service;

import com.gu.cn.SystemConfig;
import org.springframework.stereotype.Service;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//真实角色
@Service(value = "service")
@SystemConfig(name = "张三",age = 18)
public class UserServiceImpl implements UserService {

    public void add(String s) {
        System.out.println("增加了一个用户！");
    }

    public void delete() {
        System.out.println("删除了一个用户！");
    }

    public void update() {
        System.out.println("修改了一个用户！");
    }

    public void query() {
        System.out.println("查询了一个用户！");
    }
}

