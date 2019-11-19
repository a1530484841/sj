package com.aaa.sujiexiche.sj.entity;

public class yh_users {
    private Integer yh_id;
    private String  yh_name;
    private  String yh_img;
    private  String yh_sex;
    private String yh_phone;

    public Integer getYh_id() {
        return yh_id;
    }

    public void setYh_id(Integer yh_id) {
        this.yh_id = yh_id;
    }

    public String getYh_name() {
        return yh_name;
    }

    public void setYh_name(String yh_name) {
        this.yh_name = yh_name;
    }

    public String getYh_img() {
        return yh_img;
    }

    public void setYh_img(String yh_img) {
        this.yh_img = yh_img;
    }

    public String getYh_sex() {
        return yh_sex;
    }

    public void setYh_sex(String yh_sex) {
        this.yh_sex = yh_sex;
    }

    public String getYh_phone() {
        return yh_phone;
    }

    public void setYh_phone(String yh_phone) {
        this.yh_phone = yh_phone;
    }

    @Override
    public String toString() {
        return "yh_users{" +
                "yh_id=" + yh_id +
                ", yh_name='" + yh_name + '\'' +
                ", yh_img='" + yh_img + '\'' +
                ", yh_sex='" + yh_sex + '\'' +
                ", yh_phone='" + yh_phone + '\'' +
                '}';
    }
}
