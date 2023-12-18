/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobshet8;

/**
 *
 * @author Gues
 */
import javax.swing.JOptionPane;

public class Tugas2_NomorTerbesar {
      public static void main(String[] args) {
        int no[] = new int[11];
        int max;        

        for (int i = 1; i < no.length; i++) {
            String Kata = "Masukkan Angka ke-"+ i +": ";
            String Angka = JOptionPane.showInputDialog(Kata);
            no[i] = Integer.parseInt(Angka);
            }

            max = no[0];
            
            for (int i = 1; i < no.length; i++) {
                if (no[i] > max) {
                max = no[i];
                }
            }

            String msg = "Angka Terbesarnya adalah: "+max;
            JOptionPane.showMessageDialog(null, msg);
    }
}

