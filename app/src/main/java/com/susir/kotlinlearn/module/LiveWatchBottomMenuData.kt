package com.xmhaibao.live.model

import cn.taqu.lib.okhttp.model.IDoExtra
import cn.taqu.lib.okhttp.model.IResponseInfo
import hb.common.helper.HostHelper
import hb.utils.WebpUtils

/**
 * @auther SuZhanFeng
 * @date 2020/7/3
 * @desc
 */
class LiveWatchBottomMenuData : IDoExtra {
    var menu = mutableListOf<LiveWatchBottomMenuItem>()

    override fun doExtra(response: IResponseInfo<out IResponseInfo<*>>?) {
        for (item in menu) {
            item.icon = WebpUtils.getWebpUrl(item.icon, HostHelper.getInstance().hostImg)
            if (item.itemList.isEmpty()) {
                continue
            }
            for (child in item.itemList) {
                child.icon = WebpUtils.getWebpUrl(child.icon, HostHelper.getInstance().hostImg)
            }
        }
    }
}