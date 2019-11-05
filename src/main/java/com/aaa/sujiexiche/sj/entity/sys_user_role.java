package com.aaa.sujiexiche.sj.entity;

public class sys_user_role {
    private Integer id;
    private String u_id;
    private String r_id;
    private sys_role sr;
    private sys_user su;

    @Override
    public String toString() {
        return "sys_user_role{" +
                "id='" + id + '\'' +
                ", u_id='" + u_id + '\'' +
                ", r_id='" + r_id + '\'' +
                ", sr=" + sr +
                ", su=" + su +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getR_id() {
        return r_id;
    }

    public void setR_id(String r_id) {
        this.r_id = r_id;
    }

    public sys_role getSr() {
        return sr;
    }

    public void setSr(sys_role sr) {
        this.sr = sr;
    }

    public sys_user getSu() {
        return su;
    }

    public void setSu(sys_user su) {
        this.su = su;
    }
}
