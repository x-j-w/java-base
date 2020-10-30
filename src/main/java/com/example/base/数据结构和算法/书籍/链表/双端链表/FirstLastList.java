package com.example.base.数据结构和算法.书籍.链表.双端链表;

/**
 * @author jiwei.xue
 * @date 2020/10/30 14:13
 */
public class FirstLastList {

    private Link first;

    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * 在链表头部添加
     * @param dd
     */
    public void insertFirst(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    /**
     * 在链表尾部添加
     * @param dd
     */
    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    /**
     * 删除头节点
     * @return
     */
    public long deleteFirst() {
        long temp = first.dData;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    /**
     * 遍历链表
     */
    public void displayList() {
        System.out.println("List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
