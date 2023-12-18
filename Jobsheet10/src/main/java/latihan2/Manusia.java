/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author Gues
 */
import java.util.Scanner;

public class Manusia {
      String nama,tempat_lahir,tgl_lahir;
    int berat_badan,tinggi_badan;
    
    public void inputdata() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan nama lengkap\t: ");
        nama = input.nextLine();
        System.out.print("Masukkan tempat lahir\t: ");
        tempat_lahir = input.nextLine();
        System.out.print("Masukkan tanggal lahir\t: ");
        tgl_lahir = input.nextLine();
        System.out.print("Masukkan Berat badan\t: ");
        berat_badan = input.nextInt();
        System.out.print("Masukkan Tinggi badan\t: ");
        tinggi_badan = input.nextInt();      
        input.close();
    }
    
    public void identitas(){
        System.out.println("\nNama Saya\t: "+ nama);
        System.out.println("Tempat lahir\t: "+ tempat_lahir);
        System.out.println("Tanggal lahir\t: "+ tgl_lahir);
        System.out.println("Berat Badan\t: "+ berat_badan);
        System.out.println("Tinggi badan\t: "+ tinggi_badan);
        System.out.println();
    }
    
    public static void main(String[] args) {
    Manusia A = new Manusia();
       A.inputdata();
       A.identitas();
    }
}

