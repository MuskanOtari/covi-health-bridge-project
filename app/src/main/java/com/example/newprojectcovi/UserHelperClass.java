package com.example.newprojectcovi;



public class UserHelperClass {



        String name,password,email,address,symptoms,bldgroup,age,mobile,aadhar;

        public UserHelperClass() {


        }

    public UserHelperClass(String name, String password, String email, String address, String symptoms, String bldgroup, String age, String mobile, String aadhar) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.symptoms = symptoms;
        this.bldgroup = bldgroup;
        this.age = age;
        this.mobile = mobile;
        this.aadhar = aadhar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getBldgroup() {
        return bldgroup;
    }

    public void setBldgroup(String bldgroup) {
        this.bldgroup = bldgroup;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }
}