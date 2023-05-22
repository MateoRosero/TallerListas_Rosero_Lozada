import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Interfaz libro = new Interfaz();
        libro.setTitle("Biblioteca Virtual");
        libro.setSize(1000, 400);
        libro.setVisible(true);
        libro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}