package POO;

public class abstraccion {
    public static void main(String[] args) {
         // No se puede crear el objeto del padre abstracto
         Animal a = new Perro();

         // Uso del método abstracto
         a.hacerSonido();
    }
}

// CLASE ABSTRACTA (PADRE)
abstract class Animal {

    // Método abstracto (sin implementación)
    public abstract void hacerSonido();
}

// CLASE HIJA
class Perro extends Animal {

    // Implementación obligatoria
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}