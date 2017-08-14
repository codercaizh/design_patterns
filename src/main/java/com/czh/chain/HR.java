package com.czh.chain;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 13:24
 * <p>
 * 描述：人事专员
 */
public class HR extends AbstractManager {
    public void handler(int context) {
        if(context>3000){
            System.out.println("人事专员：幅度太高，我需要与财务总监报告");
            highManager.handler(context);
        }else{
            System.out.println("人事专员：允许涨薪水");
        }
    }
}
