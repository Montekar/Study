package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Main extends Application{

    Scene main, questions;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Title");

        //stage 1 --------------------
        Label name = new Label("Name:");
        TextField textField = new TextField();

        button = new Button(); //instead of button.setText("text"); the text can be placed directly in brackets ("text")
        button.setText("Click me");

        button.setOnAction(e -> {
            System.out.println("Button have been clicked");
            primaryStage.setScene(questions);
        });

        HBox hb = new HBox();
        hb.getChildren().addAll(button, name, textField);
        hb.setSpacing(10);
        main = new Scene(hb, 500,500);


        //stage 2 ----------------------
        Label lastname = new Label("Last name:");
        TextField textField2 = new TextField();

        button = new Button(); //instead of button.setText("text"); the text can be placed directly in brackets ("text")
        button.setText("Click me");

        button.setOnAction(e -> {
            System.out.println("Button have been clicked");
            primaryStage.setScene(main);
        });

        HBox hb2 = new HBox();
        hb2.getChildren().addAll(button, lastname, textField2);
        hb2.setSpacing(10);
        questions = new Scene(hb2, 500,500);



        primaryStage.setScene(main);
        primaryStage.show();
    }

}
