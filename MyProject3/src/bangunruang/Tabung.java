/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Kaitoga
 */
public class Tabung {
    public double jari;
    public double tinggi;
    
    public void hitungVolume(){
        double hasil = 3.14*jari*jari*tinggi;
        System.out.println("Hitung Volume Tabung : " + hasil + " cm3");
    }
    
    public void hitungLuas(){
        double hasil = 2*3.14*jari;
        System.out.println("Hitung Luas Selimut Tabung : " + hasil + " cm2");
    }
}
