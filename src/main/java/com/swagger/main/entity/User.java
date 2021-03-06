package com.swagger.main.entity;

import java.util.Date;

/**
 * 描述：User 实体类
 * @author Xiao Pengwei
 * @since  2019-03-27
 */
public class User {
    private String id;
    private String username;
    private int age;
    private Date ctm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }
}


