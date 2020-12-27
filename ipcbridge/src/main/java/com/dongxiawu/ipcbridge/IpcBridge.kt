package com.dongxiawu.ipcbridge

import android.app.Application
import android.util.Pair
import java.lang.reflect.Proxy

object IpcBridge {

    fun init(application: Application) {

    }

    @Throws(IPCException::class)
    fun <T> getService(serviceInterfaceClass: Class<T>, vararg parameters: Pair<String, Any>?): T? {
        return null
    }

    @SuppressWarnings("Unchecked cast")
    private fun <T> getProxy(call: Call): T {
        return Proxy.newProxyInstance(call.service.javaClass.classLoader,  arrayOf(call.service.javaClass), MethodInvokeHandler()) as T
    }
}