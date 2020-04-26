package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("BloxGame.fxml"));
        primaryStage.setTitle("BloxGame");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
//public class Main {
//    public static void main(String[] args) {
//        BloxWorld world = new BloxWorld(5,5);
//        world.printWorld();
//
//    }
//}