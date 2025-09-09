package com.alfredo.springboot.webapp.springboot_web.models;

public class User {
    private String name;
    private String lastname;

    private String email;

    public User(String name,String lastname, String email){
        this.name=name;
        this.lastname=lastname;
        this.email=email;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getLastname(){
       return this.lastname;
    }

    public void setLastname(String lastname){
        this.lastname=lastname;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return this.email;
    }
}