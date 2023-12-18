/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet5;

/**
 *
 * @author Gues
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class TugasScannerandBufferreader {
     public static void main(String[] args) {
        Scanner datain = new Scanner(System.in);
        BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));

        String kata3 = " ";

        System.out.print("Enter Word 1 : ");
        String kata1 = datain.nextLine();

        System.out.print("Enter Word 2 : ");
        String kata2 = datain.nextLine();

        try {
            System.out.print("Enter Word 3 : ");
            kata3 = masuk.readLine();
        }

        catch (IOException e){
            System.out.println("Gagal Membaca Keyboard");
        } finally {
            datain.close();
        }

        System.out.print("\n" + kata1 + " "+kata2+ " "+kata3);
    }
}

