package POO;


class Personas{
    String nombre;
    int edad;
    String nacionalidad;
    double peso; //kg
    double estatura; //metros
    //metodos (acciones)
    void comer(){
        System.out.println(nombre +" esta comiendo");
    }
    void dormir() {
        System.out.println(nombre + " está durmiendo");
    }
    void caminar() {
        System.out.println(nombre + " está caminando");
    }
    void saltar() {
        System.out.println(nombre + " está saltando");
    }
    void estudiar() {
        System.out.println(nombre + " está estudiando");
    }
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Peso: " + peso + " kg");
    }
}

public class objetos {
    public static void main(String[] args) {
        Personas p1 = new Personas();

        //atributos
        p1.nombre = "Alejandro";
        p1.edad = 18;
        p1.nacionalidad = "Colombiano";
        p1.estatura = 1.72;
        p1.peso = 68;

        //metodos
        p1.mostrarInfo();
        p1.estudiar();
        p1.caminar();
    }
}

