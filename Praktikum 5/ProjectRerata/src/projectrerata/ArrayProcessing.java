/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Scanner;

/**
 *
 * @author Kaitoga
 */
public class ArrayProcessing {
    int[] dataBil = new int[100];
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
        
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum+= data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMax(){
        int max = this.dataBil[0];
        
        for(int i=1; i<this.n; i++){
            if (this.dataBil[i]>max){
                max = this.dataBil[i];
            }
        }
        return max;
    }
    
    int cariMin(){
        int min = this.dataBil[0];
        
        for(int i=1; i<this.n; i++){
            if (this.dataBil[i]<min){
                min = this.dataBil[i];
            }
        }
        return min;
    }
    
    void output(){
        System.out.println("Rerata: "+this.hitungRerata(this.dataBil));
        System.out.println("Data terbesar adalah : "+cariMax());
        System.out.println("Data terkecil adalah : "+cariMin());
        int[] urut = this.urutkan();
        System.out.print("Urutan :");
        for (int i=0; i<this.n; i++) {
            System.out.print(urut[i] + " ");
        }
        System.out.println();
    }
    
    int[] urutkan(){
        int[] arr = this.dataBil;
        for (int i = 0; i <this.n; i++) {
            for (int j = 0; j < this.n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        return arr;
    }
}
