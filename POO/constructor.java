package POO;

public class constructor {
    public static void main(String[] args) {

        Personas p1 = new Personas("Alejandro",18,"Colombiano",1.72,68);

        p1.mostrarInfo();
        p1.estudiar();
    }
}

class Personas {

    String nombre;
    int edad;
    String nacionalidad;
    double estatura;
    double peso;

    // CONSTRUCTOR
    Personas(String nombre, int edad, String nacionalidad, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
        this.peso = peso;
    }

    void estudiar() {
        System.out.println(nombre + " está estudiando");
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Peso: " + peso);
    }
}
