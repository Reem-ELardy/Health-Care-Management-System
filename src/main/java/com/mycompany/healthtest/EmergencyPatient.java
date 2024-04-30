/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthtest;

/**
 *
 * @author Youssef
 */
public class EmergencyPatient extends Patient {
    private int Roomnumber;

    public EmergencyPatient(int Roomnumber) {
        this.Roomnumber = Roomnumber;
    }

    public EmergencyPatient(int Roomnumber, String gender, String symptoms, String paymentmethod, String diagnosis, int id, String name, String address, String phonenumber) {
        super(gender, symptoms, paymentmethod, diagnosis, id, name, address, phonenumber);
        this.Roomnumber = Roomnumber;
    }

    public EmergencyPatient() {
    }

    @Override
    public int getRoomnumber() {
        return Roomnumber;
    }

   
    @Override
    public void setRoomnumber(int Roomnumber) {
        this.Roomnumber = Roomnumber;
    }

    
}
