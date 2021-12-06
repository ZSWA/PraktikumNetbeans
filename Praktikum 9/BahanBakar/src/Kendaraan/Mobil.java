/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kendaraan;

/**
 *
 * @author Kaitoga
 */
public abstract class Mobil {
    public abstract double hitungBahanBakar();
    public abstract double hitungWaktuPerjalanan();
    
    public void tampilHasil() {
        System.out.println("Bahan Bakar Minimal   : " + this.hitungBahanBakar() + " liter");
        System.out.println("Waktu Perjalanan      : " + this.hitungWaktuPerjalanan() + " jam");
    }
}
