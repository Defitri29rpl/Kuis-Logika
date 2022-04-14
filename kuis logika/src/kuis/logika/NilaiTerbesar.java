/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.logika;

/**
 *
 * @author User
 */
public class NilaiTerbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka1, angka2, maks;
        angka1 = 7;
        angka2 = 8;
        if (angka1>angka2){
            maks = angka1;
        }else {
            maks = angka2;
        }
        System.out.println("Angka maksimum adalah= "+maks);
    }
    
}
