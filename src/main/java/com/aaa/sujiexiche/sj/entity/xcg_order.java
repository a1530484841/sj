package com.aaa.sujiexiche.sj.entity;

public class xcg_order {
     private Integer xcg_id;
     private String xcg_number;
     private String xcg_yhname;
     private String xcg_phone;
     private String xcg_yhadress;
     private String xcg_yhxmfw;
     private String xcg_yhcarnumber;
     private String xcg_style;
     private int yg_id;

    @Override
    public String toString() {
        return "xcg_order{" +
                "xcg_id=" + xcg_id +
                ", xcg_number='" + xcg_number + '\'' +
                ", xcg_yhname='" + xcg_yhname + '\'' +
                ", xcg_phone='" + xcg_phone + '\'' +
                ", xcg_yhadress='" + xcg_yhadress + '\'' +
                ", xcg_yhxmfw='" + xcg_yhxmfw + '\'' +
                ", xcg_yhcarnumber='" + xcg_yhcarnumber + '\'' +
                ", xcg_style='" + xcg_style + '\'' +
                ", yg_id=" + yg_id +
                '}';
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

    public String getXcg_yhxmfw() {
        return xcg_yhxmfw;
    }

    public void setXcg_yhxmfw(String xcg_yhxmfw) {
        this.xcg_yhxmfw = xcg_yhxmfw;
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
}
