package com.czh.command;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 22:33
 * <p>
 * 描述：
 */
public class ConcreteCommand implements Command {
    Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver= receiver;
    }

    public void exec() {
        receiver.run();
    }
}
