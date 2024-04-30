package com.mycompany.healthtest;
import java.util.Scanner;
/**
 *
 * @author Youssef
 */
public class HealthTest {

    public static void main(String[] args) {
        try{
            Scanner input =new Scanner(System.in);
            while(true){
                System.out.println("-----------WELCOME TO OUR PROGRAM-----------");
                System.out.println(" 1-Add new doctor \n 2-Add new patient \n 3-Edit exisiting doctor \n 4-Edit existing patient \n 5-Delete Doctor \n 6-Delete Patient \n 7-Display all Doctors \n 8-Display Normal Patients \n 9-Display Emergency patients \n 10-Reserve an appointment with a doctor \n");
                System.out.println(" Enter Your choice");

                int choice = input.nextInt();
                switch(choice){
                    case 1:
                        SystemAdmin.AddDoctor();
                    break;

                    case 2:
                        SystemAdmin.AddPatient();
                    break;

                    case 3:
                        SystemAdmin.Editdoctor();
                    break;

                    case 4:
                        SystemAdmin.editPatient();
                    break;

                    case 5:
                        SystemAdmin.DeleteDoctor();
                    break;

                    case 6:
                        SystemAdmin.DeletePatient();
                    break;

                    case 7:
                        SystemAdmin.DisplayAllDoctors();
                    break;

                    case 8:
                        SystemAdmin.DisplayNormalPatients();
                    break; 

                    case 9:
                        SystemAdmin.DisplayEmergencyPatients();
                    break;

                    case 10:
                        SystemAdmin.makeAppointment();
                    break;
                }
            }
            
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    }
}