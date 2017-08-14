package com.czh.interpreter;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 19:43
 * <p>
 * 描述：单数字母解释器
 */
public class SingularExpression extends AbstractExpression{
    public void interpreter(String content) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = content.toCharArray();
        for(int i = 0;i<chars.length;i++){
            if(i%2 != 0){
                stringBuilder.append(chars[i]);
            }
        }
        System.out.println("单数字母解释器:" + stringBuilder.toString());
    }
}
