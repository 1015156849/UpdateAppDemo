package com.yzy.updateappdemo.Adapter


import android.view.View
import android.widget.TextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.yzy.updateappdemo.Bean.JobLogListBean
import com.yzy.updateappdemo.Adapter.InterFace.RecycleView1Interface
import com.yzy.updateappdemo.R
import com.yzy.updateappdemo.R.layout.toast_view_layout


/**
 * Created by Win7 on 2017/6/21.
 */
class RecycleViewAdapter : BaseQuickAdapter<JobLogListBean.LogListBean, bvh>(toast_view_layout) {
    var Interface :RecycleView1Interface?= null
    override fun convert(p0: bvh?, p1: JobLogListBean.LogListBean?) {
        Interface?.convert(p0, p1)

    }

}
class bvh(view: View?) : BaseViewHolder(view) {
    val tv1:TextView= view?.findViewById(R.id.tv1) as TextView
}