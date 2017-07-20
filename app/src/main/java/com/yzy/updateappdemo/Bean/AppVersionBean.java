package com.yzy.updateappdemo.Bean;

/**
 * Created by WIN7-64 on 2017/6/15.
 */

public class AppVersionBean  {

    /**
     * RESULT : 0
     * REASON : 读取成功
     * fileParam : {"FILENAME":"win32_11gR2_client.apk","VER":"1.01","SIZE":5037522,"MEMO":"版本更新maintenance","COMPULSORY":0,"LINK":"http://192.168.20.13:8080/fileManage/fileUpload/downloadApp/win32_11gR2_client.apk "}
     */

    private int RESULT;
    private String REASON;
    private FileParamBean fileParam;

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

    public FileParamBean getFileParam() {
        return fileParam;
    }

    public void setFileParam(FileParamBean fileParam) {
        this.fileParam = fileParam;
    }

    public static class FileParamBean {
        /**
         * FILENAME : win32_11gR2_client.apk
         * VER : 1.01
         * SIZE : 5037522.0
         * MEMO : 版本更新maintenance
         * COMPULSORY : 0.0
         * LINK : http://192.168.20.13:8080/fileManage/fileUpload/downloadApp/win32_11gR2_client.apk
         */

        private String FILENAME;
        private String VER;
        private double SIZE;
        private String MEMO;
        private double COMPULSORY;
        private String LINK;

        public String getFILENAME() {
            return FILENAME;
        }

        public void setFILENAME(String FILENAME) {
            this.FILENAME = FILENAME;
        }

        public String getVER() {
            return VER;
        }

        public void setVER(String VER) {
            this.VER = VER;
        }

        public double getSIZE() {
            return SIZE;
        }

        public void setSIZE(double SIZE) {
            this.SIZE = SIZE;
        }

        public String getMEMO() {
            return MEMO;
        }

        public void setMEMO(String MEMO) {
            this.MEMO = MEMO;
        }

        public double getCOMPULSORY() {
            return COMPULSORY;
        }

        public void setCOMPULSORY(double COMPULSORY) {
            this.COMPULSORY = COMPULSORY;
        }

        public String getLINK() {
            return LINK;
        }

        public void setLINK(String LINK) {
            this.LINK = LINK;
        }
    }

    @Override
    public String toString() {
        return "AppVersionBean{" +
                "RESULT=" + RESULT +
                ", REASON='" + REASON + '\'' +
                ", fileParam=" + fileParam +
                '}';
    }
}
