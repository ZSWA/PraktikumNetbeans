/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Kaitoga
 */
public class OperasiBilangan {
    
    public void hitungPenjumlahan(){
        int hasil = bilPertama + bilKedua;
        System.out.println("Hasil penjumlahannya: " + hasil);
    }
    
    public void hitungPengurangan(){
        int hasil = bilPertama - bilKedua;
        System.out.println("Hasil pengurangannya: " + hasil);
    }
    
    public void hitungPerkalian(){
        int hasil = bilPertama * bilKedua;
        System.out.println("Hasil Perkaliannya: " + hasil);
    }
    
    public void hitungPembagian(){
        double bil1 = bilPertama;
        double bil2 = bilKedua;
        double hasil = bil1 / bil2;
        System.out.println("Hasil Pembagiannya: " + hasil);
    }
    
    public int bilPertama;
    public int bilKedua;

}
