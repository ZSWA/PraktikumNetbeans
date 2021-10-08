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
public class Persegi {
    public int sisi;
    public int sisi2;
    
    public void hitungLuas(){
        int hasil = sisi*sisi;
        int hasil2 = sisi2*sisi2;
        System.out.println("Hitung Luas Persegi 1 : " + hasil + " cm2");
        System.out.println("Hitung Luas Persegi 2 : " + hasil2 + " cm2");
    }
    
    public void hitungKeliling(){
        int hasil = 4*sisi;
        int hasil2 = 4*sisi2;
        System.out.println("Hitung Keliling Persegi 1 : " + hasil + " cm");
        System.out.println("Hitung Keliling Persegi 2 : " + hasil2 + " cm2");
    }
    
}
