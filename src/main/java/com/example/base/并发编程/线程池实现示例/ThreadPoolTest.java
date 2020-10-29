package com.example.base.并发编程.线程池实现示例;

public class ThreadPoolTest {

    public static void main(String[] args) {

        DefaultThreadPool<Runnable> pool = new DefaultThreadPool<>();
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "在执行");
            }
        };
        pool.execute(runnable);
    }
}
