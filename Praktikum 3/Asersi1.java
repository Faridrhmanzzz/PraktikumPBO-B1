/*Nama              : Farid Rahman F - 24060122140142 */
/*Tanggal Pembuatan : Rabu, 06 Maret 2024*/
/*Praktikum         : 3 */
/*Deskripsi         : Program untuk menunjukkan asersi */

public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if (x>0){
            System.out.println("bilangan positif");
        }else{
            assert (x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}