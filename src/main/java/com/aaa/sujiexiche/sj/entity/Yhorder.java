package com.aaa.sujiexiche.sj.entity;

public class Yhorder {
    private Integer yh_orderid;
    private String yh_number;
    private String yh_newaddress;
    private String yh_xmfw;
    private String yh_carnumber;
    private String yh_timebegin;
    private String yh_timeend;
    private int yh_style;
    private int yh_id;
    private int yg_id;
    private String yh_name;
    private String yg_name;

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

    public String getYh_xmfw() {
        return yh_xmfw;
    }

    public void setYh_xmfw(String yh_xmfw) {
        this.yh_xmfw = yh_xmfw;
    }

    public String getYh_carnumber() {
        return yh_carnumber;
    }

    public void setYh_carnumber(String yh_carnumber) {
        this.yh_carnumber = yh_carnumber;
    }

    public String getYh_timebegin() {
        return yh_timebegin;
    }

    public void setYh_timebegin(String yh_timebegin) {
        this.yh_timebegin = yh_timebegin;
    }

    public String getYh_timeend() {
        return yh_timeend;
    }

    public void setYh_timeend(String yh_timeend) {
        this.yh_timeend = yh_timeend;
    }

    public int getYh_style() {
        return yh_style;
    }

    public void setYh_style(int yh_style) {
        this.yh_style = yh_style;
    }

    public int getYh_id() {
        return yh_id;
    }

    public void setYh_id(int yh_id) {
        this.yh_id = yh_id;
    }

    public int getYg_id() {
        return yg_id;
    }

    public void setYg_id(int yg_id) {
        this.yg_id = yg_id;
    }

    public String getYh_name() {
        return yh_name;
    }

    public void setYh_name(String yh_name) {
        this.yh_name = yh_name;
    }

    public String getYg_name() {
        return yg_name;
    }

    public void setYg_name(String yg_name) {
        this.yg_name = yg_name;
    }

    @Override
    public String toString() {
        return "Yhorder{" +
                "yh_orderid=" + yh_orderid +
                ", yh_number='" + yh_number + '\'' +
                ", yh_newaddress='" + yh_newaddress + '\'' +
                ", yh_xmfw='" + yh_xmfw + '\'' +
                ", yh_carnumber='" + yh_carnumber + '\'' +
                ", yh_timebegin='" + yh_timebegin + '\'' +
                ", yh_timeend='" + yh_timeend + '\'' +
                ", yh_style=" + yh_style +
                ", yh_id=" + yh_id +
                ", yg_id=" + yg_id +
                ", yh_name='" + yh_name + '\'' +
                ", yg_name='" + yg_name + '\'' +
                '}';
    }
}
