package javafx.eventhandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoReadInputFromTextField extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Add control
        TextField textField1 =new TextField();
        textField1.setMaxWidth(300);
       /* PasswordField passwordField = new PasswordField();
        passwordField.setMaxWidth(300);*/
        TextField textField2 =new TextField();
        textField2.setMaxWidth(300);
        Button button1= new Button("Submit");
        Label label =new Label();
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //int x = Integer.parseInt(textField.getText());
                //label.setText("Welcome Mr."+textField.getText());
                int x1 = Integer.parseInt(textField1.getText());
                int x2 = Integer.parseInt(textField2.getText());
                int y =x1+x2;
                label.setText("Sum is equal "+y);

            }
        });


        //Define a layout
        VBox root =new VBox();
        //Add our control to layout
        root.getChildren().addAll(textField1,textField2,label,button1);

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
