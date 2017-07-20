package com.yzy.updateappdemo.CallBack

import android.util.Log
import com.yzy.updateappdemo.Bean.LoginBean
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by yzy on 17-6-7.
 */
class LoginCallback: Callback<LoginBean> {
    override fun onResponse(call: Call<LoginBean>, response: Response<LoginBean>) {
//        Log.e("CallBack","1")
        Log.e("CallBack"," URL = "+response.raw().networkResponse()?.request()?.url()+" body = " + response.body().toString())
//        Toast.makeText(MainActivity().applicationContext,"response?.body().toString() = "+response?.body().toString(),1).show()
    }

    override fun onFailure(call: Call<LoginBean>?, t: Throwable?) {

    }
}