/*Nama      : Farid Rahman Fadhilah */
/*NIM       : 24060122140142 */
/*Praktikum : 2 */

public class MOperasiTitik {
    public static void main(String[] args){
        Titik t = new Titik(4,4);
        OperasiTitik o = new OperasiTitik();

        System.out.println("titik(" +t.getAbsis()+ "," + t.getOrdinat() + ")");

        // o.refleksiSumbuX(t);
        // System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
        // o.refleksiSumbuY(t);
        // System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");

        /*refleksi sumbu X */
        o.refleksiX(t);
        System.out.println("Titik refleksi X: (" + t.getAbsis() + "," + t.getOrdinat() + ")");

        /*refleksi sumbu Y */
        o.refleksiY(t);
        System.out.println("Titik refleksi Y: (" + t.getAbsis() + "," + t.getOrdinat() + ")");
    }
    
}
