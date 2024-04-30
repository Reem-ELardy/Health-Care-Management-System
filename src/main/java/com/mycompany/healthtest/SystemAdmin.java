/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthtest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Youssef
 */
public class SystemAdmin {
   static ArrayList <Doctor> doctors = new ArrayList();
   static ArrayList<Patient> patients = new ArrayList();
   static ArrayList<EmergencyPatient> EmPatients = new ArrayList();
   static ArrayList<NormalPatient> NormPatients = new ArrayList();
   static  ArrayList<Appointment> appointments =new ArrayList();

    public SystemAdmin() {
    }
    
    //Emergency patients dumy Data
    protected static void patientsdata(){
        String symptom0="Cough";
        String symptom1 = "pain, dizzines";
        EmergencyPatient p0 = new EmergencyPatient(20,"Male",symptom0,"visa","cancer",190,"hesham","assiut","012523");
        EmergencyPatient p1 = new EmergencyPatient(23,"Female",symptom1,"cash","corona",193,"jennifer","London","45523");
        patients.add(p0);
        patients.add(p1);
        EmPatients.add(p0);
        EmPatients.add(p1);
    }
    
    
    public static void DisplayEmergencyPatients(){
        if(SystemAdmin.EmPatients.isEmpty()){
            SystemAdmin.patientsdata();
        }
        if(patients.isEmpty()){
            System.out.println("There's no available data for patients");
        }
        else{
            GUI9.main();
            System.out.println("Name        Gender        ID        Room number        Diagnosis        Symptoms");
            for(EmergencyPatient patient: EmPatients){
                System.out.print(patient.getName()+"        "+ patient.getGender()+"        " +patient.getId()+"        "+patient.getRoomnumber()+"          "+patient.getDiagnosis()+"          "+patient.getSymptoms());
                System.out.println(" ");
            }
        }
    } 
    
    //Normal patients dumy Data
    protected static void Normalpatientsdata(){
        String symptom0="Cough";
        String symptom1 ="pain, dizzines";
        NormalPatient p0 = new NormalPatient("Male",symptom0,"visa","cancer",122,"Jemmy","assiut","012523");
        NormalPatient p1 = new NormalPatient("Female",symptom1,"cash","corona",187,"Helena","London","45523");
        patients.add(p0);
        patients.add(p1);
        NormPatients.add(p0);
        NormPatients.add(p1);
    }
    
    public static void DisplayNormalPatients(){
        if(SystemAdmin.NormPatients.isEmpty()){
            SystemAdmin.Normalpatientsdata();
        }
        if(patients.isEmpty()){
            System.out.println("There's no available data for patients");
        }
        else{
            GUI8.main();
            System.out.println("Name        Gender        ID             Diagnosis        Symptoms");
            for(NormalPatient patient: NormPatients){
                System.out.print(patient.getName()+"        "+ patient.getGender()+"        " +patient.getId()+"                  "+patient.getDiagnosis()+"           "+patient.getSymptoms());    
                System.out.println(" ");
            }
        }
    }
    
