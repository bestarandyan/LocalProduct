package com.bestar.local.Base

import android.content.Context

/**
 * Created by lxx  on 2018/1/31
 */
open class BaseListRequest : GetDataRequest() {

    open var page:Int = 0
    open var pageSize:Int = 0

}