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
public class Tabung extends BangunRuang{
    public double jejari;
    public double tinggi;
    
    public double hitungVolume(){
        double volume = Math.PI*this.jejari*this.jejari*tinggi;
        return volume;
    }
    
    public double hitungLuas(){
        double luas = 2*Math.PI*this.jejari*(this.jejari+this.tinggi);
        return luas;
    }
    
    
}
