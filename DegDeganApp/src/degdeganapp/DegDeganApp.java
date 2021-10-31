/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdeganapp;

/**
 *
 * @author Kaitoga
 */
public class DegDeganApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pesanan pst = new Pesanan();
        Degan dgn = new Degan();
        int Harga_Jual = (pst.pesanan+15000000)/dgn.Stok();
        
        System.out.println("Harga Jual @Kelapa : "+Harga_Jual);
        
    }
    
}
