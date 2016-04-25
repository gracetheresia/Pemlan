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
public class Jaket {


    public final int jaketA = 100000;
    public final int jaketB = 125000;
    public final int jaketC = 175000;

    private int hargaA;
    private int hargaB;
    private int hargaC;

    private int jumlahA;
    private int jumlahB;
    private int jumlahC;

    private static int total;

    public void beliJaket(int tipe, int jumlah) {
        if (tipe == 1) {
            this.jumlahA += jumlah;
        } else if (tipe == 2) {
            this.jumlahB += jumlah;
        } else {
            this.jumlahC += jumlah;
        }
    }

    public void alur1() {
        if (jumlahA > 100) {
            this.hargaA = jaketA - 5000;
            this.total += jumlahA * hargaA;
        } else {
            this.hargaA = jaketA;
            this.total += jumlahA * hargaA;
        }
    }

    public void alur2() {
        if (jumlahB > 100) {
            this.hargaB = jaketB - 5000;
            this.total += jumlahB * hargaB;
        } else {
            this.hargaB = jaketB;
            this.total += jumlahB * hargaB;
        }
    }

    public void alur3() {
        if (jumlahC > 100) {
            this.hargaC = jaketC - 15000;
            this.total += jumlahC * hargaC;
        } else {
            this.hargaC = jaketC;
            this.total += jumlahA * hargaC;
        }
    }

    public static int getTotal() {
        return total;
    }

    public static void tampilan() {
        System.out.println("\t\tWARUNG JAKET ");
        System.out.println("    Menyediakan Berbagai Macam Pilihan Jaket");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t   Harga Jaket A : 100.000\n\t   Harga Jaket B : 125.000\n\t   Harga Jaket C : 175.000");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t PROMO TERBATAS\n Jika Anda Membeli Lebih Dari 100 Potong Jaket, "
                + "\n\tMaka Anda Akan Mendapat Diskon");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("   1. Jaket A : Mendapatkan potongan 5000\n\t\tHarga Menjadi 95.000/Buah");
        System.out.println("   2. Jaket B : Mendapatkan potongan 5000\n\t\tHarga Menjadi 120.000/Buah");
        System.out.println("   3. Jaket C : Mendapatkan potongan 15000\n\t\tHarga Menjadi 160.000/Buah");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print(" Masukan Pilihan Anda : ");
    }

    public String getNota(int tipe) {
        if (tipe == 1) {
            return " Jaket A\t   : " + jumlahA + " x Rp. " + hargaA + "\n Harga Pembelian Jaket   Rp. " + jumlahA * hargaA;
        } else if (tipe == 2) {
            return " Jaket B\t   : " + jumlahB + " x Rp. " + hargaB + "\n Harga Pembelian Jaket   Rp. " + jumlahB * hargaB;
        } else if (tipe == 3) {
            return " Jaket C\t   : " + jumlahC + " x Rp. " + hargaC + "\n Harga Pembelian Jaket   Rp. " + jumlahC * hargaC;
        } else {
            return "Tidak ada!!!";
        }
    }
}

    

