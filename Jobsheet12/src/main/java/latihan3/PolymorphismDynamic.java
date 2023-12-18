/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author Gues
 */
public class PolymorphismDynamic {
    public static void main(String[] args) {
    // creating variable of bank class 
    Bank B;
    B = new BRI();
    System.out.println("Tingkat suku bunga BRI adalah : "+B.sukuBunga());       
    B = new BNI();
    System.out.println("Tingkat suku bunga BNI adalah : "+B.sukuBunga());
    B = new Mandiri();
    System.out.println("Tingkat suku bunga Mandiri adalah : "+B.sukuBunga());

    }
}