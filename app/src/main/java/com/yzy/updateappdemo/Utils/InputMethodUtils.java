package com.yzy.updateappdemo.Utils;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by WIN7-64 on 2016/9/18.
 */
public class InputMethodUtils {

    static InputMethodManager imm=null;
    static Context Context=null;

    public static void  Hide(Context mContext, EditText editText) {
        L.e("Context==null "+(Context==null)+"  Context!=mContext  "+(Context!=mContext)+"   editText!=null  "+(editText!=null));

        if (Context==null){
            Context=mContext;
        }
            imm=(InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);

        if (editText!=null){
            imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }

    }
}
