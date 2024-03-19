/*File      : MLingkaran.java 18/03/2024 */
/*Pembuat   : Farid Rahman - 24060122140142 */
/*Deskripsi : implementasi cara menghitung luas lingkaran */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari Lingkaran: ");
        double sisi = scan.nextDouble();
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan " + "jejari 10.2 satuan adalah " + l.hitungLuas());
    }
}
