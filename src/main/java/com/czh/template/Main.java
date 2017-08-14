package com.czh.template;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;
/**
 * 创建人：菜头君
 *
 * 设计模式名称：模版模式
 *
 * 设计模式意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。Template Method 使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 * 适用性：
 *
 * 1、一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
 *
 * 2、各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。这是Opdyke和Johnson所描述过的“重分解以一般化”的一个很好的例子。首先识别现有代码中的不同之处，并且将不同之处分离为新的操作。最后，用一个调用这些新的操作的模板方法来替换这些不同的代码。
 *
 * 3、控制子类扩展。模板方法只在特定点调用“hook”操作，这样就只允许在这些点进行扩展。
 *
 */
public class Main {
    public static void main(String[] args) {
        Map account = new HashMap();
        int userA = 1;
        int userB = 2;

        //给userA的账户放入200元
        account.put(userA,200);
        //给userB的账户放入100元
        account.put(userB,100);

        TransAationConext context = new SimpleTransActionContext();
        context.setParameter("Account",account);

        //userA转到userB 50元
        context.setUserA(userA);
        context.setUserB(userB);
        context.setMoney(50);

        TransActionControl transActionControl = new CashTransActionControl(context);
        System.out.println("userA目前的余额:" + account.get(userA));
        System.out.println("userB目前的余额:" + account.get(userB));
        System.out.println("转账开始");
        transActionControl.run();
        System.out.println("转账完成");
        System.out.println("userA目前的余额:" + account.get(userA));
        System.out.println("userB目前的余额:" + account.get(userB));
    }
}
