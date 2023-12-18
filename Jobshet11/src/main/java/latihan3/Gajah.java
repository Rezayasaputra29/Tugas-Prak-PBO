/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author Gues
 */
public class Gajah extends Hewan {
    
    // meng-overwrite method pada Class Hewan
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan");
    }

    public void testInstanceMethod(){
        System.out.println("The Instance Method in Hewan");
    }

    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();

    }
    
}
