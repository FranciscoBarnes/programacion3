
public class Libro {
    private String nombre;
    private String autor;
    private String genero;

    public Libro() {
    }

    public Libro(String nombre, String autor, String genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Autor: " + autor + ", Género: " + genero;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}