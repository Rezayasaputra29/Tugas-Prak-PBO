/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author Gues
 */
public class InformatikaUNP {
    public static void main(String[] args) {
        Mahasiswa informatika = new Mahasiswa();
        Mahasiswa elektronika = new Mahasiswa();
        
        informatika.nama = "Happy Alicia";
        informatika.nim = 1;
        informatika.jur = "S1 Informatika";
        informatika.univ = "Universitas Negeri Padang";
        
        elektronika.nama = "Wilson";
        elektronika.nim = 2;
        elektronika.jur = "S1 Elektroika";
        elektronika.univ = "Universitas Negeri Padang";
        
        System.out.println("\nData Mahasiswa Informatika");
        System.out.println("Nama\t: " + informatika.nama);
        System.out.println("NIM\t: " + informatika.nim);
        System.out.println("Jurusan\t: " + informatika.jur);
        System.out.println("Status\t: " + informatika.univ);
        
        System.out.println("\nData Mahasiswa Elektronika");
        System.out.println("Nama\t: " + elektronika.nama);
        System.out.println("NIM\t: " + elektronika.nim);
        System.out.println("Jurusan\t: " + elektronika.jur);
        System.out.println("Status\t: " + elektronika.univ);
        System.out.println();

    }
}
