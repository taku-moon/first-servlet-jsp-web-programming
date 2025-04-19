package com.example.bean;

public class HelloBean {
    private String name;
    private String number;

    public HelloBean() {
        this.name = "No Name";
        this.number = "No Number";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
