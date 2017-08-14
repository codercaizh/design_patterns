package com.czh.mediator;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 13:47
 * <p>
 * 描述：
 */
public interface Colleague {
    void setMediator(Mediator mediator);

    void handler(String content);
}
