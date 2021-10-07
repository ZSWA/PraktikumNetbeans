/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Kaitoga
 */
public class Hitung {
    int sisi;
    
    double hitungLuas(){
        double jari = this.sisi/2;
        int persegi = this.sisi*this.sisi;
        double lingkaran = 3.14*jari*jari/2*4;
        
        double luas = persegi+lingkaran;
        return luas;
    }
}
