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
public class PenjualanBuah {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    String nama_barang;
  int jml_barang, harga_satuan, total_harga, diskon, total_bayar;
    
    System.out.println("\nPEMBELIAN ");
    System.out.println();
    System.out.print("Nama Barang  : ");
        nama_barang = scan.nextLine();
    System.out.print("Jumlah Barang  : ");
        jml_barang = scan.nextInt();
    System.out.print("Harga Satuan  : ");
        harga_satuan = scan.nextInt();
  
    }    
}
