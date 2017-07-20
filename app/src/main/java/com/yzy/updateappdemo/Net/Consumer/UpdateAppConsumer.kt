package com.yzy.updateappdemo.Adapter.Consumer

import android.content.Context
import com.yzy.updateappdemo.Activity.MainActivity
import com.yzy.updateappdemo.Bean.AppVersionBean
import com.yzy.updateappdemo.Utils.L
import io.reactivex.functions.Consumer

/**
 * Created by WIN7-64 on 2017/6/15.
 */
class UpdateAppConsumer() :Consumer<AppVersionBean> {

    var context: MainActivity? = null

    constructor(context: Context):this() {
        this.context= context as MainActivity
    }
    override fun accept(p0: AppVersionBean?) {
        L.e("bean = "+p0.toString());
        var list = listOf(p0)

//        context?.adapter?.setNewData(list)
    }
}