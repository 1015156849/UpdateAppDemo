package com.yzy.updateappdemo.Net.InterFace

import com.yzy.updateappdemo.Bean.JobLogListBean
import com.yzy.updateappdemo.Constent.MyURL
import io.reactivex.Observable
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * Created by Win7 on 2017/6/22.
 */
interface JobLogListInterface {
    @POST(MyURL.JOB_LOG_LIST_URL)
    fun getJobLogList(@Query("OrgId") OrgId:String, @Query("index") index:Int):Observable<JobLogListBean>
}