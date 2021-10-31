/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author Kaitoga
 */
public class Option {
    int option;
    char lanjut;
    void Pilihan(){
        Scanner input = new Scanner(System.in);
        
        
        do {
            System.out.println("1. Pengecekan Pythagoras");
            System.out.println("2. Hitung nilai sisi miring");
            System.out.println("3. Hitung nilai sisi siku");
            System.out.println("4. Keluar");
            System.out.println("Masukkan Option: ");
            option = input.nextInt();
            input.nextLine();
            switch(option){
                case 1 :
                    System.out.println("Pengecheckan Pythagoras");
                    Cek a = new Cek();
                    break;
                case 2 :
                    System.out.println("Menentukan sisi miring segitiga");
                    SisiMiring b = new SisiMiring();
                    break;
                case 3 :
                    System.out.println("Menentukan sisi siku-siku segitiga");
                    SisiSiku c = new SisiSiku();
                    break;
                case 4 :
                    System.exit(0);
                    
                default :
                    System.out.println("Inputan Salah, coba lagi? (y/n)");
                    lanjut = input.nextLine().charAt(0);
        } 
        }while(lanjut !='n');
    }
}
