package POO;

public class polimorfismo {
    public static void main(String[] args) {
                
        // Referencia del padre apuntando a objetos hijos
        Persona p1 = new Estudiante();
        Persona p2 = new Profesor();
        
        // MISMO método, DIFERENTE comportamiento
        p1.trabajar();
        p2.trabajar();
        
    }
}

// CLASE PADRE
class Persona {
    public void trabajar() {
        System.out.println("La persona trabaja");
    }
}

// CLASE HIJA 1
class Estudiante extends Persona {

    @Override
    public void trabajar() {
        System.out.println("El estudiante estudia");
    }
}

// CLASE HIJA 2
class Profesor extends Persona {
    @Override
    public void trabajar() {
        System.out.println("El profesor enseña");
    }
}