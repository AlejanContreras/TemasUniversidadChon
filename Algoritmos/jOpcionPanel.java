package Algoritmos;

import javax.swing.JOptionPane;

public class jOpcionPanel {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

        JOptionPane.showMessageDialog(null, "Bienvenido al Billar");
        String name = JOptionPane.showInputDialog("Ingrese su nombre");
        int acept = JOptionPane.showConfirmDialog(null, "¿Erres Mayor de edad?");
        if(acept == 0){
            JOptionPane.showMessageDialog(null, name+" Puedes entrar");
        }else{        JOptionPane.showMessageDialog(null, "Lo sentimos "+name+" eres muy joven para poder entrar");
    }
        

    }
}
