package POO;

public class herencia {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Alejandro", 18, "Ingeniería de Software");

        e1.presentarse(); // metodo heredado
        e1.estudiar();  //metodo propio
    }
}
//clase
class Persona {

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
    }
}
//herencia
class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // constructor del padre
        this.carrera = carrera;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando " + carrera);
    }
}


