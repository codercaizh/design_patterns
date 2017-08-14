package com.czh.command;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 22:32
 * <p>
 * 描述：调用者
 */
public class Invoker {
    Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void call(){
        command.exec();
    }
}
