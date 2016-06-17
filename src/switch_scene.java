package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

public class switch_scene extends Application  {
    Scene scene1,scene2;
    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage=primaryStage;
        Label label1,label2;
        label1=new Label("here is label 1");
        label2=new Label("here is label 2");
        Button button1,button2;
        button1=new Button("click to scene2 ");
        button1.setOnAction(e->stage.setScene(scene2));
        button2=new Button("click to scene1 ");
        button2.setOnAction(e->stage.setScene(scene1));
        VBox layout1,layout2;
        layout1=new VBox();
        layout1.getChildren().addAll(label1,button1);
        layout2=new VBox();
        layout2.getChildren().addAll(label2,button2);

        scene1=new Scene(layout1,300,300);
        scene2=new Scene(layout2,400,400);

        stage.setScene(scene1);
        stage.setTitle("switch");
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
