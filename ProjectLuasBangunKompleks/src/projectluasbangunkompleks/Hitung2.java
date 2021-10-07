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
public class Hitung2 {
    int jaribesar;
    
    double hitungLuas(){
        double jarikecil = this.jaribesar/2;
        double LuasBesar = 3.14*this.jaribesar*this.jaribesar/2;
        double LuasKecil = 3.14*jarikecil*jarikecil/2*2;
        
        double luasbangun = LuasBesar-LuasKecil;
        
        return luasbangun;
    }
    
}
