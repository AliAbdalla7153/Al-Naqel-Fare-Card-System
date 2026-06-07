package javafx.eventhandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoGetValueFromRadioButton extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Create object of toggle group
        ToggleGroup group = new ToggleGroup();

        //Add control
        RadioButton option1= new RadioButton("English");
        RadioButton option2= new RadioButton("Maths");
        RadioButton option3= new RadioButton("Science");
        RadioButton option4= new RadioButton("Computer Science");
        option1.setToggleGroup(group);
        option2.setToggleGroup(group);
        option3.setToggleGroup(group);
        option4.setToggleGroup(group);

        Button button1= new Button("Click here");
        Label label =new Label();
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (option1.isSelected()){
                    label.setText("You have selected "+option1.getText());
                }
                if (option2.isSelected()){
                    label.setText("You have selected "+option2.getText());
                }
                if (option3.isSelected()){
                    label.setText("You have selected "+option3.getText());
                }
                if (option4.isSelected()){
                    label.setText("You have selected "+option4.getText());
                }
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
