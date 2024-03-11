/*Nama              : Farid Rahman F - 24060122140142 */
/*Tanggal Pembuatan : Senin, 11 Maret 2024*/
/*Praktikum         : Tugas Praktikum 2 */

public class BankAccount{
    private float balance;

    public BankAccount(float balance){
        this.balance = balance;
    }

    public void deposit(float jumlah){
        balance += jumlah;
    }

    public void withdraw(float jumlah){
        if(jumlah>balance){
            System.out.println("Saldo tidak mencukupi!");
        }else{
            balance -= jumlah;
        }
    }

    public float getBalance() {
        return balance;
    }
}