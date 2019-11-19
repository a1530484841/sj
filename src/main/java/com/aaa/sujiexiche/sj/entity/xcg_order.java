package com.aaa.sujiexiche.sj.entity;



public class xcg_order {
     private Integer xcg_id;
     private String xcg_number;
     private String xcg_yhname;
     private String xcg_phone;
     private String xcg_yhadress;
     private String xcg_yhxmfw;
     private String xcg_datetimebegin;
     private String xcg_datetimeend;
     private String xcs_price;
     private String xcg_yhcarnumber;
     private String xcg_style;
     private int yg_id;
     private String yg_name;
     private String xcs_datetime;
     private String xcs_bz;
     private String month;
     private int total;
     private int sumprice;
     private String thisdate;
     private double yg_sumprice;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSumprice() {
        return sumprice;
    }

    public void setSumprice(int sumprice) {
        this.sumprice = sumprice;
    }

    public String getThisdate() {
        return thisdate;
    }

    public void setThisdate(String thisdate) {
        this.thisdate = thisdate;
    }

    public double getYg_sumprice() {
        return yg_sumprice;
    }

    public void setYg_sumprice(double yg_sumprice) {
        this.yg_sumprice = yg_sumprice;
    }

    @Override
    public String toString() {
        return "xcg_order{" +
                "xcg_id=" + xcg_id +
                ", xcg_number='" + xcg_number + '\'' +
                ", xcg_yhname='" + xcg_yhname + '\'' +
                ", xcg_phone='" + xcg_phone + '\'' +
                ", xcg_yhadress='" + xcg_yhadress + '\'' +
                ", xcg_yhxmfw='" + xcg_yhxmfw + '\'' +
                ", xcg_datetimebegin='" + xcg_datetimebegin + '\'' +
                ", xcg_datetimeend='" + xcg_datetimeend + '\'' +
                ", xcs_price='" + xcs_price + '\'' +
                ", xcg_yhcarnumber='" + xcg_yhcarnumber + '\'' +
                ", xcg_style='" + xcg_style + '\'' +
                ", yg_id=" + yg_id +
                ", yg_name='" + yg_name + '\'' +
                ", xcs_datetime='" + xcs_datetime + '\'' +
                ", xcs_bz='" + xcs_bz + '\'' +
                ", month='" + month + '\'' +
                ", total=" + total +
                ", sumprice=" + sumprice +
                ", thisdate='" + thisdate + '\'' +
                ", yg_sumprice=" + yg_sumprice +
                '}';
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }


    public String getXcg_yhxmfw() {
        return xcg_yhxmfw;
    }

    public void setXcg_yhxmfw(String xcg_yhxmfw) {
        this.xcg_yhxmfw = xcg_yhxmfw;
    }

    public Integer getXcg_id() {
        return xcg_id;
    }

    public void setXcg_id(Integer xcg_id) {
        this.xcg_id = xcg_id;
    }

    public String getXcg_number() {
        return xcg_number;
    }

    public void setXcg_number(String xcg_number) {
        this.xcg_number = xcg_number;
    }

    public String getXcg_yhname() {
        return xcg_yhname;
    }

    public void setXcg_yhname(String xcg_yhname) {
        this.xcg_yhname = xcg_yhname;
    }

    public String getXcg_phone() {
        return xcg_phone;
    }

    public void setXcg_phone(String xcg_phone) {
        this.xcg_phone = xcg_phone;
    }

    public String getXcg_yhadress() {
        return xcg_yhadress;
    }

    public void setXcg_yhadress(String xcg_yhadress) {
        this.xcg_yhadress = xcg_yhadress;
    }

    public String getXcg_datetimebegin() {
        return xcg_datetimebegin;
    }

    public void setXcg_datetimebegin(String xcg_datetimebegin) {
        this.xcg_datetimebegin = xcg_datetimebegin;
    }

    public String getXcg_datetimeend() {
        return xcg_datetimeend;
    }

    public void setXcg_datetimeend(String xcg_datetimeend) {
        this.xcg_datetimeend = xcg_datetimeend;
    }

    public String getXcs_price() {
        return xcs_price;
    }

    public void setXcs_price(String xcs_price) {
        this.xcs_price = xcs_price;
    }

    public String getXcg_yhcarnumber() {
        return xcg_yhcarnumber;
    }

    public void setXcg_yhcarnumber(String xcg_yhcarnumber) {
        this.xcg_yhcarnumber = xcg_yhcarnumber;
    }

    public String getXcg_style() {
        return xcg_style;
    }

    public void setXcg_style(String xcg_style) {
        this.xcg_style = xcg_style;
    }

    public int getYg_id() {
        return yg_id;
    }

    public void setYg_id(int yg_id) {
        this.yg_id = yg_id;
    }

    public String getYg_name() {
        return yg_name;
    }

    public void setYg_name(String yg_name) {
        this.yg_name = yg_name;
    }

    public String getXcs_datetime() {
        return xcs_datetime;
    }

    public void setXcs_datetime(String xcs_datetime) {
        this.xcs_datetime = xcs_datetime;
    }

    public String getXcs_bz() {
        return xcs_bz;
    }

    public void setXcs_bz(String xcs_bz) {
        this.xcs_bz = xcs_bz;
    }
}
