package javafx.uicontrol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class DemoAddImageToLabel extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        FileInputStream input = new FileInputStream("C:\\Users\\sahil\\Pictures\\Screenshots\\AI.png");
        Image image = new Image(input);
        ImageView imageView =new ImageView(image);

        //Add a control
        Label label1= new Label("This is a label",imageView);

        //Define a layout
        HBox root =new HBox();
        //Add our control to layout
        root.getChildren().add(label1);

        //Add layout to ascene
        Scene scene =new Scene(root);
        //Add scene to primary stage
        primaryStage.setScene(scene);
        //Set stage properties
        primaryStage.setTitle("This is java fx demo1");
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.setFullScreen(true);
        //show stage
        primaryStage.show();
        //primaryStage.close();

    }
}
