package javafx.uicontrol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class DemoLabelProperties extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Add a control
        Label label1= new Label("This is a label");
        label1.setText("I am setting another label");
        label1.setTextFill(Color.BLUE);
        label1.setFont(new Font("Times New Roman",32));
        label1.setTextAlignment(TextAlignment.JUSTIFY.JUSTIFY);
       //label1.setWrapText(true);

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
        //primaryStage.setFullScreen(true);
        //show stage
        primaryStage.show();
        //primaryStage.close();

    }
}
