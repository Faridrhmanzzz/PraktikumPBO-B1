/* Nama : Farid Rahman Fadhilah */
/* NIM  : 24060122140142 */
/* File : DiskonLambda.java */
/* Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon */

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args) {
        //Tanpa Lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
    
        //Dengan Lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //Dengan Lambda dengan Blok Statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
    }
}

/* Jawaban Soal B
    Diskon Lebaran menggunakan ekpresi sederhana,namun diskon biasa menggunakan ekspresi block statement 
    Diskon lebaran adalah lambda sederhana yang langsung mengembalikan nilai atau hasil dari satu ekspresi
    Diskon biasa adalah lambda yang menggunakan ekspresi blok statement untuk memberikan fleksibilitas  */
