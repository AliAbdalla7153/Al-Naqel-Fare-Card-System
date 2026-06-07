package javafx.eventhandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoGettingInputFromComboBox extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Add control
        ComboBox<String> subjects = new ComboBox<>();
        subjects.getItems().addAll("English","Maths","Science","I.T");

        Button button1= new Button("Click here");
        Label label =new Label();
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (subjects.getValue()==null){
                    label.setText("You have not selected any value");
                }
                else {
                    label.setText("You have seleccted "+subjects.getValue());
                }


            }
        });

        //Define a layout
        VBox root =new VBox();
        //Add our control to layout
        root.getChildren().addAll(subjects,button1,label);

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
