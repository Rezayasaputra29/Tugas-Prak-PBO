/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6;

/**
 *
 * @author Gues
 */
public class BuahUtama {
    public static void main(String[] args) {
        // menggunakan constructor untuk menginisialisasi
        EncapsulationBuah Apel = new EncapsulationBuah ("Apel", 
                                                        "Rp.3000",
                                                        "Merah");

        // menggunakan getter ke nilai
        System.out.println("Nama buah : "+Apel.getName()+
                            "\nHarga : "+Apel.getPrice()+
                            "\nWarna : "+Apel.getColor());

        // update harga dan warna menggunakan setter
        Apel.setColor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println("\nInformasi terkait Apel setelah di update");

        // menggunakan getter untuk mendapatkan nilai
        System.out.println("Nama buah : "+Apel.getName()+
                            "\nHarga : "+Apel.getPrice()+
                            "\nWarna : "+Apel.getColor());


    }
}
