package com.yzy.updateappdemo.Adapter.InterFace

import com.yzy.updateappdemo.Bean.LoginBean
import io.reactivex.Observable
import retrofit2.http.POST
import retrofit2.http.QueryMap

/**
 * Created by yzy on 17-6-7.
 */
interface LoginInterface {

    @POST("airCondition/app/login/login_fr")
    fun  getLogin(@QueryMap username:Map<String,String>): Observable<LoginBean>
}