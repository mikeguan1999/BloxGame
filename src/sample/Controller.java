package sample;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Canvas canvas;
    private GraphicsContext gc;
    private int blockSize;
    private BloxWorld world;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        blockSize = 20;
        gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.rgb(84, 192, 255));
        gc.setFill(Color.SEAGREEN);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        gc.setFill(Color.AQUAMARINE);

        world = new BloxWorld(20, 20);
        world.setBlox(0,0, new Blox("me", Color.RED));
        world.setBlox(5, 10, new Blox("something", Color.DARKORANGE));

        drawBoard();
    }

    public void drawSquare(int row, int col, Blox blox) {
        if (blox != null) {
            gc.setFill(blox.getColor());
            gc.fillRect(blockSize * row + 1, blockSize * col + 1, blockSize - 1, blockSize - 1);
        }
    }

    public void drawBoard() {
        for (int i = 0; i < world.getHeight() ; i++) {
            for (int j = 0; j < world.getWidth(); j++) {
               drawSquare(i, j, world.getBloxAt(i, j));
            }
        }

    }
}
