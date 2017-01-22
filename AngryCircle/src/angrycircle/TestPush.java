package angrycircle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author 凌
 */
public class TestPush extends Application {
    
    public static void main(String... str) {
        Application.launch(str);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TestPush");
        stage.setWidth(800);
        stage.setHeight(200);
        Label msg = new Label("田舎のPRO-BOX");
        msg.setFont(new Font(80));
        stage.setScene(new Scene(msg));
        stage.show();
    }
    
}
