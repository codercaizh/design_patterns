package com.czh.chain;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 13:20
 * <p>
 * 描述：老板
 */
public class Boss extends AbstractManager {
    public void handler(int context) {
        if(context > 10000){
            System.out.println("老板：要求太高，不允许！");
        }else{
            System.out.println("老板：允许涨薪水");
        }
    }
}
