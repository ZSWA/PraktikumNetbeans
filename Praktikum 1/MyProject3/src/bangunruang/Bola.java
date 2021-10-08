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
public class Bola {
    public double jari;
    
    public void hitungVolume(){
        double hasil = 3.14*jari*jari*jari*(4/3);
        System.out.println("Hitung Volume Bola : " + hasil + " cm3");
    }
    
    public void hitungLuas(){
        double hasil = 3.14*jari*jari*4;
        System.out.println("Hitung Luas Selimut Bola : " + hasil + " cm2");
    }
    
}
