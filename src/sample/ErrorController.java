package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ErrorController implements ControlledStage,Initializable {
    private StageController stageController;
    @FXML
    private Button goToLoginIn;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setStageController(StageController stageController) throws IOException, ClassNotFoundException {
        this.stageController=stageController;
    }
    public void setGoToLoginIn(){
        stageController.setStage(Main.indexViewID,Main.errorViewID);
    }
}
