/*Nama              : Farid Rahman F - 24060122140142 */
/*Tanggal Pembuatan : Rabu, 06 Maret 2024*/
/*Praktikum         : 3 */
/*Deskripsi         : Program penggunaan eksepsi menggunakan class library Java */

public class ExceptionOnArray {
    /*instansiasi object array integer */
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
