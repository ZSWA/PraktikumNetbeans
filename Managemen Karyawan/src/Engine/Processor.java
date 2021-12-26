/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

import Data.*;
import java.util.ArrayList;

/**
 *
 * @author Kaitoga
 */
public class Processor {
    private ArrayList<Pegawai> datas = new ArrayList<Pegawai>();
    
    public void tambah(Pegawai data){
        this.datas.add(data);
    }
    
    public void hapus(String kode){
        this.datas.removeIf(item -> item.kode.equals(kode));
    }
    
    public void cari(String kode){
        boolean found = false;
        int index = -1;
        for(int i=0; i<this.datas.size(); i++){
            if (this.datas.get(i).kode.equals(kode)){
                index = i;
                found = true;
            }
        }
        
        if (found == true){
            System.out.println();
            this.datas.get(index).HasilCari();
        } else {
            System.out.println();
            System.out.println("Data karyawan tidak ditemukan");
            System.out.println();
        }
    }
    
    public void tampil(){
        System.out.println("===================================");
        System.out.println("DATA KARYAWAN");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("KODE KARY	 NAMA KARY	  GOL	  USIA	   STATUS NIKAH		  JUMLAH ANAK");
        System.out.println("-------------------------------------------------------------------------------------");
        for(Pegawai item: this.datas){
            item.DaftarData();
        }
    }
}
