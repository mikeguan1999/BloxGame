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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        blockSize = 20;
        gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.rgb(84, 192, 255));
        gc.setFill(Color.SEAGREEN);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        gc.setFill(Color.AQUAMARINE);

        drawSquare(0,0);
        drawSquare(1, 1);
        drawSquare(0,1);
        drawSquare(1,0);

        drawSquare(5,5);

    }

    public void drawSquare(int row, int col) {
        gc.fillRect(blockSize * row + 1, blockSize * col + 1, blockSize - 1, blockSize - 1);
    }

    public void drawBoard() {

    }
}
