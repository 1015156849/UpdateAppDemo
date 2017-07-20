package com.yzy.updateappdemo.Adapter.Consumer

import com.yzy.updateappdemo.Adapter.bvh
import com.yzy.updateappdemo.Bean.JobLogListBean
import com.yzy.updateappdemo.Adapter.InterFace.RecycleView1Interface


/**
 * Created by Win7 on 2017/6/21.
 */
class RecycleView1Consumer:RecycleView1Interface {

    override fun convert(p0: bvh?, p1: JobLogListBean.LogListBean?) {
        p0?.tv1?.text=p1?.handoverUser
    }
}