/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kaitoga
 */
public class Mekanik {
    
    ArrayList<String> dataBil = new ArrayList<String>();
    
    void input() {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Menu Data ArrayList:\n" +
                            "1. Tambah data\n" +
                            "2. Cari Data\n" +
                            "3. Hapus Data\n" +
                            "4. Tampil Data\n" +
                            "5. Keluar");
            System.out.print("Pilih nomor berapa: ");

            int inputan = input.nextInt();
            switch(inputan) {
                case 1:
                    System.out.print("Masukkan data string: ");
                    input.nextLine();
                    this.dataBil.add(input.nextLine());
                    System.out.println("Daftar string dalam array list: " + this.dataBil);
                    input.nextLine();
                    break;
                    
                case 2:
                    System.out.print("String yang mau dicari: ");
                    input.nextLine();
                    String cari = input.nextLine();
                    int index = this.dataBil.indexOf(cari);
                    if(index >= 0) {
                        System.out.println("String '" + cari + "' ada di index ke-"+ index +" di dalam data");
                        input.nextLine();
                    } else {
                        System.out.println("String ‘"+ cari +"’ tidak ada dalam data");
                        input.nextLine();
                    }
                    break;
                    
                case 3:
                    System.out.print("String yang mau dihapus: ");
                    input.nextLine();
                    String hapus = input.nextLine();
                    int indexnya = this.dataBil.indexOf(hapus);
                    if(indexnya >= 0) {
                        this.dataBil.remove(indexnya);
                        System.out.println("String '" + hapus + "' sudah dihapus di dalam data");
                    } else {
                        System.out.println("String ‘"+ hapus +"’ tidak ada dalam data");
                    }
                    System.out.println("Daftar string dalam array list: " + this.dataBil);
                    input.nextLine();
                    break;
                    
                case 4:
                    System.out.println("Daftar string dalam array list: " + this.dataBil);
                    input.nextLine();
                    input.nextLine();
                    break;
                    
                case 5:
                    System.exit(0);
            }
        }
        
    }
}
