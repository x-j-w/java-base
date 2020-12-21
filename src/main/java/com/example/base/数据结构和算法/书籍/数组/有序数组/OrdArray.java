package com.example.base.数据结构和算法.书籍.数组.有序数组;

/**
 * @author jiwei.xue
 * @date 2020/12/21 18:26
 */
public class OrdArray {

    private long[] a;
    private int nElems;

    public OrdArray(int maxSize) {
        a = new long[maxSize];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    /**
     * 二分查找
     *
     * @param searchKey
     * @return
     */
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    /**
     * 数组插入元素 顺序插入
     *
     * @param value
     */
    public void insert(long value) {
        int j;
        // TODO 将插入的值和已存在的值进行比较，当已存在的值大于插入的值的时候，比较结束
        for (j = 0; j < nElems; j++) {
            if (a[j] > value) {
                break;
            }
        }
        // TODO 将第一个大于插入的值的后面的所有的数分别向后移动一位
        for (int k = nElems; k > j; k--) {
            a[k] = a[k - 1];
        }
        //给插入的位置赋值
        a[j] = value;
        nElems++;
    }

    /**
     * 删除指定元素
     *
     * @param value
     * @return
     */
    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    }

    /**
     * display arr
     */
    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.println(a[j] + " ");
        }
        System.out.println("");
    }
}
