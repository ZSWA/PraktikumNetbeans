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
public class Silver extends Member{
    int diskon = 1;
    
    
    
    public Silver(DataMember isi) {
        super.member = isi;
        super.biayaSewa = 25000;
        super.inputPinjam();
    }
    
    public void hitungBiaya() {
        this.poin = 1 * banyakHari;
        this.totalSewa = this.biayaSewa * this.banyakHari;
        int diskon = this.totalSewa * this.diskon/100;
        this.totalSewa -= diskon;
    }
    
    public void output() {
        super.output();
        System.out.println("Total Sewa		: " + this.totalSewa);
        System.out.println("Jumlah Poin		: " + this.poin);
    }
}
