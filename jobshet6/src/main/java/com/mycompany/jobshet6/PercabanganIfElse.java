/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobshet6;

/**
 *
 * @author Gues
 */
public class PercabanganIfElse {
    public static void main(String [] args) {
        double grade = 92.0;

        if (grade >= 90) 
            System.out.println("Excellent! ");  

        /*Untuk menentukan kondisi yang mempunyai nilai rentangan maka 
        tentukan nilai batas atas bawah setelah itu digabungkan dengan
         logika AND (&&)*/ 
        
         else if ((grade < 90) && (grade >= 80)){
            System.out.println("Good Job! ");
        }
        
        else if ((grade < 80) && (grade >= 60)){
            System.out.println("Study harder ");
        } 
 
        else {
            System.out.println("Sorry, you failed. ");
        }

    } 
}

