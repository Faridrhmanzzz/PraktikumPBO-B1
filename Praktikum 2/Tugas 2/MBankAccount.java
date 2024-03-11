/*Nama              : Farid Rahman F - 24060122140142 */
/*Tanggal Pembuatan : Senin, 11 Maret 2024*/
/*Praktikum         : Tugas Praktikum 2 */

public class MBankAccount {
    public static void main(String[] args) {
        BankAccount Mandiri;
        float jumlah;

        Mandiri = new BankAccount(1000);
        System.out.println("Saldo sebelum transaksi: " + Mandiri.getBalance());
        
        jumlah = 500;
        Mandiri.deposit(jumlah);
        System.out.println("Deposit sejumlah "+jumlah+" berhasil. Saldo saat ini: " + Mandiri.getBalance());
        
        jumlah = 200;
        Mandiri.withdraw(jumlah);
        System.out.println("Penarikan sejumlah "+jumlah+" berhasil. Saldo saat ini: " + Mandiri.getBalance());


        System.out.println("Saldo setelah transaksi: " + Mandiri.getBalance());
    }
}
