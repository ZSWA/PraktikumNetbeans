/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Kaitoga
 */
public class MyClass {
    public static void main(String[] args) {
        OperasiBilangan op = new OperasiBilangan();
        op.bilPertama = 100;
        op.bilKedua = 150;
        op.hitungPenjumlahan();
        op.hitungPengurangan();
        op.hitungPerkalian();
        op.hitungPembagian();
    }  
}
