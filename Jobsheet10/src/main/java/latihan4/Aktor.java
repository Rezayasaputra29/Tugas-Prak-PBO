/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

/**
 *
 * @author Gues
 */
public class Aktor {
     String nama;
    int umur;
    
    Aktor(String n ,int u){//Aktor adalah constructor
        nama = n;
        umur = u;
    }
    void tampilAktor(){
        System.out.println("Namaku\t: "+ nama);
        System.out.println("Umurku\t: "+ umur +" tahun");
    }
    public static void main(String[] args) {
        Aktor a;
        
        System.out.println("===================");
        a = new Aktor ("Ronaldo",33);
        a.tampilAktor();
        System.out.println("===================");
        a = new Aktor ("Messi",34);
        a.tampilAktor();
        System.out.println("===================");
    }
}
