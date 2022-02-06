package com.example.pageforlog_in;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class user implements Serializable
{

    private String name;
    private String password;
    public user(){}
    public user(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getpassword()
    {
        return password;
    }

    public void setpassword(String password)
    {
        this.password = password;
    }