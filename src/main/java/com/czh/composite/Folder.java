package com.czh.composite;

import java.util.ArrayList;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 0:52
 * <p>
 * 描述：文件夹
 */
public class Folder extends SimpleFile{
    Folder(String name) {
        super(name);
        files = new ArrayList<File>();
    }

    protected void delete() {
        System.out.println(name + "已被删除");
        this.files.clear();
        name = null;
    }

    public void add(File file) {
        files.add(file);
    }
}
