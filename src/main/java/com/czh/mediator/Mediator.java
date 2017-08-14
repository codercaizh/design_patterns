package com.czh.mediator;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 13:46
 * <p>
 * 描述：中介者
 */
public interface Mediator {
    void sendMessage(String content, Colleague colleague);

}
