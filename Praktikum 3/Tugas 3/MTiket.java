/*Nama              : Farid Rahman F - 24060122140142 */
/*Tanggal Pembuatan : Sabtu, 09 Maret 2024*/
/*Praktikum         : Tugas Praktikum 3 */
/*Deskripsi         :  */

import java.util.Scanner;

public class MTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
        int jumlahTiket = scanner.nextInt();
        Tiket.pesanJumlahTiket(jumlahTiket);

        System.out.println("Pilih e-walet yang akan digunakan: ");
        System.out.println("1. OVO");
        System.out.println("2. Gopay");
        System.out.println("3. DANA");
        System.out.println("4. LinkAja");
        System.out.print("Pilih e-wallet (1-4): ");
        int EWallet = scanner.nextInt();

        Tiket.isEWallet(EWallet);
    }    
}
