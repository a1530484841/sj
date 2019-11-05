package com.aaa.sujiexiche.sj.entity;

public class sys_role_permission {
    private Integer id;
    private String r_id;
    private String p_id;
    private sys_role sr;
    private sys_permission sp;

    @Override
    public String toString() {
        return "sys_role_permission{" +
                "id=" + id +
                ", r_id='" + r_id + '\'' +
                ", p_id='" + p_id + '\'' +
                ", sr=" + sr +
                ", sp=" + sp +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getR_id() {
        return r_id;
    }

    public void setR_id(String r_id) {
        this.r_id = r_id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public sys_role getSr() {
        return sr;
    }

    public void setSr(sys_role sr) {
        this.sr = sr;
    }

    public sys_permission getSp() {
        return sp;
    }

    public void setSp(sys_permission sp) {
        this.sp = sp;
    }
}
