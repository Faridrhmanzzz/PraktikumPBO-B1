//Nama  : Farid Rahman Fadhilah
//NIM   : 24060122140142

package Materi8;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        //Inisialisasi ArrayList yang hanya dapat 
        //berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        //Menambah elemen 
        strings.add("Praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //Menghapus elemen
        strings.remove("Praktikum");
        //Iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}