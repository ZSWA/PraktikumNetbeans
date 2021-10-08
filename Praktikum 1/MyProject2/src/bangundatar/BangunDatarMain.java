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
public class BangunDatarMain {
    public static void main(String[] args) {
        PersegiPanjang PP = new PersegiPanjang();
        PP.panjang = 25;
        PP.lebar = 38;
        PP.hitungLuas();
        PP.hitungKeliling();
        
        Persegi P = new Persegi();
        P.sisi = 10;
        P.sisi2 = 15;
        P.hitungLuas();
        P.hitungKeliling();
        
        Lingkaran L = new Lingkaran();
        L.jari = 25;
        L.jari2 = 37;
        L.hitungLuas();
        L.hitungKeliling();
    } 
    
}
