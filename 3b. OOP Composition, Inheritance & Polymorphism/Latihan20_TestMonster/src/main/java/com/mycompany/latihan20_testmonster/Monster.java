/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan20_testmonster;

/**
 *
 * Created By_22343070_REZA YASA PUTRA
 */

public class Monster {
     // private instance variable
    private String name;

    /** Constructs a Monster instance with the given name */
    public Monster(String name) {
       this.name = name;
    }

    /** Defines a common behavior called attack() for all its subclasses */
    public String attack() {
       return "!^_&^$@+%$* I don't know how to attack!";
       // We have a problem here!
       // We need to return a String; else, compilation error!
    }
}
