package com.example.base.数据结构和算法.书籍.树.二叉树;

/**
 * @author jiwei.xue
 * @date 2020/12/28 10:40
 */
public class TreeApp {

    public static void main(String[] args) {

        Tree theTree = new Tree();

        theTree.insert(50, 1.5);
        theTree.insert(25, 1.7);
        theTree.insert(75, 1.9);

        Node found = theTree.find(25);
        if (found != null) {
            System.out.println("found the node with 25");
        } else {
            System.out.println("can not find node with key 25");
        }

    }
}
