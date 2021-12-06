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
public class Bola extends BangunRuang{
    public double jejari;
    
    public double hitungVolume(){
        double volume = 4/3*Math.PI*this.jejari*this.jejari*this.jejari;
        return volume;
    }
    
    public double hitungLuas(){
        double luas = 4*Math.PI*this.jejari*this.jejari;
        return luas;
    }
    
    
}
