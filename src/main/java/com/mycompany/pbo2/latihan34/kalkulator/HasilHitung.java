/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Tugas : Kalkulator
 */
public class HasilHitung {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();
        
        System.out.println("\nHasil Pertambahan : " + kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + formatBagi(
                kalkulator.bagiBilangan(), kalkulator.sisaBilangan()
        ));
        System.out.println("Hasil Sisa : " + kalkulator.sisaBilangan());
    }

    private static String formatBagi(double bagiBilangan, double sisaBilangan) {
        String bagi = String.format("%.3f", bagiBilangan);
        
        int idx = bagi.indexOf(".");
        
        if(idx < 0) idx = bagi.indexOf(",");
        
        if(sisaBilangan > 0) {
            bagi = bagi.substring(0, idx) + "," + bagi.substring(idx+1, idx+3);
        } else {
            bagi = bagi.substring(0, idx);
        }
        
        return bagi;
        
    }
}
