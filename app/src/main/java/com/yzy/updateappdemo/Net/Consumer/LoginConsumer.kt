package com.yzy.updateappdemo.Adapter.Consumer

import android.util.Log
import com.yzy.updateappdemo.Bean.LoginBean
import io.reactivex.functions.Consumer


/**
 * Created by WIN7-64 on 2017/6/12.
 */
class LoginConsumer : Consumer<LoginBean> {


    override fun accept(p0: LoginBean?) {
        Log.e("CallBack"," body = " + p0.toString())

    }
}
