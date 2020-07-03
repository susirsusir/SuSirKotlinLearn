package com.susir.kotlinlearn.module

import com.google.gson.annotations.SerializedName


/**
 * @auther SuZhanFeng
 * @date 2020/7/3
 * @desc
 */
open class LivePlayFeatureItemBean {
    var action = ""
    var icon = ""
    var redirect = ""
    var title = ""
    @SerializedName("is_login")
    lateinit var isLogin: String

    fun isLogined(): Boolean {
        return "1".equals(isLogin)
    }

}

