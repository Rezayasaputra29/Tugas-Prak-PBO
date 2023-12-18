/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Gues
 */
public class AndroMain {
    public static void main(String[] args) {
        Android sumsang = new Android();
        
        System.out.println("\n+------------------------------------+");
        System.out.println("|   Android Samsung Made in Pasaman   |");
        System.out.println("+------------------------------------+\n");

        sumsang.nyala();
        sumsang.panggilan();
        sumsang.sms();
        sumsang.shutdown();
        System.out.println();

    }
}
