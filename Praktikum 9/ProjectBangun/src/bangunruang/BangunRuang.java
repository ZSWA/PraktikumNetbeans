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
public abstract class BangunRuang {
    public abstract double hitungVolume();
    public abstract double hitungLuas();
    public void tampilHasil(){
        System.out.println("Volume : "+this.hitungVolume());
        System.out.println("Luas : "+this.hitungLuas());
    }
}
