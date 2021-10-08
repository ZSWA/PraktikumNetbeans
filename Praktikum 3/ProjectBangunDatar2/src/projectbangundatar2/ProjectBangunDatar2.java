/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Kaitoga
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hitung h = new Hitung();
        
        h.PersegiP(10, 5);
        h.PersegiP(3.6, 8);
        h.PersegiP(6, 8.3);
        h.PersegiP(5.6, 8.3);
        
        System.out.println ("================================");
        h.Persegi(4.5);
        h.Persegi(7);
        
        System.out.println ("================================");
        h.Lingkaran(5);
        h.Lingkaran(7.4);
        
        System.out.println ("================================");
        h.Segitiga(8, 10);
        h.Segitiga(8, 11.5);
        h.Segitiga(12.2, 9);
        h.Segitiga(13.9, 20.7);
    }
    
}
