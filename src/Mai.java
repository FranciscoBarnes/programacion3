
import java.util.ArrayList;
import java.util.Scanner;

public class Mai {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // evitar que el listado este vacio
        Libro rellenoLibro = new Libro("Quijote","Miguel de Cervantes"," ciencia"); // Crear instancia de Libro
        Cliente rellenoCliente= new Cliente("38.107.243","Francisco","1"); // Crear instancia de cliente
        biblioteca.agregarLibro(rellenoLibro);
        biblioteca.agregarCliente(rellenoCliente);

        do {
            System.out.println("\n---- Menú Biblioteca ----");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por nombre");
            System.out.println("3. Buscar libros por autor");
            System.out.println("4. Buscar libros por género");
            System.out.println("5. Eliminar libro");
            System.out.println("6. Agregar Cliente");
            System.out.println("7. Eliminar Cliente");
            System.out.println("8. Mostrar Clientes");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del libro: ");
                    String nombre2 = scanner.nextLine();
                    System.out.print("Autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Género del libro: ");
                    String genero = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(nombre2, autor, genero));
                    System.out.println("El libro se cargo correctamente");
                    break;

                case 2:
                    System.out.print("Nombre del libro a buscar: ");
                    nombre2 = scanner.nextLine();
                    biblioteca.buscarLibroPorNombre(nombre2);
                    break;

                case 3:
                    System.out.print("Autor de los libros a buscar: ");
                    autor = scanner.nextLine();
                    ArrayList<Libro> librosPorAutor = biblioteca.buscarLibrosPorAutor(autor);
                    if (librosPorAutor.isEmpty()) {
                        System.out.println("No se encontraron libros de este autor");
                    } else {
                        for (Libro libro : librosPorAutor) {
                            System.out.println(libro);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Género de los libros a buscar: ");
                    genero = scanner.nextLine();
                    ArrayList<Libro> librosPorGenero = biblioteca.buscarLibrosPorGenero(genero);
                    if (librosPorGenero.isEmpty()) {
                        System.out.println("No se encontraron libros de este género");
                    } else {
                        for (Libro libro : librosPorGenero) {
                            System.out.println(libro);
                        }
                    }
                    break;

                case 5:
                    System.out.print("Nombre del libro a eliminar: ");
                    nombre2 = scanner.nextLine();
                    biblioteca.eliminarLibro(nombre2);
                    break;

                case 6:
                    System.out.print("Nombre del Cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    biblioteca.agregarCliente(new Cliente(dni, nombre, id));
                    System.out.println("El Cliente se cargo correctamente");
                    break;
                case 7:
                    System.out.print("Nombre del Cliente a eliminar: ");
                    nombre = scanner.nextLine();
                    biblioteca.eliminarCliente(nombre);
                    break;
                case 8:
                    biblioteca.mostrarClientes();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}






