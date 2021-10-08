/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Kaitoga
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public void hitungLuas(){
        int hasil = panjang * lebar;
        System.out.println("Hitung Luas Persegi Panjang : " + hasil + " cm2");
    }
    
    public void hitungKeliling(){
        int hasil = 2*(panjang+lebar);
        System.out.println("Hitung Keliling Persegi Panjang : " + hasil + " cm");
    }
}
