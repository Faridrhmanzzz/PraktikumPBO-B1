/*Nama              : Farid Rahman F - 24060122140142 */
/*Tanggal Pembuatan : Senin, 11 Maret 2024*/
/*Praktikum         : Tugas Praktikum 2 */

public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    }

    public double hitungLuas(){
        return (0.5 * alas * tinggi);
    }
}