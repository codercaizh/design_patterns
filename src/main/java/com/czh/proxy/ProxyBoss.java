package com.czh.proxy;

/**
 * Created by a5453 on 2017-07-30.
 */
public class ProxyBoss implements Trans{
    private Boss boss;
    public ProxyBoss(){
        boss = new Boss();
    }

    public void getMoney(int money) {
        System.out.println("代理收了3成代理费，剩下:" + money * 0.7);
        boss.getMoney((int)(money * 0.7));
    }

    public void send() {
        boss.send();
    }
}
