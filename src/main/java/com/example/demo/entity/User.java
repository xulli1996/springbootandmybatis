package com.example.demo.entity;

import org.apache.ibatis.type.Alias;

@Alias(value = "sutdent")
public class User {
    private Long id = null;
    private  String username = null;
    private  String note = null;

    private SexEnum sex = null;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
