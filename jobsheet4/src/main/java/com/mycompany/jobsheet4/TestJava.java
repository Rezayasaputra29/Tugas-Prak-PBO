/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet4;

/**
 *
 * @author Gues
 */
public class TestJava {
     public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = true;

        // demonstrasi ||
        test = (i<10) || (j++>9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);

        // demonstrasi |
        test = (i<10) | (j++>9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);

    }
}

