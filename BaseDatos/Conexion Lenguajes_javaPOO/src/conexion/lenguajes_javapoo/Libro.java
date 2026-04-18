package conexion.lenguajes_javapoo;

public class Libro {

    // 🔒 ENCAPSULAMIENTO
    private int id;
    private String titulo;
    private int idAutor;
    private boolean disponible;

    // Constructor vacío
    public Libro() {
    }

    // Constructor con datos
    public Libro(String titulo, int idAutor, boolean disponible) {
        this.titulo = titulo;
        this.idAutor = idAutor;
        this.disponible = disponible;
    }

    // GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // 🧠 ABSTRACCIÓN
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Disponible: " + disponible);
    }
}