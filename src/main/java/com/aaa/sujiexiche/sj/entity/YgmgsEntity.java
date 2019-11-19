package com.aaa.sujiexiche.sj.entity;

public class YgmgsEntity {
    private Integer yg_id;
    private String yg_name;
    private String yg_phone;
    private String yg_newaddress;
    private String yg_style;
    private String yg_area;

    @Override
    public String toString() {
        return "YgmgsEntity{" +
                "yg_id=" + yg_id +
                ", yg_name='" + yg_name + '\'' +
                ", yg_phone='" + yg_phone + '\'' +
                ", yg_newaddress='" + yg_newaddress + '\'' +
                ", yg_style='" + yg_style + '\'' +
                ", yg_area='" + yg_area + '\'' +
                '}';
    }

    public Integer getYg_id() {
        return yg_id;
    }

    public void setYg_id(Integer yg_id) {
        this.yg_id = yg_id;
    }

    public String getYg_name() {
        return yg_name;
    }

    public void setYg_name(String yg_name) {
        this.yg_name = yg_name;
    }

    public String getYg_phone() {
        return yg_phone;
    }

    public void setYg_phone(String yg_phone) {
        this.yg_phone = yg_phone;
    }

    public String getYg_newaddress() {
        return yg_newaddress;
    }

    public void setYg_newaddress(String yg_newaddress) {
        this.yg_newaddress = yg_newaddress;
    }

    public String getYg_style() {
        return yg_style;
    }

    public void setYg_style(String yg_style) {
        this.yg_style = yg_style;
    }

    public String getYg_area() {
        return yg_area;
    }

    public void setYg_area(String yg_area) {
        this.yg_area = yg_area;
    }
}
