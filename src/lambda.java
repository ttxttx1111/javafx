import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class lambda extends Application  {
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        button=new Button("click it");
        button.setOnAction(e-> System.out.println("lambda expression"));

        StackPane layout=new StackPane();
        layout.getChildren().add(button);

        Scene scene=new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
