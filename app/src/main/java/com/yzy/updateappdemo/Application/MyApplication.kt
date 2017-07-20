package com.yzy.updateappdemo.Application

import android.app.Application
import com.yzy.updateappdemo.Constent.MyURL
import com.yzy.updateapplib.updateAppUtils


/**
 * Created by yzy on 17-6-7.
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        init()
    }

    fun init() {
        //http://minxinliu.iask.in:12218/airCondition/app/login/login_fr?UserName=123&PassWord=123&SignleID=1
        updateAppUtils.mInstance(MyURL.BASE_URL)?.init()
    }
}