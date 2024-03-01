package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CConexion {

    Connection conectar = null;
    String usuario = "sa";
    String contrasenia = "P@ssw0rd";
    String bdG = "TALLERG8_GYE";
    String ip = "localhost";
    String puerto = "1433";
    String servernameG = "JOTA"; 

    public Connection establecerConexionG() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Asegúrate de reemplazar INSTANCIA_GUAYAQUIL con el nombre de tu instancia
            String cadenaConexion = "jdbc:sqlserver://" + ip + "\\" + servernameG + ":" + puerto + ";" + "databaseName=" + bdG + ";"
                    + "encrypt=true;trustServerCertificate=true";
            conectar = DriverManager.getConnection(cadenaConexion, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Acceso correcto a la base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto correctamente a la base de datos");
            System.out.println(e);
        }
        return conectar;
    }

    public Connection getConexion() throws SQLException {
        try {
            // Cargar el controlador JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establecer la conexión
            String url = "jdbc:sqlserver://26.237.113.83:1433;database=TALLERG8_QUITO;"
                    + "encrypt=false";
            String usuario = "sa";
            String contraseña = "P@ssw0rd";

            Connection con = DriverManager.getConnection(url, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "Acceso correcto a la base de datos");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            // Muestra mensaje de error en la consola (considera usar logs)
            System.err.println("No se pudo establecer la conexión: " + ex.getMessage());
            return null;
        }
    }

}
