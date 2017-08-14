package com.czh.composite;

import java.util.List;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 0:44
 * <p>
 * 描述：
 */
public abstract class SimpleFile implements File {
    protected String name;

    List<File> files;

    SimpleFile(String name){
        this.name = name;
    }

    public void showFileList() {
        System.out.println(name);
        if(files != null){
            for(File file:files){
                file.showFileList();
            }
        }
    }

    public void del() {
        if(files != null){
            for(File file:files){
                file.del();
            }
        }
        delete();
    }

    protected abstract void delete();
}
