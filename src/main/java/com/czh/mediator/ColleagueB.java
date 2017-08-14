package com.czh.mediator;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 17:39
 * <p>
 * 描述：
 */
public class ColleagueB extends AbstractColleague {

    public void handler(String content) {
        System.out.println("ColleagueB收到内容:"+content);
    }
}
