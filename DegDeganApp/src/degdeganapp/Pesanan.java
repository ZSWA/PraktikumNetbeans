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
public class Pesanan {
    Degan dgn = new Degan();
    Transportasi tsp = new Transportasi();
    int pesanan;
    public Pesanan(){
        //Boyolali
        int byl = tsp.Boyolali()*tsp.Boyolali(5000)+dgn.Boyolali();
        int slt = tsp.Salatiga()*tsp.Salatiga(7500)+dgn.Salatiga();
        int klt = tsp.Klaten()*tsp.Klaten(8300)+dgn.Klaten();
        int kds = tsp.Kudus()*tsp.Kudus(9100)+dgn.Kudus();
        
        pesanan = byl+slt+klt+kds;
    }
}
