package com.yzy.updateappdemo.Adapter.InterFace

import com.yzy.updateappdemo.Bean.AppVersionBean
import com.yzy.updateappdemo.Constent.MyURL
import io.reactivex.Observable
import retrofit2.http.POST

/**
 * Created by WIN7-64 on 2017/6/15.
 */
interface UpdateAppInterface {
    @POST(MyURL.UPDATE_APP_URL)
    fun getNewVersion(): Observable<AppVersionBean>
}