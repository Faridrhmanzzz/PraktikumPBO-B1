/* Nama : Farid Rahman Fadhilah */
/* NIM  : 24060122140142 */
/* File : LambdaMap.java */
/* Deskripsi : Membuat program untuk menampilkan key dan value dari sebuah map */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        //Membuat map dengan key berupa NIM dan value berupa nama mahasiswa
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060122140111", "Yanto");
        mahasiswaMap.put("24060122140112", "Yanti");
        mahasiswaMap.put("24060122140113", "Yanny");
        mahasiswaMap.put("24060122140114", "Yunny");

        //Menggunakan ekspresi lambda untuk menampilkan key dan value mahasiswa
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);        
        });
    }
}
