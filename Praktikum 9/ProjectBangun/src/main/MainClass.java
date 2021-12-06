/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bangundatar.*;
import bangunruang.*;

/**
 *
 * @author Kaitoga
 */
public class MainClass {
    public static void main(String[] args) {
        Persegi b1 = new Persegi();
        b1.sisi = 2;
        b1.hitungLuas();
        b1.hitungKeliling();
        b1.tampilHasil();
        System.out.println("");
        
        PersegiPanjang b2 = new PersegiPanjang();
        b2.panjang = 2;
        b2.lebar = 3;
        b2.hitungLuas();
        b2.hitungKeliling();
        b2.tampilHasil();
        System.out.println("");
        
        Lingkaran b3 = new Lingkaran();
        b3.jejari = 7;
        b3.hitungLuas();
        b3.hitungKeliling();
        b3.tampilHasil();
        System.out.println("");
        
        Tabung b4 = new Tabung();
        b4.jejari = 7;
        b4.tinggi = 2;
        b4.hitungLuas();
        b4.hitungVolume();
        b4.tampilHasil();
        System.out.println("");
        
        Balok b5 = new Balok();
        b5.panjang = 5;
        b5.lebar = 3;
        b5.tinggi = 2;
        b5.hitungLuas();
        b5.hitungVolume();
        b5.tampilHasil();
        System.out.println("");
        
        Bola b6 = new Bola();
        b6.jejari = 7;
        b6.hitungLuas();
        b6.hitungVolume();
        b6.tampilHasil();
    }

}
