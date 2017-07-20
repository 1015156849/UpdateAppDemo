package com.yzy.updateappdemo.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import com.yzy.updateappdemo.Adapter.RecycleViewAdapter
import com.yzy.updateappdemo.Bean.AppVersionBean
import com.yzy.updateappdemo.Constent.MyURL
import com.yzy.updateappdemo.Adapter.Consumer.RecycleView1Consumer
import com.yzy.updateappdemo.Adapter.Consumer.UpdateAppConsumer
import com.yzy.updateappdemo.Adapter.InterFace.UpdateAppInterface
import com.yzy.updateappdemo.Bean.JobLogListBean
import com.yzy.updateappdemo.Net.Consumer.JobLogListConsumer
import com.yzy.updateappdemo.Net.InterFace.JobLogListInterface
import com.yzy.updateappdemo.R
import com.yzy.updateapplib.updateAppUtils
//import com.yzy.updateapplib.updateAppUtils
import io.reactivex.android.schedulers.AndroidSchedulers

import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toast_view_layout.*
import kotlinx.android.synthetic.main.toast_view_layout.view.*


class MainActivity : AppCompatActivity() {

    var adapter: RecycleViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        adapterTest()

//        try{
//           val mLoginInterface = updateAppUtils.mInstance(MyURL.BASE_URL)?.mRetrofit()?.create(LoginInterface::class.java)
//           val map = HashMap<String,String>()
//           map.set("UserName","Jishuzhuguan")
//           map.set("PassWord","111111")
//           var call: Observable<LoginBean>? = mLoginInterface?.getLogin(map)
//           call?.subscribeOn(Schedulers.io())
//                   ?.observeOn(AndroidSchedulers.mainThread())
//                   ?.subscribe(LoginConsumer())
//
//       }catch (e:Exception){
//           e.printStackTrace()
//       }

//        try {
//            val mUpdateAppInterface = updateAppUtils.mInstance(MyURL.BASE_URL)?.mRetrofit()?.create(UpdateAppInterface::class.java)
//            var call: Observable<AppVersionBean>? = mUpdateAppInterface?.getNewVersion()
//            call?.subscribeOn(Schedulers.io())
//                    ?.observeOn(AndroidSchedulers.mainThread())
//                    ?.subscribe(UpdateAppConsumer(this@MainActivity))
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }

//        try {
//            val mJobLogListInterface = updateAppUtils.mInstance(MyURL.BASE_URL)?.mRetrofit()?.create(JobLogListInterface::class.java)
//            var call: Observable<JobLogListBean>? = mJobLogListInterface?.getJobLogList("830",1)
//            call?.subscribeOn(Schedulers.io())
//                    ?.observeOn(AndroidSchedulers.mainThread())
//                    ?.subscribe(JobLogListConsumer(this@MainActivity))
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }

//        toastDemo()

        var str ="1|2|3|4"
        var list=str.split("|") as MutableList
        list.removeAt(1)

        Log.e("LIST","list = "+list.toString())
    }

    fun toastDemo() {
        var layout = layoutInflater.inflate(R.layout.toast_view_layout, rootLayout)
        layout.tv1.text = "这是一个自定义toast"
        var toast = Toast(this)
        toast.view = layout
        toast.duration = Toast.LENGTH_LONG
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

    fun adapterTest() {
        recycleView.setLayoutManager(LinearLayoutManager(recycleView.getContext()))
        adapter = RecycleViewAdapter()
        adapter?.Interface = RecycleView1Consumer()
        recycleView.adapter = adapter

    }

}