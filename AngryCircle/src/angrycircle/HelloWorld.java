package angrycircle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author 樹
 */
public class HelloWorld extends Application {
    
    public static void main(String... str) {
        Application.launch(str);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("AngryCircle");
        stage.setWidth(800);
        stage.setHeight(200);
        Label msg = new Label("AngryCircle Title");
        msg.setFont(new Font(80));
        stage.setScene(new Scene(msg));
        stage.show();
    }
    
}
