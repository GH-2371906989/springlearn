package com.gu.cn.staticproxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Proxy implements Rent{
    private Host host;


    @Override
    public void rent() {
        seeHouse();
        host.rent();
        sign();
        fee();
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
}
