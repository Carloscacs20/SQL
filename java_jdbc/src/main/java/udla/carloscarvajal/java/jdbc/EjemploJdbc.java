package udla.carloscarvajal.java.jdbc;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306/java_jdbc"; // string de conexion
         String user = "root";
         String pw = "sasa";

         // Establecer conexion
        try {
            Connection conn = DriverManager.getConnection(url, user, pw);
            Statement st = conn.createStatement();
            ResultSet resultado = st.executeQuery("Select * From productos");
            while (resultado.next()){
                System.out.println(resultado.getInt("id"));
                System.out.println(" ");
                System.out.println(resultado.getString("nombre equipo"));
                System.out.println(" ");
                System.out.println(resultado.getString("color"));
                System.out.println(" ");
                System.out.println(resultado.getString("marca"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
