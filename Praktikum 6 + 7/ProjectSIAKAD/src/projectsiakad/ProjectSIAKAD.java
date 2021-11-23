/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsiakad;

import java.time.*;

/**
 *
 * @author Kaitoga
 */
public class ProjectSIAKAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai("P01", "Rosihan Ari", 2, LocalDate.of(1979, 9, 1));
        Dosen p2 = new Dosen("P02", "Yusfia Hafidz", 1, LocalDate.of(1979, 9, 17), "8888");
        NonDosen p3 = new NonDosen("P03", "Zainuri SWA", 1, LocalDate.of(2001, 10, 27));
        
        p1.printPegawai();
        System.out.println(" ");
        p2.printPegawai();
        System.out.println(" ");
        p3.printPegawai();
    }
    
}
