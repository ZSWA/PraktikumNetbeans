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
public class Gold extends Member{
    int diskon = 2;
    int cashback =  5000;
    
    
    public Gold(DataMember isi) {
        super.member = isi;
        super.biayaSewa = 30000;
        super.inputPinjam();
    }
    
    public void hitungBiaya() {
        this.poin = 5 * banyakHari;
        this.totalSewa = this.biayaSewa * this.banyakHari;
        int diskon = this.totalSewa * this.diskon/100;
        this.totalSewa -= diskon;
    }
    
    public void output() {
        super.output();
        System.out.println("Total Sewa		: " + this.totalSewa);
        System.out.println("Jumlah Poin		: " + this.poin);
        System.out.println("Jumlah Cashback     : " + this.cashback);
    }
}
