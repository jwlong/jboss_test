package com.dxfjyygy.mdl;

import javax.swing.text.DateFormatter;
import java.io.Serializable;
import java.util.Date;
/**
 * Created by longjinwen on 11/07/2017.
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    private long id;
    private String name;
    private int  age;
    private String pwd;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Date createTime;
}
