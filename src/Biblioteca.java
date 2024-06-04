
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Persona> personas;
    private List<Cliente> clientes;

    public Biblioteca() {
        this.libros = new ArrayList<>(); // Inicialización de la lista
        this.clientes = new ArrayList<>();
    }
    public List<Libro> getLibros() {
        return libros;
    }
    public List<Cliente>getClientes(){
        return clientes;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Persona> getUsuarios() {
        return personas;
    }

    public void setUsuarios(List<Persona> personas) {
        this.personas = personas;
    }
            //agrega un libro a la biblioteca.
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

            //Elimina un libro de la bilbioteca.
    public void eliminarLibro(String nombre) {
        libros.removeIf(libro -> libro.getNombre().equalsIgnoreCase(nombre));
    }

            //Buscar libros por autor.
    public ArrayList<Libro> buscarLibrosPorAutor(String autor) {
        ArrayList<Libro> librosPorAutor = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                librosPorAutor.add(libro);
            }
        }
        return librosPorAutor;
    }
            //Buscar libro por el nombre.
            public Libro buscarLibroPorNombre(String nombre) {
                boolean encontrado = false;
                for (Libro libro : libros) {
                    if (libro.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println(libro);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("No se encontraron libros con el nombre '" + nombre + "'.");
                }
                return null;
            }

            //Buscar libro por genero
    public ArrayList<Libro> buscarLibrosPorGenero(String genero) {
        ArrayList<Libro> librosPorGenero = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getGenero().equalsIgnoreCase(genero)) {
                librosPorGenero.add(libro);
            }
        }
        return librosPorGenero;
    }
            //Mostrar Cliente
            public void mostrarClientes() {
                if (clientes.isEmpty()) {
                    System.out.println("No hay clientes registrados en la biblioteca.");
                } else {
                    System.out.println("Clientes registrados en la biblioteca:");
                    for (Cliente cliente : clientes) {
                        System.out.println("Nombre: "+cliente.getNombre() + " | DNI: " + cliente.getDni()+" | Id: "+ cliente.getId());
                    }
                }
            }
            //Agregar Cliente a la biblioteca
            public void agregarCliente(Cliente cliente) {
                clientes.add(cliente);
            }
            //Eliminar Cliente de la biblioteca
            public void eliminarCliente(String nombre) {
                clientes.removeIf(cliente -> cliente.getNombre().equalsIgnoreCase(nombre));
            }
}