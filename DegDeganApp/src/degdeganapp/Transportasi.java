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
public class Transportasi {
    int biaya = 700000/5;
    double beban = 3000;
    Degan dgn = new Degan();
    int Boyolali(){
        int byl = biaya*15;
        return byl;
    }
    
    int Boyolali(double Pasokan){
        double berat = dgn.berat*Pasokan;
        double byl = Math.ceil(berat/beban);
        return (int)byl;
    }
    
    int Salatiga(){
        int slt = biaya*35;
        return slt;
    }
    
    int Salatiga(double Pasokan){
        double berat = dgn.berat*Pasokan;
        double slt = Math.ceil(berat/beban);
        return (int)slt;
    }
    
    int Klaten(){
        int klt = biaya*30;
        return klt;
    }
    
    int Klaten(double Pasokan){
        double berat = dgn.berat*Pasokan;
        double klt = Math.ceil(berat/beban);
        return (int)klt;
    }
    
    int Kudus(){
        int kds = biaya*75;
        return kds;
    }
    
    int Kudus(double Pasokan){
        double berat = dgn.berat*Pasokan;
        double kds = Math.ceil(berat/beban);
        return (int)kds;
    }
}
