package com.yzy.updateapplib

import android.app.Service
import android.content.Intent
import android.os.IBinder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by WIN7-64 on 2017/5/24.
 */

class updateAppService : Service() {
    override fun onBind(p0: Intent?): IBinder?=null

    //单例
    companion object {
        var BASE_URL:String? = null
        private var mRetrofit: Retrofit? = null
        fun mRetrofit(): Retrofit = mRetrofit ?: Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    fun startDownLoad() {
        var retrofit: Retrofit

    }


}