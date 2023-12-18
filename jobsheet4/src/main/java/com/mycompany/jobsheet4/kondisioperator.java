/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet4;

/**
 *
 * @author Gues
 */
public class kondisioperator {
     public static void main(String[] args) {
        String status = "";
        int grade = 50;

        // menddapatkan status pelajar
        status = (grade >= 60) ?"Passed" : "Fail";

        // print status
        System.out.println(status);

    }
}
   
