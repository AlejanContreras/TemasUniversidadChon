package conexion.lenguajes_javapoo;

import java.util.Date;

public class Prestamo {

    // 🔒 ENCAPSULAMIENTO
    private int id;
    private int idUsuario;
    private int idLibro;
    private Date fechaPrestamo;

    // Constructor vacío
    public Prestamo() {
    }

    // Constructor con datos
    public Prestamo(int idUsuario, int idLibro, Date fechaPrestamo) {
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
        this.fechaPrestamo = fechaPrestamo;
    }

    // GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    // 🧠 ABSTRACCIÓN
    public void mostrarInfo() {
        System.out.println(
            "Prestamo → UsuarioID: " + idUsuario +
            " | LibroID: " + idLibro +
            " | Fecha: " + fechaPrestamo
        );
    }
}