package com.bestar.local.model.request

import android.content.Context
import com.bestar.local.Base.BaseListRequest
import com.net.app.interfaces.RequestConfig

/**
 * Created by lxx  on 2018/1/31
 */
@RequestConfig(path = "found.do")
class GetSceneryDataRequest : BaseListRequest() {
     var userId:String = ""
     var act:String = "my_found"

}