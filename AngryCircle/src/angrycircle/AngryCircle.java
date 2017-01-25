/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angrycircle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.effect.Light;
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

        Group root = new Group();
        Scene scene = new Scene(root, 800, 600);

        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLUE);
        gc.fillRect(75, 75, 100, 100);

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
