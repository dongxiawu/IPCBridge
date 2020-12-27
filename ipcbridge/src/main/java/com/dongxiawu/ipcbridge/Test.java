package com.dongxiawu.ipcbridge;

import android.util.Pair;

import java.lang.reflect.Proxy;

public class Test {
    public static <T> T getService(Class<T> serviceInterfaceClass, Pair<String, Object>... parameters) throws IPCException {
        return null;
    }

    private static <T> T getProxy(Call call) {
        T proxy = (T) Proxy.newProxyInstance(call.service.getClass().getClassLoader(), new Class[]{call.service.getClass()}, new MethodInvokeHandler());
        return proxy;
    }
}
