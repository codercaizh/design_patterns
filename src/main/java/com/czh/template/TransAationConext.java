package com.czh.template;

/**
 * Created by a5453 on 2017-07-31.
 */
public abstract class TransAationConext implements Context {
    private int userA;

    private int userB;

    private int money;

    public int getUserA() {
        return userA;
    }

    public void setUserA(int userA) {
        this.userA = userA;
    }

    public int getUserB() {
        return userB;
    }

    public void setUserB(int userB) {
        this.userB = userB;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
