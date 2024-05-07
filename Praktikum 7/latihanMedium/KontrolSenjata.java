/*Nama      : Farid Rahman Fadhilah */
/*NIM       : 24060122140142 */
/*Praktikum : 7*/

package latihanMedium;

public class KontrolSenjata {
    
    Senjata senjata;
    public KontrolSenjata(Senjata S){
        senjata = S;
    }

    public boolean IsAdaPeluru(){
        return senjata.getPeluru()!=0;
    }

    public void isiPeluru(int j){
        if(j>0){
            System.out.println(">>Peluru berhasil ditambah : "+j);
        }
        senjata.setPeluru(senjata.getPeluru()+j);
    }

    public void menembak(int jumlah){

        System.out.println(">> Siap menembak " + jumlah + " kali");
        if(!IsAdaPeluru()){
            System.out.println("Peluru Habis");
        }else{
            for(int i=0;i<jumlah;i++){
                if(IsAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    isiPeluru(-1);
                }else{
                    System.out.println("Gagal Tembak,Peluru Habis");
                }
            }  
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }

    public String menusuk(){
        return senjata.getBunyi();
    }

    public void pasangBayonet(){
        senjata.setMenusuk(true);
    }
}
