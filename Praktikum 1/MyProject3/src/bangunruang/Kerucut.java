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
public class Kerucut {
    public double jari;
    public double tinggi;
    public double pelukis;
    
    public void hitungVolume(){
        double hasil = 3.14*jari*jari*tinggi*0.3;
        System.out.println("Hitung Volume Kerucut : " + hasil + " cm3");
    }
    
    public void hitungLuas(){
        double hasil = 3.14*jari*pelukis;
        System.out.println("Hitung Luas Selimut Kerucut : " + hasil + " cm2");
    }
    
}
