package POO;

public class encapsulamiento {
    public static void main(String[] args) {
        Persona p1 = new Persona("Alejandro", 18);

        // LEER datos (getter)
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());

        // MODIFICAR datos (setter)
        p1.setEdad(20);      // válido
        p1.setEdad(-5);      // inválido, no cambia

        System.out.println("Edad final: " + p1.getEdad());
    }
}
class Persona {

    // ATRIBUTOS PROTEGIDOS
    private String nombre;
    private int edad;

    // CONSTRUCTOR
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // GETTERS (LEER)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    // SETTER (MODIFICAR CON CONTROL)
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }
}
