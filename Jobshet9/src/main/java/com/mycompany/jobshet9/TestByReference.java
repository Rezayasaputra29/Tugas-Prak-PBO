/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobshet9;

/**
 *
 * @author Gues
 */
public class TestByReference {
      public static void main(String[] args){
        int[] ages = {10, 11, 12};

        for (int i =0; i<ages.length; i++){
            System.out.println(ages[i]);
        } 
        test(ages);

        for (int i =0; i<ages.length; i++){
            System.out.println(ages[i]);
        } 
    }

    public static void test (int []arr){
        for (int i =0; i<arr.length; i++){
            arr[i] = i+50;
        } 
    }

}
