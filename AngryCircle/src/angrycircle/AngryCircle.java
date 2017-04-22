/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angrycircle;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.effect.Light;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author take5
 */
public class AngryCircle extends Application {

    private double startX;
    private double startY;
    private double endX;
    private double endY;

    @Override
    public void start(Stage primaryStage) {

        int sceneWidth = 800;
        int sceneHeight = 600;
        
        Group root = new Group();
        Scene scene = new Scene(root, sceneWidth, sceneHeight);

        Canvas canvas = new Canvas(sceneWidth, sceneHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        Image img = new Image("https://s3-ap-northeast-1.amazonaws.com/s3b-dev-angrycircle/image-dev/siki2.jpg");

        gc.drawImage(img, 0, 0, sceneWidth, sceneWidth);

        canvas.setOnMousePressed(e -> {
            startX = e.getX();
            startY = e.getY();
        });
        
        canvas.setOnMouseDragged(e -> {
            endX = e.getX();
            endY = e.getY();
            gc.strokeLine(startX, startY, endX, endY);
            startX = endX;
            startY = endY;
            
            
        });

        root.getChildren().add(canvas);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
