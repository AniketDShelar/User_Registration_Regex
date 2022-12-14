package com.intellijide.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.firstName();
        user.lastName();
        user.emailId();
        user.phoneNumber();
        user.password();
        user.emailSamples();
    }
    public void firstName() {
        System.out.println("Enter first Name : ");
        String firstName = scan.next();
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher1 = pattern1.matcher(firstName);
        if (matcher1.matches()){
            System.out.println(true);
    }else{
            System.out.println(false);
            System.out.println("Enter Name in valid format, first letter should be capital case and remaining in small case");
        }
    }
    public void lastName() {
        System.out.println("Enter last Name : ");
        String lastName = scan.next();
        Pattern pattern2 = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher2 = pattern2.matcher(lastName);
        if (matcher2.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter Name in valid format, first letter should be capital case and remaining in small case");
        }
    }
    public void emailId(){
        System.out.println("Enter Email Id : ");
        String email = scan.next();
        Pattern pattern3 = Pattern.compile("^(abc)[.]?[a-z]*[@](bl)[.](co)[.]?[a-z]*$");
        Matcher matcher3 = pattern3.matcher(email);
        if (matcher3.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter Email ID in valid format ");
        }
    }
    public void phoneNumber(){
        System.out.println("Enter Mobile Number : ");
        String mobNumber = scan.next();
        Pattern pattern4 = Pattern.compile("^[0-9]{2,}[\s][6-9][0-9]{9}$");
        Matcher matcher4 = pattern4.matcher(mobNumber);
        if (matcher4.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter Mobile Number in valid format ");
        }
    }
    public void password() {
        System.out.println("Enter Password : ");
        String password = scan.next();
        Pattern pattern5 = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=[^@#!$%^&+=]*[@#!$%^&+=][^@#!$%^&+=]*$)(?=.*[0-9]).{8,}$");
        Matcher matcher5 = pattern5.matcher(password);
        if (matcher5.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter password in valid format");
        }
    }
    public void emailSamples() {
        System.out.println("Enter Email samples : ");
        String email = scan.next();
        Pattern pattern6 = Pattern.compile("[a-zA-Z0-9]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher matcher6 = pattern6.matcher(email);
        if (matcher6.matches()){
            System.out.println(true);
        }else{
            System.out.println(false);
            System.out.println("Enter password in valid format");
        }
    }
}