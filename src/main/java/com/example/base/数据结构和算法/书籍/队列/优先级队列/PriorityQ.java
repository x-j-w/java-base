package com.example.base.数据结构和算法.书籍.队列.优先级队列;

/**
 * @author jiwei.xue
 * @date 2021/1/6 14:26
 * <p>
 * 优先级队列
 */
public class PriorityQ {

    private int maxSize;

    private long[] queArray;

    private int nItems;

    public PriorityQ(int size) {
        this.maxSize = size;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int j;
        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (j = nItems - 1; j > 0; j--) {
                if (item > queArray[j]) {
                    queArray[j + 1] = queArray[j];
                } else {
                    break;
                }
            }
            queArray[j + 1] = item;
            nItems++;
        }
    }

    public long remove() {
        return queArray[--nItems];
    }

    public long peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }
}
