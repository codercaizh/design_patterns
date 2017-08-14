package com.czh.chain;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 13:19
 * <p>
 * 描述：
 */
public abstract class AbstractManager implements Manager {
    Manager highManager;

    public void setHighManager(Manager manager) {
        highManager = manager;
    }
}
