package com.example.base.设计模式.关于监听观察回调模式.监听器模式;

import java.util.EventListener;

public interface EventListenerHandler extends EventListener {

    void handler(EventInfo eventInfo);
}
