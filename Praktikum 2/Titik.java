/*Nama      : Farid Rahman Fadhilah */
/*NIM       : 24060122140142 */
/*Praktikum : 2 */

public class Titik{
    //Deklarasi Atribut
    private double absis;
    private double ordinat;
    static int counterTitik;

    //Deklarasi Konstruktor
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    //Deklarasi Metode
    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public int getCounterTitik(){
        return counterTitik;
    }

}