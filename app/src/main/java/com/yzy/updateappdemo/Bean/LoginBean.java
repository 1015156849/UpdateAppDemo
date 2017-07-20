package com.yzy.updateappdemo.Bean;

/**
 * Created by yzy on 17-6-7.
 */

public class LoginBean {

    /**
     * RESULT : 1
     * REASON : 登录标识不能为空
     */

    private int RESULT;
    private String REASON;

    public int getRESULT() {
        return RESULT;
    }

    public void setRESULT(int RESULT) {
        this.RESULT = RESULT;
    }

    public String getREASON() {
        return REASON;
    }

    public void setREASON(String REASON) {
        this.REASON = REASON;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "RESULT=" + RESULT +
                ", REASON='" + REASON + '\'' +
                '}';
    }
}
