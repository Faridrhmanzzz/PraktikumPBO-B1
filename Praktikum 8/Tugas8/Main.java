//Nama      : Farid Rahman Fadhilah
//NIM       : 24060122140142
//Tanggal   : 15-04-2024

// package Tugas8;

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();
        
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}