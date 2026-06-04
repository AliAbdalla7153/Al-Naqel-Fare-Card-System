package javafx.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DemoFlowPaneLayout extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        //Add a control
        Button button1= new Button("Click me");
        Button button2= new Button("Click me");
        Button button3= new Button("Click me");
        Button button4= new Button("Click me");
        Button button5= new Button("Click me");
        Button button6= new Button("Click me");
        //Define a layout
        FlowPane root =new FlowPane();
        //Add our control to layout
        //root.getChildren().add(button1);
        root.getChildren().addAll(button1,button2,button3,button4,button5,button6);

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
