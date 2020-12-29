package com.example.base.数据结构和算法.书籍.树.平衡二叉树avl;

/**
 * @author jiwei.xue
 * @date 2020/12/29 11:05
 * 左旋——自己变为右孩子的左孩子；右旋——自己变为左孩子的右孩子； 以上口诀+动图=完美
 *
 * https://blog.csdn.net/qq_25343557/article/details/89110319
 * https://blog.csdn.net/qq_37934101/article/details/81160254
 */
public class AvlTree<E extends Comparable<E>> {

    /**
     * 内部类
     */
    private class Node{
        public E e;
        public Node left;
        public Node right;
        public int height;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }

    private Node root;
    private int size;

    public AvlTree() {
        root = null;
        size = 0;
    }

    /**
     * 获取某一节点的高度
     * @param node
     * @return
     */
    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private int getBalanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }

        int balandeFactory = Math.abs(getBalanceFactor(node));
        if (balandeFactory > 1) {
            return false;
        }
        return isBalanced(node.left) && isBalanced(node.right);
    }


    /**
     *   LL的意思是向左子树（L）的左孩子（L）中插入新节点后导致不平衡，这种情况下需要右旋操作，而不是说LL的意思是右旋，后面的也是一样。
     * 右旋转
     * 自己变为左孩子的右孩子,自己的左孩子的有孩子变为自己的左孩子
     * @return
     */
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node t3 = x.right;
        x.right = y;     // 自己变为左孩子的右孩子
        y.left = t3;     // 自己的左孩子的右孩子变为自己的左孩子

        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
        return x;
    }

    private Node leftRotate(Node y) {
        Node x = y.right;
        Node t2 = x.left;
        x.left = y;
        y.right = t2;

        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
        return x;
    }

}



