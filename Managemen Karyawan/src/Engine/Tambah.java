/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

import Data.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Kaitoga
 */
public class Tambah extends Checker {
    Scanner input = new Scanner(System.in);
    
    public Pegawai inputan(){
        System.out.println();
        System.out.println("==================== Tambah Karyawan =========================");
        System.out.print("Masukkan kode karyawan: ");
        String kode = input.nextLine();
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();
        
        
        boolean ct = true;
        String tgl = "0";
        while(ct == true){
            System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
            tgl = input.nextLine();
            ct = super.CheckTgl(tgl);
        }
        int usia = Period.between(LocalDate.parse(tgl), LocalDate.now()).getYears();
        
        boolean cg = true;
        String gol = "";
        while(cg == true){
            System.out.print("Masukkan golongan (A/B/C): ");
            gol = input.nextLine().toUpperCase();
            cg = super.CheckGol(gol);
        }
        gol = gol;
        
        boolean cn = true;
        int nikah = 0;
        while(cn == true){
            System.out.print("Masukkan status menikah (0:belum, 1:sudah): ");
            nikah = input.nextInt();
            input.nextLine();
            cn = super.CheckNikah(nikah);
        }
        nikah = nikah;
        
        int anak;
        if(nikah == 1){
            System.out.print("Masukkan jumlah anak: ");
            anak = input.nextInt();
            input.nextLine();
        }else{
            anak = 0;
        }
        Pegawai x = new Pegawai(kode, nama, alamat,gol, usia, nikah, anak);
        return x;
    }
}
