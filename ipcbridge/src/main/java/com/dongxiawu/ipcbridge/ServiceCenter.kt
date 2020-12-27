package com.dongxiawu.ipcbridge

import java.util.concurrent.ConcurrentHashMap

object ServiceCenter {
    val serviceMap = ConcurrentHashMap<String, Any>()

}