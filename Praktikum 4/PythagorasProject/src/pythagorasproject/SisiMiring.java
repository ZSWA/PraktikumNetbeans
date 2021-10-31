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
public class SisiMiring {
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    double c;
    public SisiMiring(){
        System.out.print("Masukkan nilai A: ");
        a = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan nilai B: ");
        b = input.nextInt();
        input.nextLine();
        
       c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) );
       System.out.println("Sisi Miring dari pitagoras diatas adalah : "+c);
        
    }
}
