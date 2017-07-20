package com.yzy.updateapplib

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import java.util.concurrent.TimeUnit


/**
 * Created by WIN7-64 on 2017/5/24.
 */
class updateAppUtils {
     val DEFAULT_TIMEOUT = 10L
    //单例
    companion object{
        var BASE_URL:String? = null
        private var mInstance : updateAppUtils? = null
        fun mInstance(BASE_URL:String): updateAppUtils? {
            if(mInstance==null){
                mInstance =  updateAppUtils()
                this.BASE_URL = BASE_URL
            }
            return mInstance

        }


    }


    var mRetrofit: Retrofit ?= null
    fun mRetrofit():Retrofit? {
        val httpClientBuilder = OkHttpClient.Builder()
        httpClientBuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
        if(mRetrofit==null){
            mRetrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(httpClientBuilder.build())
                    .build();
        }
        return mRetrofit
    }

    fun init(){
        mRetrofit()
    }





}


