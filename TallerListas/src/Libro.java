import java.util.*;

public class Libro {

    public int id, numPag;
    public String nombre;
    private static int contador = 0;

    public Libro(int id, int numPag, String nombre) {
        this.id = id;
        this.numPag = numPag;
        this.nombre = nombre;
    }

    public Libro(String nombre, int numPag) {
    }

    public int getId() {
        return id;
    }

    public int getNumPag() {
        return numPag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", numPag=" + numPag +
                ", Nombre='" + nombre + '\'' +
                '}';
    }
    private static int generarID() {
        contador++;
        return contador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return id == libro.id && numPag == libro.numPag && Objects.equals(nombre, libro.nombre);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, numPag, nombre);
    }
}
