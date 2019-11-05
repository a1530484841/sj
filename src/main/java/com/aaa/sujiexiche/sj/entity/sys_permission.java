package com.aaa.sujiexiche.sj.entity;

public class sys_permission {
    private Integer p_id;
    private String p_name;
    private String type;
    private String url;
    private String percode;
    private Integer parentid;//父节点id
    private String parentids;//父节点id列表串
    private String sortstring;//排序号
    private String available;//是否可用

    @Override
    public String toString() {
        return "sys_permission{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", percode='" + percode + '\'' +
                ", parentid=" + parentid +
                ", parentids='" + parentids + '\'' +
                ", sortstring='" + sortstring + '\'' +
                ", available='" + available + '\'' +
                '}';
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getParentids() {
        return parentids;
    }

    public void setParentids(String parentids) {
        this.parentids = parentids;
    }

    public String getSortstring() {
        return sortstring;
    }

    public void setSortstring(String sortstring) {
        this.sortstring = sortstring;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
