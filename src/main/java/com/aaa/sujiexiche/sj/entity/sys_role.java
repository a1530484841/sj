package com.aaa.sujiexiche.sj.entity;

public class sys_role {
    private Integer r_id;
    private String r_name;
    private String available;

    @Override
    public String toString() {
        return "sys_role{" +
                "r_id='" + r_id + '\'' +
                ", r_name='" + r_name + '\'' +
                ", available='" + available + '\'' +
                '}';
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
