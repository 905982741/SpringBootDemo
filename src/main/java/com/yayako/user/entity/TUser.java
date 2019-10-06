package com.yayako.user.entity;

import jdk.nashorn.internal.objects.annotations.Setter;

import javax.xml.ws.BindingType;
import java.io.Serializable;

public class TUser implements Serializable {

    private static final long serialVersionUID = 1000055116882394604L;

    private Integer uid;

    private String uname;

    private String pwd;

    private Integer age;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                '}';
    }
}