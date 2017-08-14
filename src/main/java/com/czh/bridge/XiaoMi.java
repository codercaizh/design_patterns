package com.czh.bridge;

/**
 * Created by caizh on 2017-08-13.
 */
public class XiaoMi extends SimpleMobile {
    public XiaoMi(String name) {
        super(name);
    }

    public void runGame() {
        System.out.println(mobileName + "清理后台内存");
        System.out.println(mobileName + "开始运行游戏");
        mobileGame.run();
    }
}
