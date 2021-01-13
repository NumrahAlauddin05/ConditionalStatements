/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalstatements;

import java.util.Scanner;

/**
 *
 * @author NAVTTC07
 */
public class ConditionalStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //If-else 
        //Switch case
        int num1=10;
        int num2=2;
        
        int num3=num1/num2;//q
        int num4=num1%num2;//remainder //modulus
        
       boolean check=num1==num2;
       boolean check1=num1>num2;
       boolean check2=num1<num2;
       boolean check3=num1>=num2;
       boolean check4=num1<=num2;
   
      /* System.out.println("check "+check);//true
       System.out.println("check1 "+check1);//false
       System.out.println("check2 "+check2);//false
       System.out.println("check3 "+check3);//true
       System.out.println("check4 "+check4);*/
       
       //if(condition){
       
       //statements
    //}
    
    if(num1>num2){
        System.out.println("number 1 is greater than number 2");
    }
    else{
        System.out.println("number 1 is not greater than number");
    }
        
//    else if(num1<num2){
//         System.out.println("number 1 is less than number 2");
//    }
//    else if(num1!=num2){
//         System.out.println("number 1 is equal to number 2");

//    if(num1>num2){
//        System.out.println("Number 1 is greater than number 2");
//    }
//    
//    if(num1==10){
//        System.out.println("number 1 is equal to 10");
//    }
//    
//    if(num1<num2){
//        System.out.println("number 1 is less than number 2");
//    }
//
//    else{
//        
//    }

        Scanner scan =new Scanner(System.in);
        //Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int num5=scan.nextInt();
      if(num5%2==0){
          System.out.println("Even");
      }
      else 
      {
          System.out.println("Odd");
      }
      
      String word="Hello";
      String word2="HI";
      
      if(word.equals(word2)){
          System.out.println("Equal");
      }
      else
      {
          System.out.println("not equal");
      }
      
      String pass="admin--";
      String course="Java";
      
      if(pass.equals("admin--")){
          System.out.println("Correct password");
      }
      else
      {
          System.out.println("InCorrect password");
      }
      
      char ch='A';
      if(ch=='a'){
          System.out.println("character is a");
      }
      else
      {
          System.out.println("Character is not a");
      }
      
      int per=80;
      
      if(per >=60 && per<=69){
          System.out.println("GRade B");
          
      }
      else if(per>=70 && per<=79){
          System.out.println("Grade is A");
      }
      
      else
      {
          System.out.println("Invalid per");
      }

      
      //nested if else
      
      /*if(condition){
            if(){
      }
      }
      */
      String userName="NUmrah";
      String userType="admin";
      
      
      if(userName.equals("NUmrah")){
       
          
          if(userType.equals("admin")){
              System.out.println("User is amdin");
          }
          else
          {
              System.out.println("User is not admin");
          }
          
      }
      else {
          System.out.println("Invalid user");
      }
      
      int number1 =5;
      int number2=10;
      
      if(number1>number2){
          
          if(number1>50){
              System.out.println("Number is greater than 50");
          }
          else
          {
              System.out.println("Number is not greater than 50");
          }
      }
        System.out.println("NUmber1 is less than number 2");
      
     
    }
  
   
}
