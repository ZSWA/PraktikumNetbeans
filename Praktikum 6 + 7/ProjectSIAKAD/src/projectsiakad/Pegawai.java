/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsiakad;
import java.time.*;
/**
 *
 * @author Kaitoga
 */
public class Pegawai {
    String kodePegawai;
    String nama;
    int gol;
    LocalDate tglLahir;
    
    Pegawai(String id,String nama, int gol, LocalDate tgllhr){
        this.kodePegawai = id;
        this.nama = nama;
        this.gol = gol;
        this.tglLahir = tgllhr;
    }
    
    int hitungUsia(){
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(this.tglLahir, today);
        return selisih.getYears();
    }
    
    long hitungGajiPokok(){
        long gapok = 0;
        if (this.gol == 1){
            if(this.hitungUsia()<40){
                gapok = 3500000;
            } else{
                gapok = 4500000;
            }
        } else if(this.gol == 2){
            if (this.hitungUsia()<40){
                gapok = 5000000;
            } else {
                gapok = 6000000;
            }
        }
        return gapok;
    }
    
    void printPegawai(){
        System.out.println("ID Pegawai   : "+this.kodePegawai);
        System.out.println("Nama Pegawai : "+this.nama);
        System.out.println("Golongan     : "+this.gol);
        System.out.println("Tgl Lahir    : "+this.tglLahir);
        System.out.println("Gaji Pokok   : "+this.hitungGajiPokok());
    }
}
