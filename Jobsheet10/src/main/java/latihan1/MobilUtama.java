/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Gues
 */
public class MobilUtama {
    public static void main(String[] args) {
        System.out.println();
        
        Mobil Honda = new Mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunproduksi = 2020;

        System.out.println("Merek\t: "+Honda.merk);
        System.out.println("Warna\t: "+Honda.warna);
        System.out.println("Tahun\t: "+Honda.tahunproduksi);

        System.out.println();
        Honda.Maju();
        Honda.Maju();
        System.out.println();
        Honda.Mundur();
        System.out.println();

    }
}
