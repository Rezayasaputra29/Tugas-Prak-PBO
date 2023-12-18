/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobshet6;

/**
 *
 * @author Gues
 */
import java.util.Scanner;

public class tugas2IfElse {
     public static void main(String [] args) {
        Scanner inputGrade = new Scanner(System.in);
        int grade;

        System.out.print("Masukkan Nilai = ");
        grade = inputGrade.nextInt();

        if (grade == 10) {
            System.out.println("sepuluh");
        }
        else if (grade == 9){
            System.out.println("sembilan");
        }
        else if (grade == 8){
            System.out.println("delapan");
        }
        else if (grade == 7){
            System.out.println("tujuh");
        }
        else if (grade == 6){
            System.out.println("enam");
        }
        else if (grade == 5){
            System.out.println("lima");
        }
        else if (grade == 4){
            System.out.println("empat");
        }
        else if (grade == 3){
            System.out.println("tiga");
        }
        else if (grade == 2){
            System.out.println("dua");
        }
        else if (grade == 1){
            System.out.println("satu");
        }
        else{
            System.out.println("Invalid Number");
        }
        inputGrade.close();

    } 
}

