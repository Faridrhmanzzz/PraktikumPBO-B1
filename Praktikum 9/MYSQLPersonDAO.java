import java.sql.*;

/*File  : MYSQLPersonDAO.java */
/*Deskripsi : implementasi PersonDAO untuk MySQL */

public class MYSQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //Membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo","root","");
        //Kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
    }
}
