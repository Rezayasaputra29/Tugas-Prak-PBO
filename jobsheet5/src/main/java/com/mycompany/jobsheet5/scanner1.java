/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet5;

/**
 *
 * @author Gues
 */
import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Masukkan Nama Lengkap : ");
            String nama = in.nextLine();

            System.out.println("Masukkan NIM : ");
            int NIM = in.nextInt();
   
            System.out.println("Masukkan Nilai : ");
            float nilai = in.nextFloat();

            System.out.println("\nNama  : "+nama+
                                "\nNIM   : "+NIM+
                                "\nNilai : "+nilai);
        }
    }
}

