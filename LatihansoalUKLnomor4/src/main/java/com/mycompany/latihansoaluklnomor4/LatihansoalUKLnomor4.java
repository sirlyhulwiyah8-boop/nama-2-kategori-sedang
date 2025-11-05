/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihansoaluklnomor4;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class LatihansoalUKLnomor4 {

    static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;  // rumus: π × r² × t
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        // Panggil fungsi dengan parameter
        double hasil = hitungVolume(r, t);

        System.out.println("\nVolume tabung adalah: " + hasil + " cm³");
    }
}