/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthtest;

/**
 *
 * @author Youssef
 */
public abstract class Person {
    protected int id;
    protected String name;
    protected String address;
    protected String phonenumber;

    public Person() {
    }

    public Person(int id, String name, String address, String phonenumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

  
    public String getName() {
        return name;
    }

  
    public void setName(String name) {
        this.name = name;
    }

 
    public String getAddress() {
        return address;
    }

   
    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
