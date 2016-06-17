import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sun.reflect.annotation.AnnotationSupport;

/**
 * Created by Administrator on 2016-06-04.
 */
public class confirm_box {
    static boolean answer;
    public static boolean display(String title,String message){
        Stage window=new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setMinWidth(250);
        window.setTitle(title);
        Label label=new Label();
        label.setText(message);
        Button yes=new Button("yes");
        yes.setOnAction(e->{
            answer=true;
            window.close();
        });

        Button no=new Button("no");
        no.setOnAction(e->{
            answer=false;
            window.close();
        });

        VBox layout=new VBox(10);
        layout.getChildren().addAll(label,yes,no);
        layout.setAlignment(Pos.CENTER);

        Scene scene =new Scene(layout);
        window.setScene(scene);
        window.show();
        return answer;
    }
}
