package com.yzy.updateappdemo.Net.Consumer

import android.content.Context
import com.yzy.updateappdemo.Activity.MainActivity
import com.yzy.updateappdemo.Bean.JobLogListBean
import io.reactivex.functions.Consumer

/**
 * Created by Win7 on 2017/6/22.
 */
class JobLogListConsumer:Consumer<JobLogListBean> {

    var context: MainActivity? = null

    constructor(context: Context) {
        this.context= context as MainActivity
    }
    override fun accept(p0: JobLogListBean?) {
        if (p0?.result==0){
            context?.adapter?.setNewData(p0.logList)
        }
    }
}