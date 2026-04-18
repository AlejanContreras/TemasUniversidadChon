/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion.lenguajes_javapoo;

/**
 *
 * @author john
 */
public class Usuario {
    // 🔒 ENCAPSULAMIENTO
    private int id;
    private String nombre;
    private String tipo;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con datos
    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // GETTERS Y SETTERS (ENCAPSULAMIENTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // 🧠 ABSTRACCIÓN
    public void mostrarInfo() {
        System.out.println("Usuario: " + nombre + " | Tipo: " + tipo);
    }

    // 🧠 POLIMORFISMO (base)
    public void prestarLibro() {
        System.out.println("Usuario puede prestar libro con límite básico");
    }
}