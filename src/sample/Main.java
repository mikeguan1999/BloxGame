package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BloxGame.fxml"));
        primaryStage.setTitle("BloxGame");
        Scene scene = new Scene(root, 800, 800);
        scene.addEventHandler(KeyEvent.ANY, (key) -> {
            System.out.print("hihihi");
            if(key.getCode()== KeyCode.A) {
                System.out.println("You pressed left");
            }
            if (key.getCode() == KeyCode.RIGHT) {
                System.out.println("You pressed right");
            }
            if (key.getCode() == KeyCode.DOWN) {
                System.out.println("You pressed down");
            }
            if (key.getCode() == KeyCode.UP) {
                System.out.println("You pressed up");
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
