package praktikum7;

public abstract class Member {

    protected String nama;
    protected String[] service = {"Gunting", "Bleaching", "Padicure", "SPA"};
    protected String[] product = {"Pigmentation pacakge", "Glowing pacakge", "Cleansing package", "Free Acne package"};
    protected int[] servicePrice = {20000, 35000, 30000, 120000};
    protected int[] productPrice = {95000, 95000, 75000, 85000};
    protected int s, p;
    protected double diskon, totalP, totalS;

    public Member() {
        this.diskon = 0.1; //diskon default sebesar 10% 
    }

    public Member(String nama, double diskon) {
        this.nama = nama;
        this.diskon = (diskon / 100);
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s - 1;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p - 1;
    }

    public void ServiceMessage() {
        System.out.println("No._||_____Jenis layanan____||_______Harga (Rp)_____||");
        for (int i = 0; i < service.length; i++) {
            System.out.printf("%-3d || %-20s || %-20s ||\n", (i + 1), service[i], servicePrice[i]);
        }
    }

    public void ProductMessage() {
        System.out.println("No._||_________Nama produk_______||_______Harga (Rp)_____||");
        for (int i = 0; i < product.length; i++) {
            System.out.printf("%-3d || %-25s || %-20s ||\n", (i + 1), product[i], productPrice[i]);
        }
    }

    public String diskonProduk() {
        double total = productPrice[getP()] * 0.1;
        totalP = productPrice[getP()] - total;
        return "Anda mendapatkan diskon sebesar 10% "
                + "\nUntuk produk " + product[getP()]
                + ". Anda cukup membayar Rp." + totalP + "\n";
    }

    public abstract String diskonLayanan();

    public abstract String displayMesasage();

}
