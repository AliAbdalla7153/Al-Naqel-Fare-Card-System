package javafx.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class DemoSimple extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Add a control
        Button button1= new Button("Click me");
        //Define a layout
        HBox root =new HBox();
        //Add our control to layout
        root.getChildren().add(button1);
        //Add layout to ascene
        Scene scene =new Scene(root);
        //Add scene to primary stage
        primaryStage.setScene(scene);
        //show stage
        primaryStage.show();

    }
}
