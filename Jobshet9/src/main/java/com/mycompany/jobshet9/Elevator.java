/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobshet9;

/**
 *
 * @author Gues
 */
public class Elevator {
      public boolean doorOpen = false;
        public int currentFloor = 5;
        public final int TOP_FLOOR = 5;
        public final int BOTTOM_FLOOR = 1;

        public void openDoor(){
            System.out.println("Opening Door.");
            doorOpen = true;
            System.out.println("Door is open");
        }

        public void closeDoor(){
            System.out.println("\nClosing Door.");
            doorOpen = false;
            System.out.println("Door is close.");
        }

        public void goUp(){
            System.out.println("\nGoing Up One Floor.");
            currentFloor++;
            System.out.println("Floor : "+currentFloor);
        }
        
        public void goDown(){
            System.out.println("\nGoing Down One Floor.");
            currentFloor--;
            System.out.println("Floor : "+currentFloor);
        }
        
        public void setFloor(int desiredFloor){
            while (currentFloor != desiredFloor){
                if (currentFloor < desiredFloor){
                    goUp();
                }
                else {
                    goDown();
                }
            }
        }

        public int getFloor() {
            return currentFloor;            
        }
        
        public boolean chechDoorStatus() {
            return doorOpen;            
        }

}