package com.gu.cn.staticproxy.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserServiceProxy implements UserService{
    private UserService userService;

    @Override
    public void add() {
        userService.add();
        log("add");
    }

    @Override
    public void delete() {
        userService.delete();
        log("delect");
    }

    @Override
    public void update() {

        userService.update();
        log("update");
    }

    @Override
    public void query() {

        userService.query();
        log("query");
    }

    public void log(String msg){
        System.out.println("[Debug] 使用了一个"+msg+"方法");
    }
}
