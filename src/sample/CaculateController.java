package sample;

import information.Hospitalization;
import information.PatientInformation;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CaculateController implements Initializable, ControlledStage {
    private StageController stageController;
    //private PersonInformation personInformation= IndexSceneController.personInformation;
    private PatientInformation patientInformation;
    private Hospitalization hospitalization;
    @FXML
    private Button back;
    @FXML
    private Label reimbrusement;
    @FXML
    private Label cost;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setStageController(StageController stageController) throws IOException, ClassNotFoundException {
        this.stageController=stageController;
    }
    public void caculate(){
        
    }
    private void setBack(){
        stageController.setStage(Main.indexViewID,Main.caculateViewID);
    }

}
