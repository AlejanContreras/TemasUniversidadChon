package conexion.lenguajes_javapoo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LibroDAO {

    // 🔥 INSERTAR LIBRO
    public void insertar(Libro l) {

        try {
            Connection con = ConexionDB.conectar();

            String sql = "INSERT INTO libros(titulo, id_autor, disponible) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, l.getTitulo());
            ps.setInt(2, l.getIdAutor());
            ps.setBoolean(3, l.isDisponible());

            ps.executeUpdate();

            System.out.println("Libro guardado");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    // 🔍 LISTAR LIBROS
    public void listar() {

        try {
            Connection con = ConexionDB.conectar();

            String sql = "SELECT * FROM libros";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("titulo") + " | AutorID: " +
                    rs.getInt("id_autor") + " | Disponible: " +
                    rs.getBoolean("disponible")
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