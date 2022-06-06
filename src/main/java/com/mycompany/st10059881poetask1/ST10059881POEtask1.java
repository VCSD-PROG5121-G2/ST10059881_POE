/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.st10059881poetask1;

import java.util.Scanner;

/**
 *
 * @author kayurbetchu
 */
public class ST10059881POEtask1 {

    public static void main(String[] args) {
       Scanner log = new Scanner(System.in);
       
       Login loginMethod = new Login();
     
       
       System.out.print("Please enter Name: ");
       String name = log.nextLine();
       
       System.out.print("Enter your Surname: ");
       String surname = log.nextLine();
       
       System.out.print("Please enter Username: ");
       String username = log.nextLine();
       
       
       if (loginMethod.checkUsername(username)) {
           
           System.out.print("Your username is valid! ");
           System.out.print("Please enter a password (Must Have: 8 Characters at least, a capital letter, a number, a special character) ");
           String password = log.nextLine();
           
           if (loginMethod.checkPasswordComplexity(password)) {
              System.out.print("Your password is valid! ");
              
              System.out.print(loginMethod.registerUser(username, password));
              
              System.out.print("Please re-enter your username (Verification purposes): ");
              String userNamecheck = log.nextLine();
              
              System.out.print("Please re-enter your password (Verification purposes): ");
              String passWordcheck = log.nextLine();
              
              if (loginMethod.loginUser(username, password, userNamecheck, passWordcheck));
                 System.out.print(loginMethod.returnLoginStatus("Your login was successfull. "));
                 
                 System.out.print("Welcome " + name + " " + surname + ", it is great to see you again");

           } else {
               
               System.out.print(loginMethod.returnLoginStatus("Your login was unsuccessful"));
              //This method will check if the login details are correct or not. 
           }
           
        } else {
           
           String password = "";
           
           System.out.print(loginMethod.registerUser(username, password));
       }
    }
}

    

