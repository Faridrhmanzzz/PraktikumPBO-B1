/*Nama              : Farid Rahman F - 24060122140142 */
/*Tanggal Pembuatan : Rabu, 06 Maret 2024*/
/*Praktikum         : 3 */
/*Deskripsi         : Program penggunaan exception buatan sendiri pengenalan klausa 'throw dan 'throws */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            /*method getMessage() telah ada pada kelas "Exception" */
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*JAWABAN */
/*Baris ke 12 akan tetap dieksekusi, karena angka yang dimasukkan adalah angka 10 dan angka 10 bukan angka sial */
/*maka yang keluar adalah "10 bukan angka sial" */

/*Baris ke 21 akan tetap dieksekusi, namun karena angka 13 adalah angka sial */
/*maka eksepsi akan terjadi dan dilempar ke AngkaSialException dan keluarannya  */
/*adalah "jangan memasukkan angka 13 karena angka sial  */