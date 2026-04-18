package conexion.lenguajes_javapoo;

import java.util.Scanner;
import java.util.Date;

public class ConexionLenguajes_javaPOO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        LibroDAO libroDAO = new LibroDAO();
        PrestamoDAO prestamoDAO = new PrestamoDAO();

        int opcion;

        do {
            System.out.println("\n===== SISTEMA BIBLIOTECA =====");
            System.out.println("1. Gestionar Usuarios");
            System.out.println("2. Gestionar Libros");
            System.out.println("3. Realizar Prestamo");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                // 🔹 USUARIOS
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Tipo (admin/lector): ");
                    String tipo = sc.nextLine();

                    Usuario u = new Usuario(nombre, tipo);
                    usuarioDAO.insertar(u);

                    usuarioDAO.listar();
                    break;

                // 🔹 LIBROS
                case 2:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("ID Autor: ");
                    int idAutor = sc.nextInt();
                    sc.nextLine();

                    Libro l = new Libro(titulo, idAutor, true);
                    libroDAO.insertar(l);

                    libroDAO.listar();
                    break;

                // 🔹 PRESTAMO
                case 3:
                    System.out.print("ID Usuario: ");
                    int idUsuario = sc.nextInt();

                    System.out.print("ID Libro: ");
                    int idLibro = sc.nextInt();
                    sc.nextLine();

                    Prestamo p = new Prestamo(idUsuario, idLibro, new Date());
                    prestamoDAO.prestarLibro(p);

                    break;

                // 🔹 SALIR
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 4);

        sc.close();
    }
}