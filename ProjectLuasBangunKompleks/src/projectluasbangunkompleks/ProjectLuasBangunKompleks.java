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
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hitung bangun1 = new Hitung();
        Hitung2 bangun2 = new Hitung2();
        
        bangun1.sisi = 42;
        bangun2.jaribesar = 14;
        
        double Luas = bangun1.hitungLuas();
        double Luas2 = bangun2.hitungLuas();
        
        System.out.println("Luas bangun tersebut adalah: "+Luas);
        System.out.println("Luas bangun abu-abu adalah: "+Luas2);
    }
    
}
