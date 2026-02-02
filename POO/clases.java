package POO;

public class clases {
    //vamos a tomar "PERSONA" como la clase de este codigo

    //atributos (caracteristicas)
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
