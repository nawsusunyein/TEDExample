package com.example.tedexample;

import com.google.gson.annotations.SerializedName;

public class UsersModel {
    @SerializedName("name")
    public String username;
    @SerializedName("address")
    public AddressModel address;
    @SerializedName("phone")
    public String phone;
    @SerializedName("company")
    public CompanyModel companyInfo;

    UsersModel(String username,AddressModel address,String phone,CompanyModel companyInfo){
        this.username = username;
        this.address = address;
        this.phone = phone;
        this.companyInfo = companyInfo;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public AddressModel getAddress(){
        return address;
    }

    public void setAddress(AddressModel address){
        this.address = address;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public CompanyModel getCompanyInfo(){
        return companyInfo;
    }

    public void setCompanyInfo(CompanyModel companyInfo){
        this.companyInfo = companyInfo;
    }
}
