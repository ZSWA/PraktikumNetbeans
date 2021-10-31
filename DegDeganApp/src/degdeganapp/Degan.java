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
public class Degan {
    int harga = 8000;
    double berat = 1.2;
    
    int Boyolali (){
        int byl = harga*5000;
        return byl;
    }
    
    int Salatiga(){
        int slt = harga*7500;
        return slt;
    }
    
    int Klaten(){
        int klt = harga*8300;
        return klt;
    }
    
    int Kudus(){
        int kds = harga*9100;
        return kds;
    }
    
    int Stok(){
        int jml = 5000+7500+9100+8300;
        return jml;
    }
}
