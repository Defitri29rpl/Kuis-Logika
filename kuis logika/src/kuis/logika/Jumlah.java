/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.logika;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Jumlah {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int awal;
        awal = 1;
        System.out.print("Masukkan bilangan akhir:");
        int akhir = sc.nextInt();
        int total = 0;
        int jumlah = 1-awal-akhir;
        System.out.print("Total Bilangan"+""+"="+"");
        while (awal <= akhir) {
            System.out.print(awal +"");
            System.out.print("+");
            System.out.print("");
            total += awal;
            awal++;
        }
        System.out.print("="+""+total);
}
    
}
