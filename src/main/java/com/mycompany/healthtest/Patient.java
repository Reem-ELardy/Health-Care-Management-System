/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthtest;

import java.util.Arrays;

/**
 *
 * @author Youssef
 */
public abstract class Patient extends Person {

    private String gender;
    private String symptoms;
    private String paymentmethod;
    private String diagnosis;
    private int Roomnumber;
  

    public Patient() {
    }


    public Patient(String gender, String symptoms, String paymentmethod, String diagnosis, int id, String name, String address, String phonenumber) {
        super(id, name, address, phonenumber);
        this.gender = gender;
        this.symptoms = symptoms;
        this.paymentmethod = paymentmethod;
        this.diagnosis = diagnosis;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    
    public int getRoomnumber() {
        return Roomnumber;
    }

    public void setRoomnumber(int Roomnumber) {
        this.Roomnumber = Roomnumber;
    } 
}
