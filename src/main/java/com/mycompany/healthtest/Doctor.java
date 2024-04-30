/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthtest;

/**
 *
 * @author Youssef
 */
public class Doctor extends Person {
    protected String specialty;
 
    public Doctor() {
    }

    public Doctor(String specialty, int id, String name, String address, String phonenumber) {
        super(id, name, address, phonenumber);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

   
}
