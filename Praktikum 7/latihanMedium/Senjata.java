/*Nama      : Farid Rahman Fadhilah */
/*NIM       : 24060122140142 */
/*Praktikum : 7*/

package latihanMedium;

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public String getBunyi(){
        return bunyi;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public boolean isMenusuk(){
        return menusuk;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }

    public int getPeluru(){
        return peluru;
    }
}
