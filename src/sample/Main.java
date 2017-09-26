package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by KGZ on 2017/6/30 0030.
 */
public class Main extends Application implements Serializable{
    private static final long serialVersionUID = 7981560250804078637l;

    public static String indexViewID = "IndexView";
    public static String indexViewRes = "IndexScene.fxml";

    public static String personInformationViewID = "PersonInformationView";
    public static String personInformationViewRes = "PersonInformationScene.fxml";

    public static String companyInformationViewID = "CompanyInformationView";
    public static String companyInformationViewRes = "CompanyInformationScene.fxml";

    public static String addPersonalInformationViewID = "AddPersonalInformation";
    public static String addPersonalInformationViewRes = "AddPersonalInformationScene.fxml";

    public static String addCompanyInformationViewID="AddCompanyInformation";
    public static String addCompanyInformationViewRes="AddCompanyInformationScene.fxml";

    public static String errorViewID="Error";
    public static String errorViewRes="Error.fxml";

    public static String caculateViewID="Caculate";
    public static String caculateViewRes="Caculate.fxml";

    public static String checkInformationID="CheckInformation";
    public static String checkInformationViewRes="CheckInformation.fxml";

    public static String inputHospitalizationID="InputHospitalization";
    public static String InputHospitalizationRes="InputHospitalization.fxml";

    public static String inputRecipeInformationID="InputRecipeInformation";
    public static String InputRecipeInformationRes="InputRecipeInformationScene.fxml";



    private StageController stageController;


    @Override
    public void start(Stage primaryStage) throws IOException {

        stageController = new StageController();

        stageController.setPrimaryStage("primaryStage", primaryStage);

        stageController.loadStage(indexViewID,indexViewRes,StageStyle.DECORATED);
        stageController.loadStage(personInformationViewID,personInformationViewRes,StageStyle.DECORATED);
        stageController.loadStage(companyInformationViewID,companyInformationViewRes,StageStyle.DECORATED);
        stageController.loadStage(addPersonalInformationViewID,addPersonalInformationViewRes,StageStyle.DECORATED);
        stageController.loadStage(addCompanyInformationViewID,addCompanyInformationViewRes,StageStyle.DECORATED);
        stageController.loadStage(errorViewID,errorViewRes,StageStyle.DECORATED);
        stageController.loadStage(caculateViewID,caculateViewRes,StageStyle.DECORATED);
        stageController.loadStage(checkInformationID,checkInformationViewRes,StageStyle.DECORATED);
        stageController.loadStage(inputHospitalizationID,InputHospitalizationRes,StageStyle.DECORATED);
        stageController.loadStage(inputRecipeInformationID,InputRecipeInformationRes,StageStyle.DECORATED);
        stageController.setStage(indexViewID);
    }
    public static void main(String[] args){
        launch(args);
    }
}
