/*Nama              : Farid Rahman F - 24060122140142 */
/*Tanggal Pembuatan : Senin, 11 Maret 2024*/
/*Praktikum         : Tugas Praktikum 2 */

public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma){
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume(){
        return (alas.hitungLuas() * tinggiPrisma);
    }

    public double getTinggiPrisma() {
        return tinggiPrisma;
    }

    public double hitungLuasPermukaan(){
        return (alas.hitungLuas() * 2 + tinggiPrisma * alas.getAlas() * 3);
    }
}
