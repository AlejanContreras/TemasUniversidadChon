package conexion.lenguajes_javapoo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.sql.Timestamp;

public class PrestamoDAO {

    public void prestarLibro(Prestamo p) {

        try {
            Connection con = ConexionDB.conectar();

            // 🔥 1. INSERTAR PRÉSTAMO
            String sqlPrestamo = "INSERT INTO prestamos(id_usuario, id_libro, fecha_prestamo) VALUES (?, ?, ?)";
            PreparedStatement ps1 = con.prepareStatement(sqlPrestamo);

            ps1.setInt(1, p.getIdUsuario());
            ps1.setInt(2, p.getIdLibro());
            ps1.setTimestamp(3, new Timestamp(p.getFechaPrestamo().getTime()));

            ps1.executeUpdate();

            // 🔥 2. ACTUALIZAR LIBRO (YA NO DISPONIBLE)
            String sqlLibro = "UPDATE libros SET disponible = false WHERE id = ?";
            PreparedStatement ps2 = con.prepareStatement(sqlLibro);

            ps2.setInt(1, p.getIdLibro());
            ps2.executeUpdate();

            System.out.println("Préstamo realizado correctamente");

            ps1.close();
            ps2.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}