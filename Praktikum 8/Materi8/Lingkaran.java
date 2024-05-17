//Nama  : Farid Rahman Fadhilah
//NIM   : 24060122140142
// package Materi8;

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
}
