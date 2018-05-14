package com.bestar.local.Base


/**
 * Created by lxx  on 2018/1/31
 */
abstract class BaseResponse : EndpointResponse() {
    fun succeeded():Boolean{
        return status == 200
    }

}