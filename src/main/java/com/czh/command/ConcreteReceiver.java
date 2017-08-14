package com.czh.command;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 22:34
 * <p>
 * 描述：
 */
public class ConcreteReceiver implements Receiver {
    public void run() {
        System.out.println("ConcreteReceiver 已经接收到请求");
    }
}
