/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Kaitoga
 */
public class Checker {
    Scanner input = new Scanner(System.in);
    Submenu sm = new Submenu();
    
    public boolean CheckLoop(String varloop){
        boolean y = true;
        boolean x = true;
        while(y == true){
            sm.tampilmenu();
            System.out.println("2. "+varloop+" Data Kembali");
            System.out.print("\nMenu pilihan: ");
            String menu = input.nextLine();
            if(menu.equals("1")){
                y = false;
                x = false;
            }else if(menu.equals("2")){
                y = false;
                x = true;
            }else{
                System.out.println("\nMasukan anda salah!\n");
                y = true;
            }
        }
        return x;
    }
    
    public void ChecksubLoop(){
        boolean y = true;
        while(y == true){
            sm.tampilmenu();
            System.out.print("\nMenu pilihan: ");
            String menu = input.nextLine();
            if(menu.equals("1")){
                y = false;
            }else{
                System.out.println("\nMasukan anda salah!");
                y = true;
            }
        }
    }
    
    protected boolean CheckTgl(String tgl){
        try{
            Period.between(LocalDate.parse(tgl), LocalDate.now()).getYears();
            return false;
        }catch(Exception e){
            System.out.println("Inputan yang anda masukkan salah");
            return true;
        }  
    }
    
    protected boolean CheckGol(String gol){
        if(gol.equals("A")){
            return false;
        }else if(gol.equals("B")){
            return false;
        }else if(gol.equals("C")){
            return false;
        }else{
            System.out.println("Inputan yang anda masukkan salah");
            return true;
        }
    }
    
    protected boolean CheckNikah(int nikah){
        if(nikah == 0){
            return false;
        }else if(nikah == 1){
            return false;
        }else{
            System.out.println("Inputan yang anda masukkan salah");
            return true;
        }
    }
}
