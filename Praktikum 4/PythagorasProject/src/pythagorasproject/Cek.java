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
public class Cek {
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    int c;
    public Cek(){
        System.out.print("Masukkan nilai A: ");
        a = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan nilai B: ");
        b = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan nilai C: ");
        c = input.nextInt();
        input.nextLine();
        
        if (Math.pow(a,2) + Math.pow(b,2)==Math.pow(c,2)){
            System.out.println("Susunan bilangan tersebut adalah Pythagoras");
        } else {
            System.out.println("Susunan bilangan tersebut Bukan Pythagoras");
        }
        
    }
}
