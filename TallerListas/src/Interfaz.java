import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame{
    private JPanel Interfaz;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton buscarButton;
    private JTextField textField3;
    private JTextField textField4;
    private JButton eliminarButton;
    private JTextField textField5;
    private JTextField textField6;
    private JButton agregarButton;
    private JTextArea textArea1;
    private JButton mostrarButton;
    private JTabbedPane tabbedPane2;
    private JTextField textField7;
    private JTextField calcularTextField;
    private JTextField calcularPaginasTotalesTextField;
    private JTextArea textArea2;
    Biblioteca libros = new Biblioteca();
public Interfaz() {
    mostrarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            /*textArea1.setText("Los datos quemados son: " + Biblioteca.QuemarDatos());*/
        }
    });
    agregarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { //agregarLibro();


             }


    });


    }
}


