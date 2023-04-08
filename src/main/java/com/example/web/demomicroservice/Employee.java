package com.example.web.demomicroservice;

import java.security.PublicKey;

public class Employee {

    public String name;
    public String title;

    public Employee() {
    }

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
