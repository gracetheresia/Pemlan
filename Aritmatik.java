/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author My Computer
 */
public class Aritmatik {
    public static void hitungPenjumlahan(double a, double b) {
        double nilai = a + b;
        System.out.println(" Hasil Dari Penjumlahan Adalah : " + nilai);
    }

    public static void hitungPengurangan(double a, double b) {
        double nilai = a - b;
        System.out.println(" Hasil Dari Pengurangan Adalah : " + nilai);
    }

    public void hitungPerkalian(double a, double b) {
        double nilai = a * b;
        System.out.println(" Hasil Dari Perkalian Adalah : " + nilai);
    }
     public void hitungPembagian(double a, double b) {
        double nilai = a / b;
        System.out.println(" Hasil Dari Pembagian Adalah : " + nilai);
    }

    public void hitungPecahan(int pm, int pn) {
        for (int i = pn; i >= 1; i--) {
            if (pm % i == 0 && pn % i == 0) {
                pm /= i;
                pn /= i;
            }
        }
        if (pn == 1) {
            System.out.println(" Hasil penyederhanaan = " + pm);
        } else {
            System.out.println(" Hasil penyederhanaan = " + pm + "/" + pn);

        }

    }

}

    