    public static void AddPatient(){
        if(SystemAdmin.NormPatients.isEmpty()){
            SystemAdmin.Normalpatientsdata();
        }
        
        if(SystemAdmin.EmPatients.isEmpty()){
            SystemAdmin.patientsdata();
        }
         
        Scanner input = new Scanner(System.in).useDelimiter("\n");

  
        System.out.println("Is the Patient's Situation: \n 1-Emergency \n 2-Normal");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                EmergencyPatient P = new EmergencyPatient();
                System.out.println("Enter The patient Name: ");
                P.setName(input.next());
                System.out.println("Enter The Patient id: ");
                P.setId(input.nextInt());
                System.out.println("Enter The Patient Diagnosis: ");
                P.setDiagnosis(input.next());
                System.out.println("Enter The Patient phonenumber: ");
                P.setPhonenumber(input.next());
                System.out.println("Enter The Patient Address : ");
                P.setAddress(input.next());
                System.out.println("Enter The Patient gender : ");
                P.setGender(input.next());
                System.out.println("Enter The Patient room : ");
                P.setRoomnumber(input.nextInt());
                System.out.println("Enter The Patient Payment method: ");
                String PaymentMethod = input.next();
                System.out.println("Enter The Patient Symptoms: ");
                P.setSymptoms(input.next());

                SystemAdmin.patients.add(P);
                SystemAdmin.EmPatients.add(P);
            break;
            
            case 2 :
                NormalPatient p1 = new NormalPatient();
                System.out.println("Enter The patient Name: ");
                p1.setName(input.next());
                System.out.println("Enter The Patient id: ");
                p1.setId(input.nextInt());
                System.out.println("Enter The Patient Diagnosis: ");
                p1.setDiagnosis(input.next());
                System.out.println("Enter The Patient phonenumber: ");
                p1.setPhonenumber(input.next());
                System.out.println("Enter The Patient Address : ");
                p1.setAddress(input.next());
                System.out.println("Enter The Patient gender : ");
                p1.setGender(input.next());
                System.out.println("Enter The Patient Payment method: ");
                String PaymentMethod1 = input.next();
                System.out.println("Enter The Patient Symptoms: ");
                p1.setSymptoms(input.next());

                
                SystemAdmin.patients.add(p1);
                SystemAdmin.NormPatients.add(p1);
            break;

        }
    }
     
    public static void editPatient(){ 
        boolean edit =true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Patient's Id: ");
        Patient oldpatient = SystemAdmin.getPatientWithId(input.nextInt());
        if(oldpatient == null){
            System.out.println("No Patient With this id");
        }
        else{
            while(edit==true){
                System.out.println("--------Select your Option-------");
                System.out.println(" 1-Edit Patients Name \n 2-Edit Patient's payment method \n 3-Edit Patient's Address \n 4-Edit Patient's Phone Number \n 5-Edit Patient's ID \n 6-Edit Patient's Room number \n 7-Edit Patient's gender \n 8-Edit Patient's Symptoms \n 9-Exit");

                int choiceNumber = input.nextInt();

                switch(choiceNumber){
                    case 1:
                            System.out.println("Enter the Patient New Name: ");
                            oldpatient.setName(input.next());
                                System.out.println("Edited Succefully");
                    break;
                        
                    case 2:
                            System.out.println("Enter the Patient New Payment Method: ");
                            oldpatient.setPaymentmethod(input.next());
                            System.out.println("Edited Succefully");
                    break;
                        
                    case 3:
                            System.out.println("Enter the Patient New Address: ");
                            oldpatient.setAddress(input.next());
                            System.out.println("Edited Succefully");
                            
                        break;

                    case 4:
                            System.out.println("Enter the Patient New Phone Number: ");
                            oldpatient.setPhonenumber(input.next());
                            System.out.println("Edited Succefully");
                        break;


                    case 5:
                            System.out.println("Enter the Patient New Phone Number: ");
                            oldpatient.setPhonenumber(input.next());
                            System.out.println("Edited Succefully");
                        break;


                    case 6:
                        if(oldpatient instanceof EmergencyPatient){
                            System.out.println("Enter the Patient New Room Number: ");
                            oldpatient.setRoomnumber(input.nextInt());
                            System.out.println("Edited Succefully");
                        }
                        else{
                            System.out.println("This option is invalid for normal patient");
                        }
                    break;
                    
                    case 7:
                            System.out.println("Enter the Patient New Gender: ");
                            oldpatient.setGender(input.next());
                            System.out.println("Edited Succefully");
                    break;
                        
                    case 8:
                            System.out.println("Enter the Patient New Symptoms: ");
                            oldpatient.setSymptoms(input.next());
                            System.out.println("Edited Succefully");
                        break;


                    case 9:
                        edit =false;
                    break; 
                }

            }
        }
    }
  
    public static void DeletePatient(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Patient's Id ");
        int id = input.nextInt();
        Patient patient = SystemAdmin.getPatientWithId(id);
        
        if(patient == null){
            System.out.println("No patient was found by this id");
        }
        
        else{
            if(SystemAdmin.removePatient(patient)){
                System.out.println("Succefully Deleted");
            }
            
            else{
            System.out.println("Failed to delete");
            }
        }
    }
    
    protected static boolean removePatient(Patient patient){
        if(!patients.isEmpty()){
            patients.remove(patient);
            if(patient instanceof NormalPatient){
                NormPatients.remove(patient);
            }
            
            else{
                EmPatients.remove(patient);
            }
            return true;
        }
        return false;
    }
 
    public static Patient getPatientWithId(int id){
         if(patients.isEmpty()){
             SystemAdmin.Normalpatientsdata();
             SystemAdmin.patientsdata();
         }
         for(Patient patient : patients){
             if(patient.id == id){
                return patient;
             }  
         }
         return null;              
    }     
    
    //Doctor dumy Data
    public static void doctorsdata(){
        Doctor d0 = new Doctor("Cardiology",122526,"Magdi","Cairo","0120522");
        Doctor d1 = new Doctor("Surgery",252347,"Ali","  Mansoura","0150554");
        Doctor d2 = new Doctor("Genetics",256218,"Islam","Giza","015452");
        doctors.add(d0);
        doctors.add(d1);
        doctors.add(d2);
    }
   
    public static void DisplayAllDoctors(){
        if((SystemAdmin.doctors.isEmpty())){
            SystemAdmin.doctorsdata();
        }
        
        if(doctors.isEmpty()){
            System.out.println("There's no available data for doctors");
        }
        
        else{
            GUI7.main();
            System.out.println("Name"+"        "+"ID"+"        "+"Speciality"+"        "+"Phone Number "+"        "+"Address");

            for(Doctor doctor : doctors ){
                System.out.println(doctor.getName()+"        "+doctor.getId()+"        "+doctor.getSpecialty()+"        "+doctor.getPhonenumber()+"        "+doctor.getAddress());
            }
        }
    }
    
   public static void AddDoctor(){
        if(doctors.isEmpty()){
            SystemAdmin.doctorsdata();
        }
        
        System.out.println("Enter the Number of Doctors You Want to Add: ");
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        int count = input.nextInt();
        if(count < 0){
             System.out.println("Invalid,Please Enter an integer Greater than Zero ");    
        }

        else{
            for(int i =0;i<count;i++){
                Doctor d = new Doctor();
                System.out.println("Enter The Doctor"+(i+1)+" Name: ");
                d.setName(input.next());
                System.out.println("Enter The Doctor"+(i+1)+"id: ");
                d.setId(input.nextInt());
                System.out.println("Enter The Doctor"+(i+1)+" speciality: ");
                d.setSpecialty(input.next());
                System.out.println("Enter The Doctor"+(i+1)+" phonenumber: ");
                d.setPhonenumber(input.next());
                System.out.println("Enter The Doctor"+(i+1)+" Address: ");
                d.setAddress(input.next());
                SystemAdmin.doctors.add(d);
            }
        }
    }   
   
   public static void Editdoctor(){ 
        boolean edit =true;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Doctor ID: ");
        Doctor oldDoctor = SystemAdmin.getDoctorWithId(input.nextInt());
        if(oldDoctor == null){
            System.out.println("No Doctor With this id");
        }
        else{
            while(edit==true){
            
                System.out.println("--------Select your Option-------");
                System.out.println(" 1-Edit Doctor's Name \n 2-Edit Doctor's Speciality \n 3-Edit Doctor's Address \n 4-Edit Doctor's Phone Number \n 5-Edit Doctor's ID \n 6-Exit");

                int choiceNumber = input.nextInt();
                switch(choiceNumber){
                    case 1:
                            
                            System.out.println("Enter the Doctor New Name: ");
                            oldDoctor.setName(input.next());
                            System.out.println("Edited Succefully");
                        
                        break;

                    case 2:
                            System.out.println("Enter the Doctor New Speciality: ");
                            oldDoctor.setSpecialty(input.next());
                            System.out.println("Edited Succefully");
                        break;

                    case 3:
                            System.out.println("Enter the Doctor New Address: ");
                            oldDoctor.setAddress(input.next());
                            System.out.println("Edited Succefully");
                        break;

                    case 4:
                            System.out.println("Enter the Doctor New PhoneNumber: ");
                            oldDoctor.setPhonenumber(input.next());
                            System.out.println("Edited Succefully");
                        break;

                    case 5:
                            System.out.println("Enter the Doctor New ID: ");
                            oldDoctor.setId(input.nextInt());
                            System.out.println("Edited Succefully");
                        break;

                    case 6:
                        edit =false;
                    break;    
                }
            }
    }
   }
   
   
    
    
    public static void DeleteDoctor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Doctor's Id ");
        Doctor doctor = SystemAdmin.getDoctorWithId(input.nextInt());
        if(doctor == null){
            System.out.println("No doctor was found by this id");
        }
        else{
            if(SystemAdmin.removeDoctor(doctor)){
                System.out.println("Succefully Deleted");
            }
            
            else{
                System.out.println("Failed to delete");
            }
        }
    }
  
    protected static boolean removeDoctor(Doctor doctor){
       if(!doctors.isEmpty()){
            doctors.remove(doctor);
            return true;
        }
     return false;
    }
   
    public static Doctor getDoctorWithId(java.lang.Integer id){
        if(doctors.isEmpty()){
            SystemAdmin.doctorsdata();}
        for(Doctor doctor : doctors){
            if(doctor.id == id){
                return doctor;
            }  
        }
    return null;         
    }  
    
     protected static void makeAppointment ()
    {
          Patient chosenPatient = null;
          String patientName = null;
          String doctorName = null;
          
        SystemAdmin.DisplayAllDoctors();
        System.out.println(" Please Enter Doctor's ID:");

        Scanner input = new Scanner(System.in);
        int choiceDoctor = input.nextInt();
        
        Doctor chosenDoctor = getDoctorWithId (choiceDoctor);
        doctorName =chosenDoctor.getName();

          System.out.println("Is the Patient's Situation: \n 1-Emergency \n 2-Normal");
          int choicePatient = input.nextInt();

          switch (choicePatient){
                  case 1:

                      SystemAdmin.DisplayEmergencyPatients();
                      System.out.println(" Please Enter Patient's ID:");
                      Scanner input2 = new Scanner(System.in);

                      int choice2 = input2.nextInt();
                      chosenPatient = getPatientWithId(choice2);
                      patientName= chosenPatient.getName();

                      break;

                  case 2:

                         SystemAdmin.DisplayNormalPatients();
                  System.out.println(" Please Enter Patient's ID:");

                  Scanner input3 = new Scanner(System.in);

                  int choice3 = input3.nextInt();
                  chosenPatient = getPatientWithId(choice3);
                   patientName= chosenPatient.getName();


                  break;                 

          }
          
          System.out.println(" Please enter desired Month: ");
          int inputMonth = new Scanner(System.in).nextInt();
          
          System.out.println(" Please enter desired Day: ");
          int inputDay = new Scanner(System.in).nextInt();
          
          System.out.println(" Please enter desired hour: ");
          int inputHour = new Scanner(System.in).nextInt();
          
          System.out.println(" Please enter desired min: ");
          int inputMin = new Scanner(System.in).nextInt();
          
          LocalDateTime dateTime = LocalDateTime.of(2023,inputMonth, inputDay, inputHour, inputMin);

          Appointment appointment = new Appointment(chosenPatient, chosenDoctor, dateTime);
          appointments.add(appointment);

          System.out.println(patientName + " has an appointment with Dr. "+  doctorName + " on "+ dateTime);
    }
    
}