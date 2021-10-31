/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kaitoga
 */
public class Mekanisme {
    int inputan;
    Scanner input = new Scanner(System.in);
    
    
    
    void mesin(){
        Random r = new Random();
        int random = r.nextInt((100 - 0) + 1) + 0;
        do{
            
            System.out.print("Masukkan Tebakan Anda: ");
            inputan = input.nextInt();
            input.nextLine();
            if (inputan < random){
                System.out.println("Jawaban Salah!");
                System.out.println("Hint : Jawaban anda terlalu Kecil");
                
            } else if (inputan > random){
                System.out.println("Jawaban Salah!");
                System.out.println("Hint : Jawaban anda terlalu Besar");
                
            } else {
                System.out.println("JAWABAN ANDA BENAR!!");
            }
        } while (inputan != random);
        
    }
}
