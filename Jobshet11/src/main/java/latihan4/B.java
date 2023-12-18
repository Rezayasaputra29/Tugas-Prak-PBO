/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

/**
 *
 * @author Gues
 */
public class B extends A {
    private int b; 

    public void setB (int nilai){
        b = nilai;
    }

    public int getB (){
        return b;
    }

    // melakukan override terhadap method tampilkanNilai()
    // yang terhadap pada kelas A 
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b = "+ getB());
    }

}
