package com.kuang.pojo;

public class User {
    private int mybatisid;
    private String name;
    private String wd;

    public User() {
    }

    public User(int mybatisid, String name, String wd) {
        this.mybatisid = mybatisid;
        this.name = name;
        this.wd = wd;
    }

    public int getMybatisid() {
        return mybatisid;
    }

    public void setMybatisid(int mybatisid) {
        this.mybatisid = mybatisid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    @Override
    public String toString() {
        return "User{" +
                "mybatisid=" + mybatisid +
                ", name='" + name + '\'' +
                ", wd='" + wd + '\'' +
                '}';
    }
}
