/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Gues
 */
class RodaDua extends Kendaraan {
    double naikHargaKe = 0.20; //0.2 kali
    
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar + naikHargaKe);
        System.out.println ("Setelah dimodifikasi, harga sepeda menjadi Rp. "+hargaDasar);
    }

} 
