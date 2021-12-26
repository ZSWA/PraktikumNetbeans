/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Engine.*;
import java.util.Scanner;

/**
 *
 * @author Kaitoga
 */
public class Menu {
     public static void main(String[] args) {
        
        Processor a = new Processor();
        Tambah t = new Tambah();
        Checker c = new Checker();
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        
        
        while(loop == true){   
            System.out.println();
            System.out.println("====================================== Menu Utama ======================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Menu pilihan: ");
            String m = input.nextLine();
            switch(m){
                case "1" :
                    
                    boolean tambah = true;
                    while(tambah == true){
                        a.tambah(t.inputan());
                        System.out.println();
                        System.out.println("Data berhasil disimpan!");
                        System.out.println();
                        tambah = c.CheckLoop("Tambah");
                    }
                    
                    loop = true;
                    break;
                case "2":
                    boolean hapus = true;
                    while(hapus == true){
                        System.out.println();
                        System.out.println("=================== Hapus Karyawan ================");
                        System.out.print("Masukkan Kode Karyawan : ");
                        String i = input.nextLine();
                        a.hapus(i);
                        System.out.println();
                        hapus = c.CheckLoop("Hapus");
                    }
                    break;
                case "3":
                    boolean cari = true;
                    while(cari == true){
                        System.out.println();
                        System.out.println("=================== Cari Karyawan ================");
                        System.out.print("Masukkan Kode Karyawan : ");
                        String h = input.nextLine();
                        a.cari(h);
                        System.out.println();
                        cari = c.CheckLoop("Cari");
                    }
                    break;
                case "4":
                    System.out.println();
                    a.tampil();
                    System.out.println();
                    c.ChecksubLoop();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default :
                    loop = true;
                    break;
            }
            
        }
     }
}
