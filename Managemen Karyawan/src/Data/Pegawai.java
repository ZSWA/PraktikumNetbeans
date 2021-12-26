/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Kaitoga
 */
public class Pegawai {
    public String kode;
    private String nama;
    private String alamat;
    private String gol;
    private String statusn;
    private int nikah;
    private int anak;
    private int usia;
    private int gapok;
    private double tunjnikah;
    private double tunjanak;
    private double tunjpeg;
    private double gator;
    private double potongan;
    private double gaber;
    
        
    
    public Pegawai(String kode, String nama, String alamat, String gol,int usia, int nikah, int anak) {
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.gol = gol;
        this.nikah = nikah;
        this.anak = anak;
        this.usia = usia;
        
        switch(gol){
            case "A":
                this.gapok = 5000000;
                break;
            case "B":
                this.gapok = 6000000;
                break;
            case "C" :
                this.gapok = 7000000;
                break;
        }
    }
    
    public void hitungGaji(int anak, int umur, int nikah){
        
        if(nikah == 1){
            this.tunjnikah = 0.1*gapok;
        }else{
            this.tunjnikah = 0;
        }
        
        if(umur > 30){
            this.tunjpeg = 0.15*gapok;
        }else{
            this.tunjpeg = 0;
        }
        
        this.tunjanak = anak*(0.05*gapok);
        
        this.gator = this.gapok+ this.tunjnikah + this.tunjanak + this.tunjpeg;
        this.potongan = 0.025*gator;
        this.gaber = this.gator-this.potongan;
    }
    
    public void DaftarData(){
        if(this.nikah == 1){
            statusn = "Sudah Menikah";
        }else{
            statusn = "Belum Menikah";
        }
        System.out.println(this.kode+"         "+this.nama+"       "+this.gol+"       "+this.usia+"        "+this.statusn+"              "+this.anak);
    }
    
    public void HasilCari(){
        hitungGaji(this.anak, this.usia, this.nikah);
        System.out.println();
        System.out.println("================== Data Karyawan ==================");
        System.out.println("Kode Karyawan      : "+this.kode);
        System.out.println("Nama Karyawan      : "+this.nama);
        System.out.println("Golongan           : "+this.gol);
        System.out.println("Usia               : "+this.usia);
        System.out.println("Status Menikah     : "+this.statusn);
        System.out.println("Jumlah Anak        : "+this.anak);
        System.out.println("----------------------------------------------");
        System.out.println("Gaji Pokok         : "+this.gapok);
        System.out.println("Tunjangan Nikah    : "+this.tunjnikah);
        System.out.println("Tunjangan Pegawai  : "+this.tunjpeg);
        System.out.println("Tunjangan Anak : "+this.tunjanak);
        System.out.println("----------------------------------------------- +");
        System.out.println("Gaji Kotor         : "+this.gator);
        System.out.println("Potongan           : "+this.potongan);
        System.out.println("----------------------------------------------- -");
        System.out.println("Gaji Kotor         : "+this.gaber);
        System.out.println("==================================================");
    }
}
