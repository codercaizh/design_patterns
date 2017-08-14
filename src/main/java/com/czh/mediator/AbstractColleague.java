package com.czh.mediator;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 17:40
 * <p>
 * 描述：
 */
public abstract class AbstractColleague implements Colleague{
    Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
