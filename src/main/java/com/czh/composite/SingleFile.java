package com.czh.composite;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 0:53
 * <p>
 * 描述：单独文件
 */
public class SingleFile extends SimpleFile {
    SingleFile(String name) {
        super(name);
    }

    public void add(File file) {
    }

    protected void delete() {
        System.out.println(name + "文件已被删除");
        name = null;
    }
}
