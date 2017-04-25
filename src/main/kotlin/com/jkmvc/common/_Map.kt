package com.jkmvc.common

/**
 * 获得map的某个值，如果值为空，则返回默认值
 */
public fun <K, V> Map<K, out V>?.getOrDefault(key:K, default:V? = null): V? {
    val value = this?.get(key)
    return if(value == null)
                default
            else
                value;
}