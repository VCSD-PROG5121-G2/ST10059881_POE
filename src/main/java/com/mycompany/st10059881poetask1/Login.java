/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10059881poetask1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kayurbetchu
 */
public class Login {
    
    public boolean checkUsername(String storeName) {
        if (storeName.contains("_") && storeName.length() <=5) {
            return true;
          } else {
            return false; 
        }
    }
    
    public boolean checkPasswordComplexity (String password) {
        
        
        
        Pattern allCharacters = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        
        if (password.length() < 8) {
            return false;
         //code attribution
         //this method was taken from Stack Overflow
         //https://stackoverflow.com/questions/36097097/password-validate-8-digits-contains-upper-lowercase-and-a-special-character
         //Ankur
         //https://stackoverflow.com/users/5752666/ankur
        }
        
        Matcher m = allCharacters.matcher(password);
        
        if(m.find()){
            return true;
        } else { 
            return false;
        }
    }
    
    
    public String registerUser (String Name, String Password) {    
        
        if (checkUsername(Name) && checkPasswordComplexity(Password)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .";
    } else if (checkUsername(Name) && checkPasswordComplexity(Password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
            
    }
        return "";
    }
    //This method checks to see if the password matches the correct criteria
    
    public boolean loginUser (String username, String password, String userNamecheck, String passWordcheck) {
        if (username.equals(userNamecheck) && password.equals(passWordcheck)) {
            return true;
        } else {
            return false;
            //This method will check if the login details are correct or not. 
        }
    }
     
    public String returnLoginStatus (String success) {
        if (success.equals("success")) {
            return "Your login was successfull";
            
        } else {
            
            return "Your login was unseccussful";
        }
    }
        
    }



