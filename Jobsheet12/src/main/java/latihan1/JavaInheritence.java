/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Gues
 */
public class JavaInheritence {
    public static void main(String[] args) {
        // membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();

        // membuat objek kendaraan roda empat
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        mobil.hargaAkhir();
        
    }
}