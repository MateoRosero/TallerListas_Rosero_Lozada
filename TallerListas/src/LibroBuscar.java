import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class LibroBuscar {



    Queue<Libro> personasEnEspera = new LinkedList<>();

    Stack<Libro> personasEliminadas = new Stack<>();
    public void AgregarLibroEspera(Libro persona){
        boolean isAlreadyAdded = false;
        for(Libro L : personasEnEspera){
            if(L.getId() == persona.getId()){
                isAlreadyAdded = true;
                break;
            }
        }

        if(!isAlreadyAdded){
            for(Libro p: personasEliminadas){
                if(p.getId() == persona.getId()){
                    isAlreadyAdded = true;
                    break;
                }
            }
        }

        if(isAlreadyAdded){
            JOptionPane.showMessageDialog(null, "Libro Creado");

        }
        else{
            JOptionPane.showMessageDialog(null,"Libro existente");
            personasEnEspera.add(persona);
        }
    }


    public class ArrayListTextFieldExample extends Application {
        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) {
            List<String> datos = new ArrayList<>();
            datos.add("Dato 1");
            datos.add("Dato 2");
            datos.add("Dato 3");
            datos.add("Dato 4");
            datos.add("Dato 5");

            TextField textField = new TextField();
            textField.setText(datos.toString());

            VBox root = new VBox(textField);
            Scene scene = new Scene(root, 200, 100);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }