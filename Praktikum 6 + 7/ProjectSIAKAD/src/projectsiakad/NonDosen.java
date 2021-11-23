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
public class NonDosen extends Pegawai{
    NonDosen(String id, String nama, int gol, LocalDate tgllhr){
        super(id, nama, gol, tgllhr);
    }
    
    long hitungTunjPegawai(){
        long tunjPegawai = 1000000;
        return tunjPegawai;
    }
    
    long hitungTotalGaji(){
        long total = this.hitungGajiPokok() + this.hitungTunjPegawai();
        return total;
    }
    
    void printPegawai(){
        System.out.println("ID Pegawai   : " + this.kodePegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.tglLahir);
        System.out.println("Usia         : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok   : Rp " + this.hitungGajiPokok());
        System.out.println("Tunj Pegawai : Rp " + this.hitungTunjPegawai());
        System.out.println("Total Gaji   : Rp " + this.hitungTotalGaji());
    }
}
