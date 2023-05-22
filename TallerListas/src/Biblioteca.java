import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(String nombre, int numPag) {
        Libro libro = new Libro(nombre, numPag);
        libros.add(libro);
    }

    public boolean eliminarLibroPorId(int id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                libros.remove(libro);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarLibroPorNombre (String nombre) {
        for (Libro libro : libros) {
            if (libro.getNombre().equals(nombre)) {
                libros.remove(libro);
                return true;
            }
        }
        return false;
    }

    public Libro buscarLibroPorId(int id) {
        int index = busquedaBinaria(id);
        if (index != -1) {
            return libros.get(index);
        }
        return null;
    }

    public Libro buscarLibroPorNombre(String nombre) {
        int index = busquedaSecuencial(nombre);
        if (index != -1) {
            return libros.get(index);
        }
        return null;
    }

    public int calcularTotalPaginas() {
        return calcularTotalPaginasRecursivo(0, libros.size() - 1);
    }

    private int calcularTotalPaginasRecursivo(int start, int end) {
        if (start > end) {
            return 0;
        } else if (start == end) {
            return libros.get(start).getNumPag();
        } else {
            int mid = (start + end) / 2;
            int leftSum = calcularTotalPaginasRecursivo(start, mid);
            int rightSum = calcularTotalPaginasRecursivo(mid + 1, end);
            return leftSum + rightSum;
        }
    }
   //Aqui se reakiza la busqueda binria
    private int busquedaBinaria(int id) {
        ordenarPorId();
        int low = 0;
        int high = libros.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Libro libro = libros.get(mid);
            if (libro.getId() == id) {
                return mid;
            } else if (libro.getId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    //Aqui se aplica la busueda secuencial
    private int busquedaSecuencial(String nombre) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            if (libro.getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    private void ordenarPorId() {
        Collections.sort(libros, new Comparator<Libro>() {
            public int compare(Libro libro1, Libro libro2) {
                return Integer.compare(libro1.getId(), libro2.getId());
            }
        });
    }
}


    public List<Libro> QuemarDatos(){
        List<Libro> datosQuemados = new ArrayList<>();

        Libro p1 = new Libro(1, 52, "java en 10 segundos");
        datosQuemados.add(p1);
        Libro p2 = new Libro(2, 2, "Como ver rapidos y furiosos piratat");
        datosQuemados.add(p2);
        Libro p3 = new Libro(3, 32, "Se busca novia");
        datosQuemados.add(p3);
        Libro p4 = new Libro(4, 55, "Pasando progra");
        datosQuemados.add(p4);
        Libro p5 = new Libro(5, 21, "Para empezar hay que empezar ");
        datosQuemados.add(p5);

        //listaLibros.addAll(QuemarDatos());

        return datosQuemados;
    }
}
