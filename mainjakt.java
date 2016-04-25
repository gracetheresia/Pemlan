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

public class mainjakt {
  

    public static void main(String[] args) {
        Jaket levis = new Jaket();
        Scanner in = new Scanner(System.in);
        int ulang = 0;
        boolean pilihan = true;
        do {
            Jaket.tampilan();
            int masuk = in.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            switch (masuk) {
                case 1:
                    System.out.println(" Jaket A");
                    System.out.print(" Jumlah Pemebelian : ");
                    int jumlahA = in.nextInt();
                    levis.beliJaket(1, jumlahA);
                    levis.alur1();
                    System.out.println(" Total Pembayaran");
                    System.out.println(levis.getNota(1));
                    break;
                case 2:
                    System.out.println(" Jaket B");
                    System.out.print(" Jumlah Pemebelian : ");
                    int jumlahB = in.nextInt();
                    levis.beliJaket(2, jumlahB);
                    levis.alur2();
                    System.out.println(" Total Pembayaran");
                    System.out.println(levis.getNota(2));
                    break;
                case 3:
                    System.out.println(" Jaket C");
                    System.out.print(" Jumlah Pemebelian : ");
                    int jumlahC = in.nextInt();
                    levis.beliJaket(3, jumlahC);
                    levis.alur3();
                    System.out.println(" Total Pembayaran");
                    System.out.println(levis.getNota(3));
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia!!");
                    System.exit(0);
                    break;
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print(" Anda Belanja Lagi? (y/t) : ");
            String rubah = in.next();
            switch (rubah) {
                case "y":
                    pilihan = true;
                    break;
                case "t":
                    System.out.println("Terima Kasih Telah Berbelanja di toko kami.Silahkan Datang kembali :)");
                    System.exit(0);
                    break;
                default:
                    pilihan = false;
                    System.exit(0);
                    break;
            }            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
        } while (pilihan = true);
    }
}

    
