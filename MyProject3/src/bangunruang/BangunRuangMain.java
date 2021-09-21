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
public class BangunRuangMain {
    public static void main(String[] args) {
        Bola b = new Bola();
        b.jari = 25;
        b.hitungVolume();
        b.hitungLuas();
        
        Tabung t = new Tabung();
        t.jari = 10;
        t.tinggi = 15;
        t.hitungVolume();
        t.hitungLuas();
        
        Kerucut k = new Kerucut();
        k.jari = 25;
        k.tinggi = 20;
        k.pelukis = 10;
        k.hitungVolume();
        k.hitungLuas();
    }
}
