package com.aaa.sujiexiche.sj.entity;





public class UserOrder {
    private Integer yh_orderid;
    private String yh_number;
    private String yh_newaddress;
    private String yh_carnumber;
    private String yh_datetimebegin;
    private String Yh_datetimeend;
    private String yh_style;
    private int yh_id;
    private String yh_name;
    private int xcs_id;
    private String xcs_name;
    private String xcs_price;
    private String yh_phone;
    private String yh_bz;

    @Override
    public String toString() {
        return "UserOrder{" +
                "yh_orderid=" + yh_orderid +
                ", yh_number='" + yh_number + '\'' +
                ", yh_newaddress='" + yh_newaddress + '\'' +
                ", yh_carnumber='" + yh_carnumber + '\'' +
                ", yh_datetimebegin='" + yh_datetimebegin + '\'' +
                ", Yh_datetimeend='" + Yh_datetimeend + '\'' +
                ", yh_style='" + yh_style + '\'' +
                ", yh_id=" + yh_id +
                ", yh_name='" + yh_name + '\'' +
                ", xcs_id=" + xcs_id +
                ", xcs_name='" + xcs_name + '\'' +
                ", xcs_price='" + xcs_price + '\'' +
                ", yh_phone='" + yh_phone + '\'' +
                ", yh_bz='" + yh_bz + '\'' +
                '}';
    }

    public Integer getYh_orderid() {
        return yh_orderid;
    }

    public void setYh_orderid(Integer yh_orderid) {
        this.yh_orderid = yh_orderid;
    }

    public String getYh_number() {
        return yh_number;
    }

    public void setYh_number(String yh_number) {
        this.yh_number = yh_number;
    }

    public String getYh_newaddress() {
        return yh_newaddress;
    }

    public void setYh_newaddress(String yh_newaddress) {
        this.yh_newaddress = yh_newaddress;
    }

    public String getYh_carnumber() {
        return yh_carnumber;
    }

    public void setYh_carnumber(String yh_carnumber) {
        this.yh_carnumber = yh_carnumber;
    }

    public String getYh_datetimebegin() {
        return yh_datetimebegin;
    }

    public void setYh_datetimebegin(String yh_datetimebegin) {
        this.yh_datetimebegin = yh_datetimebegin;
    }

    public String getYh_datetimeend() {
        return Yh_datetimeend;
    }

    public void setYh_datetimeend(String yh_datetimeend) {
        Yh_datetimeend = yh_datetimeend;
    }

    public String getYh_style() {
        return yh_style;
    }

    public void setYh_style(String yh_style) {
        this.yh_style = yh_style;
    }

    public int getYh_id() {
        return yh_id;
    }

    public void setYh_id(int yh_id) {
        this.yh_id = yh_id;
    }

    public String getYh_name() {
        return yh_name;
    }

    public void setYh_name(String yh_name) {
        this.yh_name = yh_name;
    }

    public int getXcs_id() {
        return xcs_id;
    }

    public void setXcs_id(int xcs_id) {
        this.xcs_id = xcs_id;
    }

    public String getXcs_name() {
        return xcs_name;
    }

    public void setXcs_name(String xcs_name) {
        this.xcs_name = xcs_name;
    }

    public String getXcs_price() {
        return xcs_price;
    }

    public void setXcs_price(String xcs_price) {
        this.xcs_price = xcs_price;
    }

    public String getYh_phone() {
        return yh_phone;
    }

    public void setYh_phone(String yh_phone) {
        this.yh_phone = yh_phone;
    }

    public String getYh_bz() {
        return yh_bz;
    }

    public void setYh_bz(String yh_bz) {
        this.yh_bz = yh_bz;
    }
}
