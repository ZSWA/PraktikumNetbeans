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
public class Lingkaran extends BangunDatar{
    public double jejari;
    
    public double hitungLuas(){
        double luas = Math.PI*this.jejari*this.jejari;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 2*Math.PI*this.jejari;
        return keliling;
    }
    
    
}
