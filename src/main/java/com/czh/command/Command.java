package com.czh.command;

/**
 * 创建人：Caizh
 * <p>
 * 创建时间：2017-08-13 22:30
 * <p>
 * 描述：命令接口
 */
public interface Command {

    void setReceiver(Receiver receiver);
    void exec();
}
