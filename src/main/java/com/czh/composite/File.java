package com.czh.composite;

/**
 * 创建人：蔡志鸿
 * <p>
 * 创建时间：2017-08-13 0:42
 * <p>
 * 描述：文件接口
 */
public interface File {

    /**
     *
     * @param file
     */
    void add(File file);

    /**
     * 删除文件
     */
    void del();

    /**
     * 输出当前文件全名及子文件全名
     */
    void showFileList();
}
