/*Nama      : Farid Rahman Fadhilah */
/*NIM       : 24060122140142 */
/*Praktikum : Tugas 4 */

package bk.main;

import bk.buku.Buku;
import bk.bukuFiksi.bukuFiksi;
import bk.bukuFiksi.bukuNovel;
import bk.bukunonFiksi.bukuAkademik;
import bk.bukunonFiksi.bukuNonFiksi;

public class MBuku {
    public static void main(String[] args) {
            // Pemanggilan
            Buku bukuHp = new bukuFiksi("Harry Potter and the Sorcerer’s Stone", "J.K. Rowling", "1992", "Mystery",540,150000.00);
            Buku bukuAkademik = new Buku("Diktat Algoritma dan Pemrograman", "Inggriani Liem", "2007");
            Buku bukuBiografi = new Buku("Dunia Batin Buya Hamka", "MD. Ghanoe", "2020");

               // Buku NonFiksi
               bukuNonFiksi Biografi = new bukuNonFiksi(bukuBiografi.getJudul(), bukuBiografi.getPenulis(),
                               bukuBiografi.getTahunTerbit(), "Biografy", 350, 140000);
               // buku Akademik
               bukuNovel akademik = new bukuNovel(bukuAkademik.getJudul(), bukuAkademik.getPenulis(),
                               bukuAkademik.getTahunTerbit(),
                               "Pemrograman", 640, 132000);


               System.out.println("------------- \n| Buku Fiksi|\n-------------");
               System.out.println("******* Buku Novel *******");
               bukuHp.view();
               System.out.println();

               System.out.println("------------------ \n| Buku Non Fiksi |\n-----------------");
               System.out.println("****** Buku Biografi *******");
               Biografi.view();
               System.out.println();
               System.out.println("******* Buku Akademik *******");
               akademik.view();
    }
}