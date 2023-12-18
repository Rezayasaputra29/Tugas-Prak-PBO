/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan19_testshape;

/**
 *
 * Created By_22343070_REZA YASA PUTRA
 */
public class Shape {
    // Private member variable
    private String color;

    /** Constructs a Shape instance with the given color */
    public Shape (String color) {
       this.color = color;
    }

    /** Returns a self-descriptive string */   
    @Override
    public String toString() {
       return "Shape[color=" + color + "]";
    }

    /** All shapes must provide a method called getArea() */
    public double getArea() {
       // We have a problem here!
       // We need to return some value to compile the program.
       System.err.println("Shape unknown! Cannot compute area!");
       return 0;
   }
}