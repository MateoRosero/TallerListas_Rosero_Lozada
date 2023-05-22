//Esta clase genera la busqueda secuencial//
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusquedaSecuencialPorNombre {
    public static void main(String[] args) {
        // Crear una lista de libros de ejemplo
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro(1, "Java en 10 segundos"));
        libros.add(new Libro(2, "Aprende Python"));
        libros.add(new Libro(3, "Introducción a la programación"));

        // Leer el nombre del libro a buscar desde el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del libro a buscar: ");
        String nombreBuscado = scanner.nextLine();

        // Realizar una búsqueda secuencial por nombre
        Libro libroEncontrado = buscarLibroPorNombre(libros, nombreBuscado);

        // Verificar si se encontró el libro
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado.getId() + " - " + libroEncontrado.getTitulo());
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    public static Libro buscarLibroPorNombre(List<Libro> libros, String nombre) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(nombre)) {
                return libro; // Se encontró el libro
            }
        }
        return null; // No se encontró el libro
    }
}

