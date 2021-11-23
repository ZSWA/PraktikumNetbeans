/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Membership;

/**
 *
 * @author Kaitoga
 */
public class DataMember {
    String ID;
    String Nama;
    public String Jenis;
    
    public DataMember(String id, String nama, String jenis) {
        this.ID = id;
        this.Nama = nama;
        this.Jenis = jenis;
    }
    
    void output() {
        System.out.println("ID Member       : " + this.ID);
        System.out.println("Nama Member     : " + this.Nama);
        System.out.println("Jenis Member    : " + this.Jenis);
        System.out.println("");
    }
}
