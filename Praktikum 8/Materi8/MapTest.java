//Nama  : Farid Rahman Fadhilah
//NIM   : 24060122140142

package Materi8;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //Kunci -> integer, nilai -> string
        Map<Integer,String> map = new HashMap<Integer,String>();
        //Menempatkan elemen kunci dan nilai
        map.put(1  , "satu");
        map.put(2, "dua");
        map.put(3, "tiga");
        //Mengambil elemen pertama
        System.out.println(map.get(1));
        //Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> keys = map.keySet();
        //Bagaimana iterasi untuk mengambil keseluruhan
        //Nilai dari kunci? tulis pada laporan anda
        //Petunjuk : gunakan iterasi seperti program ArrayListTest
        for (Integer key : keys){
            System.out.print(map.get(key)+" ");
        }
    }
}
