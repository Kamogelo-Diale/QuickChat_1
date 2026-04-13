/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quickchat_1;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class LogIn {
    
  
    void register(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Username");
         String storedUsername = input.nextLine();
         checkUsername(storedUsername);

        System.out.println("Enter Password");
        String storedPassword = input.nextLine();
        checkPassword(storedPassword);
        
        System.out.println("Enter Cellphone number");
        String storedCellphone = input.nextLine();
        checkCellphone(storedCellphone);
        
        registerUser(storedUsername,storedPassword);
        login(storedUsername,storedPassword);
}
    boolean checkUsername (String username){
     if (username.length()<= 5 && username.contains("_")){
         System.out.println("Username successfully captured");
     return true;    
     } 
     else{
         System.out.println("Username is not correctly");
         return false;
     }
    }
    boolean checkPassword(String password){
        if (password.length()>=8 && password.contains(".[A-Z].[!@#$%^&*].*") ){
         System.out.println("Password captured successfully");
         return true;
        }
        else{
            System.out.println("Password is not correctly formated");
            return false;
        }
    }
    boolean checkCellphone (String cellphone){
        if (cellphone.length()==10 && cellphone.contains("//^+27\\d(9)")){
            
        System.out.println("Cellphone number successfully added");
        return true;
        }
        else{
            System.out.println("Cellphone number incorrectly or does not contain intentional code");
            return false;
        }
    }
   public String registerUser(String storedUsername,String storedPassword){
       if (checkPassword(storedPassword) && checkUsername(storedUsername) ){ 
         return "Successfully Registered";
         
       }
       else{
           return "Incorrect Username or Password";
       }
   }
   void login(String storedUsername,String storedPassword){
       Scanner input=new Scanner(System.in);
    String Username;
    String Password;
    String FirstName;
    String LastName;
    
    System.out.println("Enter your First name");
    FirstName=input.nextLine();
    
    System.out.println("Enter your Last Name");
    LastName=input.nextLine();
    
    System.out.println("Enter Username");
    Username =input.nextLine();
    
    System.out.println("Enter Password");
    Password=input.nextLine();
    
    loginUser(Username,storedUsername,Password,storedPassword);
}
   public boolean loginUser(String Username,String storedUsername,String Password, String storedPassword){
       
       return Username.matches(storedUsername)&& Password.matches(storedPassword);
   }
}
