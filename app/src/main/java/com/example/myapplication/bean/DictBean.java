package com.example.myapplication.bean;

import java.util.List;

/**
 * 公共配置字典实体类
 */
public class DictBean {

    /**
     * status : 0
     * msg : success
     * data : {"feedback":[],"repair":[{"id":13,"name":"测试物业保修"},{"id":14,"name":"房屋"},{"id":15,"name":"墙体"},{"id":16,"name":"地面"},{"id":17,"name":"家居"},{"id":18,"name":"电路"},{"id":19,"name":"电器"}],"repair_time":["09:00-12:00","12:00-15:00","15:00-18:00","18:00-21:00"],"common_phone":[{"title":"火警","phone":"119"},{"title":"匪警","phone":"110"},{"title":"急救中心","phone":"120"}]}
     */

    private int status;
    private String msg;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<?> feedback;
        private List<RepairBean> repair;
        private List<String> repair_time;
        private List<CommonPhoneBean> common_phone;

        public List<?> getFeedback() {
            return feedback;
        }

        public void setFeedback(List<?> feedback) {
            this.feedback = feedback;
        }

        public List<RepairBean> getRepair() {
            return repair;
        }

        public void setRepair(List<RepairBean> repair) {
            this.repair = repair;
        }

        public List<String> getRepair_time() {
            return repair_time;
        }

        public void setRepair_time(List<String> repair_time) {
            this.repair_time = repair_time;
        }

        public List<CommonPhoneBean> getCommon_phone() {
            return common_phone;
        }

        public void setCommon_phone(List<CommonPhoneBean> common_phone) {
            this.common_phone = common_phone;
        }

        public static class RepairBean {
            /**
             * id : 13
             * name : 测试物业保修
             */

            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class CommonPhoneBean {
            /**
             * title : 火警
             * phone : 119
             */

            private String title;
            private String phone;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }
        }
    }
}
