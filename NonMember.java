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
    public class NonMember extends Member {

    public NonMember() {

    }

    public NonMember(String nama, int diskon) {
        super(nama, diskon);
    }

    public String diskonLayanan() {
        totalS = servicePrice[getS()];
        return "Anda tidak mendapat diskon "
                + "\nUntuk layanan " + service[getS()]
                + ". Anda membayar Rp." + totalS + "\n";
    }

    public String displayMesasage() {
        return "====INFORMASI PEMBAYARAN===="
                + "\nNama        : " + nama
                + "\nJenis       : Non-member"
                + "\nLayanan     : " + service[getS()]
                + "\nProduct     : " + product[getP()]
                + "\nTotal bayar : Rp." + (totalP + totalS);
    }

}
