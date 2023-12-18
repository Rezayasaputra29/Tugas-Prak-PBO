/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Gues
 */
class RodaEmpat extends Kendaraan {
    double naikHargaKe = 8; //1 kali
    
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar + naikHargaKe);
        System.out.println ("Setelah dimodifikasi, harga mobil menjadi Rp. "+hargaDasar);
    }

} 

