/*File      : PersegiPanjang.java 18/03/2024 */
/*Pembuat   : Farid Rahman - 24060122140142 */
/*Deskripsi : driver class untuk poligon dan persegi panjang dan segitiga */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(3, 4, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}
