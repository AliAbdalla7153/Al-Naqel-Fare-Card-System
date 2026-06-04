package javafx.eventhandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoGetValueFromCheckBox extends Application {
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

        Button button1= new Button("Click here");
        Label label =new Label();
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String selectedOptions="";
                if (option1.isSelected()){
                   selectedOptions=selectedOptions+option1.getText();
                   selectedOptions=selectedOptions+" ";
                }
                if (option2.isSelected()){
                    selectedOptions=selectedOptions+option2.getText();
                    selectedOptions=selectedOptions+" ";
                }
                if (option3.isSelected()){
                    selectedOptions=selectedOptions+option3.getText();
                    selectedOptions=selectedOptions+" ";
                }
                if (option4.isSelected()){
                    selectedOptions=selectedOptions+option4.getText();
                    selectedOptions=selectedOptions+" ";
                }

                label.setText("You have selected "+selectedOptions);
            }
        });

        //Define a layout
        VBox root =new VBox();
        //Add our control to layout
        root.getChildren().addAll(option1,option2,option3,option4,button1,label);

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
