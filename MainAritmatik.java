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
  import java.util.Scanner;
public class MainAritmatik {
  

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ulang = 0;
        boolean pilihan = true;
        do {
            System.out.println("~~~~~~~~~~~ Daftar Pilihan ~~~~~~~~~~~");
            System.out.println("\t 1. Penjumlahan");
            System.out.println("\t 2. Pengurangan");
            System.out.println("\t 3. perkalian ");
            System.out.println("\t 4. Pembagian");
            System.out.println("\t 5. Pecahan");
            System.out.println("\t 6. Keluar");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Masukan pilihan : ");
            int masukkan = in.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            switch (masukkan) {
                case 1:
                    System.out.println(" Penjumlahan");
                    System.out.print(" Masukkan Nilai 1 : ");
                    double penjum = in.nextDouble();
                    System.out.print(" Masukkan Nilai 2 : ");
                    double penjum2 = in.nextDouble();
                    Aritmatik.hitungPenjumlahan(penjum, penjum2);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println(" Pengurangan");
                    System.out.print(" Masukkan Nilai 1 : ");
                    double pengur = in.nextDouble();
                    System.out.print(" Masukkan Nilai 2 : ");
                    double pengur2 = in.nextDouble();
                    Aritmatik.hitungPengurangan(pengur, pengur2);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("");
                    break;
                case 3:
                    Aritmatik a = new Aritmatik();
                    System.out.println(" Perkalian");
                    System.out.print(" Masukkan Nilai 1 : ");
                    double kali = in.nextDouble();
                    System.out.print(" Masukkan Nilai 2 : ");
                    double kali2 = in.nextDouble();
                    a.hitungPerkalian(kali, kali2);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("");
                    break;
                case 4:
                    Aritmatik c = new Aritmatik();
                    System.out.println(" Pembagian");
                    System.out.print(" Masukkan Nilai 1 : ");
                    double bagi = in.nextDouble();
                    System.out.print(" Masukkan Nilai 2 : ");
                    double bagi2 = in.nextDouble();
                    c.hitungPembagian(bagi, bagi2);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("");
                    break;
                    
                case 5:
                    Aritmatik b = new Aritmatik();
                    System.out.println(" Pecahan");
                    System.out.print(" Masukkan Penyebut : ");
                    int angka = in.nextInt();
                    System.out.print(" Masukkan Pembilang : ");
                    int angka1 = in.nextInt();
                    b.hitungPecahan(angka, angka1);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("");
                    break;
                case 6:
                    System.out.println(" Keluar");
                    System.exit(0);
                    break;
                default:
                    System.out.println(" Pilihan Tidak Tersedia!!");
                    System.exit(0);
                    break;
            }
            System.out.print(" Apakah mengulang Lagi? (y/t) : ");
            String rubah = in.next();
            System.out.println("");
            switch (rubah) {
                case "y":
                    pilihan = true;
                    break;
                case "t":
                    System.exit(0);
                    break;
                default:
                    pilihan = false;
                    System.exit(0);
                    break;
            }
        } while (ulang == 0);
    }
}

    
