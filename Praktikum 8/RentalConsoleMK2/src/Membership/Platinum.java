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
public class Platinum extends Member{
    private int diskon = 3;
    private int bonusPulsa;
    private int cashback =  10000;
    
    
    public Platinum(DataMember isi) {
        super.member = isi;
        super.biayaSewa = 45000;
        super.inputPinjam();
    }
    
    public void hitungBiaya() {
        this.poin = 10 * banyakHari;
        this.totalSewa = this.biayaSewa * this.banyakHari;
        int diskon = this.totalSewa * this.diskon/100;
        this.bonusPulsa = 5000 * banyakHari;
        this.totalSewa -= diskon;
    }
    
    public void output() {
        super.output();
        System.out.println("Total Sewa		: " + this.totalSewa);
        System.out.println("Jumlah Poin		: " + this.poin);
        System.out.println("Jumlah Cashback     : " + this.cashback);
        System.out.println("Bonus Pulsa         : " + this.bonusPulsa);
    }
}
