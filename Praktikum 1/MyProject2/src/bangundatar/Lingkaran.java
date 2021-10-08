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
public class Lingkaran {
    public double jari;
    public double jari2;
    
    public void hitungLuas(){
        double hasil = 3.14*jari*jari;
        double hasil2 = 3.14*jari2*jari2;
        System.out.println("Hitung Luas Lingkaran 1 : " + hasil + " cm2");
        System.out.println("Hitung Luas Lingkaran 2 : " + hasil2 + " cm2");
    }
    
    public void hitungKeliling(){
        double hasil = 3.14*(2*jari);
        double hasil2 = 3.14*(2*jari2);
        System.out.println("Hitung Keliling Lingkaran 1 : " + hasil + " cm");
        System.out.println("Hitung Keliling Lingkaran 2 : " + hasil2 + " cm");
    }
}
