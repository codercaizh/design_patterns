package com.czh.mediator;


/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 13:48
 * <p>
 * 描述：
 */
public class ColleagueA extends AbstractColleague{

    public void handler(String content) {
        mediator.sendMessage(content,this);
        System.out.println("ColleagueA发送内容:"+content);
    }
}
