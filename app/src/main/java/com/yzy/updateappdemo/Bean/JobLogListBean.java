package com.yzy.updateappdemo.Bean;

import java.util.List;

/**
 * Created by Win7 on 2017/6/22.
 */

public class JobLogListBean {

    /**
     * RESULT : 0
     * REASON : 查询成功
     * LogList : [{"jobLogPersons":[{"id":125002,"userId":12751,"userName":"孙八","joblogId":125001,"type":2},{"id":125003,"userId":12748,"userName":"钱七","joblogId":125001,"type":1}],"id":125001,"handoverUser":"2016-11-16 00:00:00"},{"jobLogPersons":[{"id":124866,"userId":12751,"userName":"孙八","joblogId":123830,"type":2},{"id":124867,"userId":12748,"userName":"钱七","joblogId":123830,"type":1}],"id":123830,"handoverUser":"2016-10-11 00:00:00"},{"jobLogPersons":[{"id":123828,"userId":69517,"userName":"维保3","joblogId":122795,"type":2},{"id":123829,"userId":74453,"userName":"班长2","joblogId":122795,"type":1}],"id":122795,"handoverUser":"2016-09-28 18:00:00"},{"jobLogPersons":[{"id":123803,"userId":12748,"userName":"钱七","joblogId":122914,"type":2},{"id":123804,"userId":12748,"userName":"钱七","joblogId":122914,"type":1},{"id":123801,"userId":12751,"userName":"孙八","joblogId":122914,"type":2},{"id":123802,"userId":48599,"userName":"维保1","joblogId":122914,"type":2}],"id":122914,"handoverUser":"2016-09-28 18:00:00"},{"jobLogPersons":[{"id":122799,"userId":74453,"userName":"班长2","joblogId":122798,"type":2},{"id":122800,"userId":69546,"userName":"维保6","joblogId":122798,"type":1}],"id":122798,"handoverUser":"2016-09-28 07:30:00"},{"jobLogPersons":[{"id":122563,"userId":12748,"userName":"钱七","joblogId":122562,"type":2},{"id":122564,"userId":12751,"userName":"孙八","joblogId":122562,"type":2},{"id":122565,"userId":12748,"userName":"钱七","joblogId":122562,"type":1},{"id":122566,"userId":12751,"userName":"孙八","joblogId":122562,"type":1}],"id":122562,"handoverUser":"2016-09-28 06:30:00"},{"jobLogPersons":[{"id":122806,"userId":74453,"userName":"班长2","joblogId":122805,"type":2},{"id":122807,"userId":69565,"userName":"维保8","joblogId":122805,"type":1}],"id":122805,"handoverUser":"2016-09-28 06:00:00"},{"jobLogPersons":[{"id":122802,"userId":69565,"userName":"维保8","joblogId":122801,"type":2},{"id":122803,"userId":74453,"userName":"班长2","joblogId":122801,"type":1}],"id":122801,"handoverUser":"2016-09-28 06:00:00"},{"jobLogPersons":[{"id":122552,"userId":12748,"userName":"钱七","joblogId":122551,"type":2},{"id":122553,"userId":12748,"userName":"钱七","joblogId":122551,"type":1},{"id":122554,"userId":12751,"userName":"孙八","joblogId":122551,"type":1}],"id":122551,"handoverUser":"2016-09-28 06:00:00"},{"jobLogPersons":[{"id":122556,"userId":12748,"userName":"钱七","joblogId":122555,"type":2},{"id":122557,"userId":12748,"userName":"钱七","joblogId":122555,"type":1},{"id":122558,"userId":12751,"userName":"孙八","joblogId":122555,"type":1}],"id":122555,"handoverUser":"2016-09-28 06:00:00"}]
     * TOTALPAGER : 5
     */

    private int RESULT;
    private String REASON;
    private int TOTALPAGER;
    private List<LogListBean> LogList;

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

    public int getTOTALPAGER() {
        return TOTALPAGER;
    }

    public void setTOTALPAGER(int TOTALPAGER) {
        this.TOTALPAGER = TOTALPAGER;
    }

    public List<LogListBean> getLogList() {
        return LogList;
    }

    public void setLogList(List<LogListBean> LogList) {
        this.LogList = LogList;
    }

    public static class LogListBean {
        /**
         * jobLogPersons : [{"id":125002,"userId":12751,"userName":"孙八","joblogId":125001,"type":2},{"id":125003,"userId":12748,"userName":"钱七","joblogId":125001,"type":1}]
         * id : 125001
         * handoverUser : 2016-11-16 00:00:00
         */

        private int id;
        private String handoverUser;
        private List<JobLogPersonsBean> jobLogPersons;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getHandoverUser() {
            return handoverUser;
        }

        public void setHandoverUser(String handoverUser) {
            this.handoverUser = handoverUser;
        }

        public List<JobLogPersonsBean> getJobLogPersons() {
            return jobLogPersons;
        }

        public void setJobLogPersons(List<JobLogPersonsBean> jobLogPersons) {
            this.jobLogPersons = jobLogPersons;
        }

        public static class JobLogPersonsBean {
            /**
             * id : 125002
             * userId : 12751
             * userName : 孙八
             * joblogId : 125001
             * type : 2
             */

            private int id;
            private int userId;
            private String userName;
            private int joblogId;
            private int type;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public int getJoblogId() {
                return joblogId;
            }

            public void setJoblogId(int joblogId) {
                this.joblogId = joblogId;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
