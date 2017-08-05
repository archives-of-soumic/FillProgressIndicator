package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML private StackPane stackPane;
    private WorkThread workThread;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        RingProgressIndicator ringProgressIndicator = new RingProgressIndicator();
        ringProgressIndicator.setRingWidth(200);
        ringProgressIndicator.makeIndeterminate();

        stackPane.getChildren().add(ringProgressIndicator);
        workThread = new WorkThread(ringProgressIndicator);
        workThread.start();

    }
}
