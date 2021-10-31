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
public class SisiSiku {
    Scanner input = new Scanner(System.in);
    int a;
    double b;
    int c;
    public SisiSiku(){
        System.out.print("Masukkan nilai C (sisi miring): ");
        c = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan nilai A: ");
        a = input.nextInt();
        input.nextLine();
        
        b = Math.sqrt( Math.pow(c,2) - Math.pow(a,2) );
        System.out.println("Sisi Miring dari pitagoras diatas adalah : "+b);
        
    }
}
