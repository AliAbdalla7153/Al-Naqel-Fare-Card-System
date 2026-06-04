package javafx.uicontrol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoHyperLinkControl extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Add control
        Hyperlink hyperlink=new Hyperlink("https://www.youtube.com/");

        //Define a layout
        VBox root =new VBox(hyperlink);
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
