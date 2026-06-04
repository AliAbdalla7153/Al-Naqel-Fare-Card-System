package javafx.uicontrol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoCheckBoxControl extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Add control
        CheckBox option1= new CheckBox("English");
        CheckBox option2= new CheckBox("Maths");
        CheckBox option3= new CheckBox("Science");
        CheckBox option4= new CheckBox("Computer Science");


        //Define a layout
        VBox root =new VBox();
        //Add our control to layout
        root.getChildren().addAll(option1,option2,option3,option4);

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
