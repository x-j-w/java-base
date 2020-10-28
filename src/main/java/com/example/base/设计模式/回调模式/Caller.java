package com.example.base.设计模式.回调模式;

/**
 * @author jiwei.xue
 * @date 2020/10/28 12:21
 */
public class Caller {

    public void call(ICallBack callBack) {
        System.out.println("start...");
        callBack.callBack();
        System.out.println("end...");
    }
}
