/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

/**
 *
 * @author My Computer
 */
import java.util.Scanner;

public class DemoSalon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil;
        String nama;
        Member n;
        System.out.println("=============      SELAMAT DATANG    ==============");
        System.out.println("=============    DI SALON KECANTIKAN  =============");
        System.out.println("==================================================");
        System.out.print("Masukkan nama : ");
        nama = in.next();
        System.out.println("Jenis keanggotaan :");
        System.out.println("  1. Premium    3. Silver");
        System.out.println("  2. Gold       4. Non-member");
        System.out.print("Jenis keanggotaan Anda : ");
        pil = in.nextInt();
      
        switch (pil) {
            
            case 1:
                n = new Premium(nama, 20);
                n.ServiceMessage();
                System.out.print("Layanan yang Anda pilih :");
                n.setS(in.nextInt());
                System.out.println(n.diskonLayanan());
                n.ProductMessage();
                System.out.print("Produk yang Anda pilih :");
                n.setP(in.nextInt());
                System.out.println(n.diskonProduk());
                System.out.println(n.displayMesasage());
                break;
            case 2:
                n = new Gold(nama, 15);
                n.ServiceMessage();
                System.out.print("Layanan yang Anda pilih :");
                n.setS(in.nextInt());
                System.out.println(n.diskonLayanan());
                n.ProductMessage();
                System.out.print("Produk yang Anda pilih :");
                n.setP(in.nextInt());
                System.out.println(n.diskonProduk());
                System.out.println(n.displayMesasage());
                break;
            case 3:
                n = new Silver(nama, 10);
                n.ServiceMessage();
                System.out.print("Layanan yang Anda pilih :");
                n.setS(in.nextInt());
                System.out.println(n.diskonLayanan());
                n.ProductMessage();
                System.out.print("Produk yang Anda pilih :");
                n.setP(in.nextInt());
                System.out.println(n.diskonProduk());
                System.out.println(n.displayMesasage());
                break;
            case 4:
                n = new NonMember(nama, 10);
                n.ServiceMessage();
                System.out.print("Layanan yang Anda pilih :");
                n.setS(in.nextInt());
                System.out.println(n.diskonLayanan());
                n.ProductMessage();
                System.out.print("Produk yang Anda pilih :");
                n.setP(in.nextInt());
                System.out.println(n.diskonProduk());
                System.out.println(n.displayMesasage());
                break;
                default:
                    System.out.println("Pilihan Tidak Tersedia.Ulangi Pilihan");
                    System.exit(0);
                    break;
        }
            
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("\t\t   TERIMA KASIH!");
        System.out.println("==================================================");
        }
}


