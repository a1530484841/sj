package com.aaa.sujiexiche.sj.entity;

import java.util.Date;

public class Yhorder {
    private Integer yh_orderid;
    private String yh_number;
    private String yh_newaddress;
    private String yh_xmfw;
    private String yh_carnumber;
    private Date yh_datetimebegin;
    private Date Yh_datetimeend;
    private String yh_bz;
    private String yh_style;
    private int yh_id;
    private int yg_id;
    private String yh_name;
    private String yg_name;
    private int xm_id;
    private int xcs_id;
    private String xcs_name;

    @Override
    public String toString() {
        return "Yhorder{" +
                "yh_orderid=" + yh_orderid +
                ", yh_number='" + yh_number + '\'' +
                ", yh_newaddress='" + yh_newaddress + '\'' +
                ", yh_xmfw='" + yh_xmfw + '\'' +
                ", yh_carnumber='" + yh_carnumber + '\'' +
                ", yh_datetimebegin=" + yh_datetimebegin +
                ", Yh_datetimeend=" + Yh_datetimeend +
                ", yh_bz='" + yh_bz + '\'' +
                ", yh_style='" + yh_style + '\'' +
                ", yh_id=" + yh_id +
                ", yg_id=" + yg_id +
                ", yh_name='" + yh_name + '\'' +
                ", yg_name='" + yg_name + '\'' +
                ", xm_id=" + xm_id +
                ", xcs_id=" + xcs_id +
                ", xcs_name='" + xcs_name + '\'' +
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

    public Date getYh_datetimebegin() {
        return yh_datetimebegin;
    }

    public void setYh_datetimebegin(Date yh_datetimebegin) {
        this.yh_datetimebegin = yh_datetimebegin;
    }

    public Date getYh_datetimeend() {
        return Yh_datetimeend;
    }

    public void setYh_datetimeend(Date yh_datetimeend) {
        Yh_datetimeend = yh_datetimeend;
    }

    public String getYh_bz() {
        return yh_bz;
    }

    public void setYh_bz(String yh_bz) {
        this.yh_bz = yh_bz;
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

    public int getXm_id() {
        return xm_id;
    }

    public void setXm_id(int xm_id) {
        this.xm_id = xm_id;
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
}
