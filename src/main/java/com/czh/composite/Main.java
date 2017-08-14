package com.czh.composite;

/**
 * 创建人：菜头君
 *
 * 设计模式名称：组合模式
 *
 * 设计模式意图：将对象组合成树形结构以表示“部分-整体”的层次结构。Composite使得用户对单个对象和组合对象的使用具有一致性。
 *
 * 适用性：
 *
 * 1、你想表示对象的部分—整体层次结构。
 *
 * 2、你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
 *
 */
public class Main {
    public static void main(String[] args) {
        File parentA = new Folder("-parentA");
        File childA = new Folder("-parentA-childA");
        File childB = new SingleFile("-parentA-childB");
        File childC = new SingleFile("-parentA-childC");
        parentA.add(childA);
        parentA.add(childB);
        parentA.add(childC);
        File childAchildA = new Folder("-parentA-childA-childA");
        File childAchildB = new SingleFile("-parentA-childA-childB");
        File childAchildC = new SingleFile("-parentA-childA-childC");
        File childAchildD = new Folder("-parentA-childA-childD");
        childA.add(childAchildA);
        childA.add(childAchildB);
        childA.add(childAchildC);
        childA.add(childAchildD);
        File childAchildAchildA =  new SingleFile("-parentA-childA-childA-childA");
        childAchildA.add(childAchildAchildA);
        File childAchildDchildA =  new SingleFile("-parentA-childA-childD-childA");
        File childAchildDchildB =  new SingleFile("-parentA-childA-childD-childB");
        childAchildD.add(childAchildDchildA);
        childAchildD.add(childAchildDchildB);
        parentA.showFileList();
        System.out.println("删除掉childA文件夹");
        childA.del();
        System.out.println("删除完成");
        parentA.showFileList();
    }
}
