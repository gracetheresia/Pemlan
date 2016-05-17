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
    public class Premium extends Member {

    public Premium() {

    }

    public Premium(String nama, int diskon) {
        super(nama, diskon);
    }

    @Override
    public String diskonLayanan() {
        double total = servicePrice[getS()] * diskon;
        totalS = servicePrice[getS()] - total;
        return "Anda mendapatkan diskon sebesar " + (diskon * 100) + "% "
                + "\nUntuk layanan " + service[getS()]
                + ". Anda cukup membayar Rp." + totalS + "\n";
    }

    @Override
    public String displayMesasage() {
        return "====INFORMASI PEMBAYARAN===="
                + "\nNama        : " + nama
                + "\nJenis       : Premium member"
                + "\nLayanan     : " + service[getS()]
                + "\nProduct     : " + product[getP()]
                + "\nTotal bayar : Rp." + (totalP + totalS);
    }
}

    

