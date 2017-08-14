package com.czh.chain;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 13:22
 * <p>
 * 描述：财务总监
 */
public class CFO extends AbstractManager {
    public void handler(int context) {
        if(context > 5000){
            System.out.println("财务总监：幅度太高，我需要与老板报告");
            highManager.handler(context);
        }else{
            System.out.println("财务总监：允许涨薪水");
        }
    }
}
