package com.czh.mediator;


/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 17:43
 * <p>
 * 描述：
 */
public class SimpleMediator implements Mediator {

    private Colleague colleagueA;

    private Colleague colleagueB;

    public SimpleMediator(Colleague colleagueA, Colleague colleagueB){
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }
    public void sendMessage(String content, Colleague colleague) {
        Colleague sendObj =colleague == colleagueA?colleagueB:colleagueA;
        sendObj.handler(content);
    }
}
