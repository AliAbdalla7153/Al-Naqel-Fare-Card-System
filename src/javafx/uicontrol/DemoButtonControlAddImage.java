package javafx.uicontrol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class DemoButtonControlAddImage extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {


        FileInputStream input = new FileInputStream("C:\\Users\\sahil\\Pictures\\Screenshots\\AI.png");
        Image image = new Image(input);
        ImageView imageView =new ImageView(image);
        imageView.setFitHeight(40);
        imageView.setFitWidth(80);

        //Add a control
        Button button1= new Button("Click here",imageView);
        //Define a layout
        HBox root =new HBox();
        //Add our control to layout
        root.getChildren().add(button1);

        //Add layout to ascene
        Scene scene =new Scene(root);
        //Add scene to primary stage
        primaryStage.setScene(scene);
        //Set stage properties
        primaryStage.setTitle("JavaFX UI Control  Demo");
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        //primaryStage.setFullScreen(true);
        //show stage
        primaryStage.show();
        //primaryStage.close();

    }
}
