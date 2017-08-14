package com.czh.chain;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 13:16
 * <p>
 * 描述：管理员
 */
public interface Manager {
    /**
     * 设置上级管理员
     * @param manager
     */
    void setHighManager(Manager manager);

    /**
     * 处理事情
     */
    void handler(int context);
}
