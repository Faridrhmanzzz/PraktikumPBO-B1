/*Nama              : Farid Rahman F - 24060122140142 */
/*Tanggal Pembuatan : Senin, 11 Maret 2024*/
/*Praktikum         : Tugas Praktikum 2 */

public class MPrismaSegitiga{
    public static void main(String[] args) {
        Segitiga S = new Segitiga(3, 4);
        PrismaSegitiga P = new PrismaSegitiga(S, 5);

        System.out.println("Alas Segitiga: " + S.getAlas());
        System.out.println("Tinggi Segitiga: " + S.getTinggiSegitiga());
        System.out.println("Luas Segitiga: " + S.hitungLuas());
        System.out.println("Tinggi Prisma Segitiga: " + P.getTinggiPrisma());
        System.out.println("Volume Prisma Segitiga: " + P.hitungVolume());
        System.out.println("Luas Permukaan Prisma Segitiga: " + P.hitungLuasPermukaan());
    }
}
