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
public class MainClass {
    public static void main(String[]args){
        Lingkaran l1 = new Lingkaran();
        l1.setJariJari(10);
        l1.hitungLuas();
        System.out.println("Luas Lingakran berjari-jari "+l1.getJariJari()+" adalah "+l1.getLuas());
    }
}
