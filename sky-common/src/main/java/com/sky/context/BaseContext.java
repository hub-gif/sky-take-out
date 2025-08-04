package com.sky.context;

//基于ThreadLocal封装工具类，用于在多线程环境下存储和获取当前线程的用户ID,每次发起请求的线程ID都不同
public class BaseContext {

    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
