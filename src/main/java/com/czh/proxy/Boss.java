package com.czh.proxy;

/**
 * Created by a5453 on 2017-07-30.
 */
public class Boss implements Trans{
    int money;
    public void getMoney(int money){
        System.out.println("BOSS收到了:" + money +"元");
        this.money = money;
    }

    public void send(){
        System.out.println("BOSS发送价值" + money + "的货");
    }
}
