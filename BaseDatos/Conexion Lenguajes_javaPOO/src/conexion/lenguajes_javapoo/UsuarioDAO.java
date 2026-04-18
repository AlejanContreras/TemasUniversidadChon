package conexion.lenguajes_javapoo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    // 🔥 INSERTAR USUARIO
    public void insertar(Usuario u) {

        try {
            Connection con = ConexionDB.conectar();

            String sql = "INSERT INTO usuarios(nombre, tipo) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getTipo());

            ps.executeUpdate();

            System.out.println("Usuario guardado");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    // 🔍 LISTAR USUARIOS
    public void listar() {

        try {
            Connection con = ConexionDB.conectar();

            String sql = "SELECT * FROM usuarios";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("nombre") + " | " +
                    rs.getString("tipo")
                );
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}