/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobshet6;

/**
 *
 * @author Gues
 */
import java.io.BufferedReader; 
import java.io.InputStreamReader; 

public class Tugas1Bufferread {
      public static void main(String []args) {
        BufferedReader nilai = new BufferedReader (new InputStreamReader (System.in));
        String a, b, c;
        float nilai1, nilai2, nilai3, rataRata;

        try {
            System.out.print("Masukan nilai pertama :"); 
            a = nilai.readLine();
            nilai1 = Float.parseFloat(a); 

            System.out.print("Masukan nilai kedua :"); 
            b = nilai.readLine(); 
            nilai2 = Float.parseFloat(b); 

            System.out.print("Masukan nilai ketiga :");
            c = nilai.readLine();
            nilai3 = Float.parseFloat(c);

            rataRata = (nilai1+nilai2+nilai3)/3;

            if (rataRata>=60){
                System.out.printf("Selamat anda lulus dengan nilai %.2f :)", rataRata);
            } else {
                System.out.printf("Maaf anda tidak lulus dengan nilai %.2f :(",rataRata);
            }
        } 
        catch (Exception e){
            System.out.println("Maaf nilai yang anda input tidak tersedia");
        } 
    }
}

