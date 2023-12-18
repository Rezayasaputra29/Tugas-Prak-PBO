/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Gues
 */

import java.util.Scanner;

public class IpMahasiswa {
     String namaMhs, semester, nimMhs;
    double ip;
    
    public void inputDataMhs() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\n INPUT DATA MAHASISWA\n");
        
        System.out.print("\n Masukkan Nama Mahasiswa\t: ");
        namaMhs = input.nextLine();
        
        System.out.print(" Masukkan Nim Mahasiswa\t\t: ");
        nimMhs = input.nextLine();
        
        System.out.print(" Masukkan Semester Saat Ini\t: ");
        semester = input.nextLine();
        
        System.out.print(" Masukkan IP Semester Saat Ini\t: ");
        ip = input.nextDouble();
        
        input.close();
    }

    public void nilaiIp(){
        if(ip >= 3.5){
            System.out.println(" Anda Berhak Mengontrak 24 SKS Pada Semester V");
        }
        else if((ip < 3.5) && (ip >= 3.0)){
            System.out.println(" Anda Berhak Mengontrak 22 SKS Pada Semester V");
        }
        else if((ip < 3.0) && (ip >= 2.5)){
            System.out.println(" Anda Berhak Mengontrak 20 SKS Pada Semester V");
        }
        else if((ip < 2.5) && (ip >= 2.0 )){
            System.out.println(" Anda Berhak Mengontrak 18 SKS Pada Semester V");
        }
        else{
            System.out.println(" Anda Berhak Mengontrak 15 SKS Pada Semester V");
        }
    }

    public void hasilMhs(){
        System.out.print("\n DATA MAHASISWA\n");
        System.out.println("\n Nama Mahasiswa\t\t: "+ namaMhs);
        System.out.println(" NIM\t\t\t: "+ nimMhs);
        System.out.println(" Semester\t\t: "+ semester);
        System.out.println(" IP Semester\t\t: "+ ip);
        System.out.println();
    }

    public static void main(String[] args) {
        IpMahasiswa Mahasiswa = new IpMahasiswa();

            System.out.println("+----------------------------------------------+");
            Mahasiswa.inputDataMhs();
            System.out.println("\n+----------------------------------------------+");
            Mahasiswa.hasilMhs();
            Mahasiswa.nilaiIp();
            System.out.println("\n+----------------------------------------------+");

        }

}