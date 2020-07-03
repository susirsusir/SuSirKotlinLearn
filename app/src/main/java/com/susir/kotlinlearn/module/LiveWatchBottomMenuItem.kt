package com.xmhaibao.live.model

import com.susir.kotlinlearn.module.LivePlayFeatureItemBean

/**
 * @auther SuZhanFeng
 * @date 2020/7/3
 * @desc
 */
class LiveWatchBottomMenuItem() : LivePlayFeatureItemBean() {
    var type = ""
    var itemList =  mutableListOf<LivePlayFeatureItemBean>()
}