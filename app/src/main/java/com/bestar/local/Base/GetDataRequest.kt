package com.bestar.local.Base

import android.content.Context
import com.bestar.local.BuildConfig
import com.net.app.request.NetRequest
import okhttp3.Headers

/**
 * Created by lxx  on 2018/1/31
 */
open class GetDataRequest : NetRequest(){

    override fun getHeaders(): Headers {
        var builder = Headers.Builder()
        var superBuilder = super.getHeaders()
        for (key in superBuilder.names()){
            builder.add(key,superBuilder.get(key))
        }
        builder.add("Content-Type","application/x-www-form-urlencoded")
        return builder.build()
    }

    override fun getHost(): String {
        return BuildConfig.API_SCENERY
    }
}