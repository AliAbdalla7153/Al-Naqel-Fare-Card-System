package javafx.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DemoBorderPaneLayout extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Add a control
        Button button1= new Button("Click me");
        Button button2= new Button("Click me");
        Button button3= new Button("Click me");

        //Define a layout
        BorderPane root =new BorderPane();
        //Add our control to layout
        root.setBottom(button1);
        root.setCenter(button2);
        root.setRight(button3);

        //Add layout to ascene
        Scene scene =new Scene(root);
        //Add scene to primary stage
        primaryStage.setScene(scene);
        //Set stage properties
        primaryStage.setTitle("This is java fx demo1");
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        //primaryStage.setFullScreen(true);
        //show stage
        primaryStage.show();
        //primaryStage.close();

    }
}
