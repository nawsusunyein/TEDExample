package com.example.tedexample;

public class StudentListModel {

    private String name;
    private String phone;

    public StudentListModel(String name,String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName(){return name;}
    public String getPhone(){return phone;}
}
