/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oton1;

import java.util.Scanner;

/**
 *
 * @author Oton_CPE112
 */
public class Oton1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
  
        Scanner input=new Scanner (System.in);
        int x= input.nextInt();
        System.out.println ("To continue... Lo op Enter 1");
        int loop_control=input.nextInt();
      
        
       while (loop_control==1) {
           
          System.out.println("Switch input...:");
          x=input.nextInt();
          switch(x){
              
              case 1:
              System.out.println("Welcome to Ton Calculator!");   
              System.out.println ("Enter a number:   ");
     
     
        int ton1 = input.nextInt();
        String operation= input.next();
        int ton2= input.nextInt();

            while(ton1 + ton2 != 0){

        if(operation.equals("+")){ 
            System.out.println("Answer = " + (ton1+ton2));
        }
        else if(operation.equals("-")){ 
            System.out.println("Answer = " + (ton1-ton2));
        }
        else if(operation.equals("*")){ 
            System.out.println("Answer = " + (ton1*ton2));
        }   
        else if(operation.equals("/")){ 
            System.out.println("Answer = " + (ton1/ton2));
        }
        else {
            System.out.println("Math Error");
        }
            
            break;
        }
            case 2:
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if ((num ^ 1) == num + 1) 
            { 
             System.out.println("The entered number "+ num +" is Even"); 
            } 
            else 
            { 
            System.out.println("The entered number "+ num +" is Odd"); 
    } 
          }
       }
      
       System.out.println("Continue..loop?");
       loop_control=input.nextInt();
        
    }
    
} 

