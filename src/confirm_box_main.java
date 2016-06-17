
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class confirm_box_main extends Application implements EventHandler<ActionEvent> {
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        button=new Button("click it");
        button.setOnAction(this);

        StackPane layout=new StackPane();
        layout.getChildren().add(button);

        Scene scene=new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println(confirm_box.display("window","hello"));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
