/*File      : Segitiga.java 18/03/2024 */
/*Pembuat   : Farid Rahman */
/*Deskripsi : representasi dasar dari objek  */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return alas * tinggi / 2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi" + this.getJumlahSisi());
    }
    
}

