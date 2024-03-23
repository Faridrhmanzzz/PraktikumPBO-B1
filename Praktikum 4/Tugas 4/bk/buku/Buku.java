/*Nama      : Farid Rahman Fadhilah */
/*NIM       : 24060122140142 */
/*Praktikum : Tugas 4 */

package bk.buku;

public class Buku {

    private String judul;
    private String penulis;
    private String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void view(){
        System.out.println("------------------ INFORMASI BUKU -----------------");
        System.out.println("Judul buku: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun terbit buku: " + tahunTerbit);
    }
}