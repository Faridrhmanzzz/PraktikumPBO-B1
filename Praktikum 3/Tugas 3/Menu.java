/*Nama              : Farid Rahman F - 24060122140142 */
/*Tanggal Pembuatan : Sabtu, 09 Maret 2024*/
/*Praktikum         : Tugas Praktikum 3 */

public class Menu {
    private String nama;
    private double harga;
    private int stok;
    
    public Menu(String nama, double harga, int stok){
        this.nama = nama;
        this. harga = harga;
        this. stok = stok;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public int getStok(){
        return stok;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    //To Do 1 : Tambahkan metode untuk mengurangi stok
    public void kurangiStok(int jumlah){
        if (jumlah > 0 && jumlah <= stok){
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi sebanyak " + jumlah + " pcs");
        }else{
            System.out.println("Jumlah pesanan melebihi stok yang tersedia.");
        }
    }
}
