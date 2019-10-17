/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan34.kalkulator;

/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Tugas : Kalkulator
 */
public class Kalkulator {
    public double value1;
    public double value2;
    
    public double tambahBilangan(){
        return value1 + value2;
    }
    public double kurangBilangan(){
        return value1 - value2;
    }
    public double kaliBilangan(){
        return value1 * value2;
    }
    public double bagiBilangan(){
        return value1 / value2;
    }
    public double sisaBilangan(){
        return value1 % value2;
    }
}
