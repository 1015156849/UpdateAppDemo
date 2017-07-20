package com.yzy.updateapplib

import android.content.Context
import android.util.Log

/**
 * Created by WIN7-64 on 2017/6/15.
 */
class updateAppInfoUtils {
    private var mContext: Context?=null

    fun hasNewVersion(mContext: Context,mUpdateAppVersion: String):Boolean{
        this.mContext = mContext
        var mLoaclVersion = getVersionName()
        if (!mLoaclVersion.isNullOrEmpty()){
            var compare:Int? = mLoaclVersion?.compareTo(mUpdateAppVersion)
            if(compare!=null&&compare<0){
                return true
            }
        }
        return false
    }

    private fun getVersionName(): String? {
        try {
            val manager = mContext?.getPackageManager()
            val info = manager?.getPackageInfo(mContext?.getPackageName(),
                    0)
            Log.e("updateAppUtils","info=" + info?.versionName.toString())
            val version = info?.versionName
            Log.e("updateAppUtils","本地版本号:" + version)
            return version
        } catch (e: Exception) {
            e.printStackTrace()
            return "无版本号"
        }

    }
}