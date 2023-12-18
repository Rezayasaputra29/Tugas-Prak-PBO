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

public class tgs2SwitchCase {
     public static void main(String [] args) {
        Scanner inputGrade = new Scanner(System.in);
        int grade;

        System.out.print("Masukkan Nilai = ");
        grade = inputGrade.nextInt();

        switch (grade) {
            case 1:
                System.out.println("satu");
                break;
            case 2:
                System.out.println("dua");
                break;
            case 3:
                System.out.println("tiga");
            break;
            case 4:
                System.out.println("empat");
                break;
            case 5:
                System.out.println("lima");
            break;
            case 6:
                System.out.println("dua");
                break;
            case 7:
                System.out.println("tujuh");
            break;
            case 8:
                System.out.println("delapan");
                break;
            case 9:
                System.out.println("sembilan");
            break;
            case 10:
                System.out.println("sepuluh");
            break;
            default:
                System.out.println("Invalid Number");
                break;
        }
        inputGrade.close();

    } 
}

