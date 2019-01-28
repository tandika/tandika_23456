import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi_mysql {

    static void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection koneksi_mysql;
    public Connection getConnection(){
        try {
            koneksi_mysql = DriverManager.getConnection("jdbc:mysql://localhost/java","root","");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database GAGAl", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        return koneksi_mysql;
    }

    Connection koneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    



}
