package sample;

import fileIO.DataIO;
import fileIO.MyData;
import information.ClinicalInformation;
import information.PatientInformation;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CheckInformationController implements Initializable,ControlledStage{
    private StageController stageController;
    //private PersonInformation personInformation=IndexSceneController.personInformation;
    private ClinicalInformation clinicalInformation;
    private PatientInformation patientInformation;
    private DataIO dataIO=new DataIO();
    @FXML
    private Label showInformation;
    @FXML
    private Button back;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setStageController(StageController stageController) throws IOException, ClassNotFoundException {
        this.stageController=stageController;
    }
    public void showInformation() throws IOException, ClassNotFoundException {
        clinicalInformation=(ClinicalInformation)dataIO.readInformationByIDAndName(IndexSceneController.personInformation.getID(),IndexSceneController.personInformation.getName(),"hospitalization.dat");
        patientInformation=(PatientInformation)dataIO.readInformationByIDAndName(IndexSceneController.personInformation.getID(),IndexSceneController.personInformation.getName(),"patientInformation.dat");


    }




    @FXML
    private javafx.scene.control.MenuItem addPersonInformation;
    @FXML
    private javafx.scene.control.MenuItem addCompanyInformation;
    @FXML
    private javafx.scene.control.MenuItem deletePersonInformation;
    @FXML
    private javafx.scene.control.MenuItem deleteCompanyInformation;
    @FXML
    private javafx.scene.control.MenuItem checkPersonInformation;
    @FXML
    private javafx.scene.control.MenuItem checkCompanyInformation;
    @FXML
    private javafx.scene.control.MenuItem modifyPersonInformation;
    @FXML
    private javafx.scene.control.MenuItem modifyCompanyInformation;
    @FXML
    private javafx.scene.control.MenuItem loginInAsPerson;
    @FXML
    private javafx.scene.control.MenuItem loginInAsCompany;
    @FXML
    private javafx.scene.control.MenuItem quit;
    @FXML
    private javafx.scene.control.MenuItem load;


    public void setAddPersonInformation() {
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.addPersonalInformationViewID,Main.checkInformationID);
        }else{

        }
    }

    public void setAddCompanyInformation() {
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.addCompanyInformationViewID,Main.checkInformationID);
        }else{

        }
    }

    public void setDeletePersonInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            deletePersonInformation.disableProperty();
            stageController.setStage(Main.errorViewID,Main.checkInformationID);
        }else{
            IndexSceneController.state="deletePerson";
            stageController.setStage(Main.personInformationViewID,Main.checkInformationID);
        }

    }

    public void setDeleteCompanyInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()==""&&IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.checkInformationID);
        }else{
            IndexSceneController.state="deleteCompany";
            stageController.setStage(Main.companyInformationViewID,Main.checkInformationID);
        }
    }

    public void setCheckPersonInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.checkInformationID);
        }else{
            IndexSceneController.state="checkPerson";
            stageController.setStage(Main.personInformationViewID,Main.checkInformationID);


        }
    }

    public void setCheckCompanyInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()==""&&IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.checkInformationID);
        }else{
            IndexSceneController.state="checkCompany";
            stageController.setStage(Main.companyInformationViewID,Main.checkInformationID);
        }
    }

    public void setModifyPersonInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.checkInformationID);
        }else{
            IndexSceneController.state="modifyPerson";
            stageController.setStage(Main.personInformationViewID,Main.checkInformationID);
        }
    }

    public void setModifyCompanyInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()==""&&IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.checkInformationID);
        }else{
            IndexSceneController.state="modifyCompany";
            stageController.setStage(Main.companyInformationViewID,Main.checkInformationID);
        }
    }
    public void setLoginInAsPerson() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            IndexSceneController.state="loginInAsPerson";
            stageController.setStage(Main.personInformationViewID,Main.checkInformationID);
        }else{

        }
    }
    public void setLoginInAsCompany(){
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            IndexSceneController.state="loginInAsCompany";
            stageController.setStage(Main.companyInformationViewID,Main.checkInformationID);
        }else{

        }
    }
    public void setQuit(){
        IndexSceneController.personInformation=new PersonInformation("","");
        IndexSceneController.companyInformation=new CompanyInformation("","");
        stageController.setStage(Main.indexViewID,Main.checkInformationID);
    }

    @FXML
    private javafx.scene.control.MenuItem query;
    @FXML
    private javafx.scene.control.MenuItem inputMedicalInformation;
    @FXML
    private javafx.scene.control.MenuItem inputRecipeInformation;
    @FXML
    private javafx.scene.control.MenuItem caculate;
    @FXML
    private javafx.scene.control.MenuItem print;
    public void setQuery(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){

        }else{
            stageController.setStage(Main.checkInformationID,Main.checkInformationID);
        }
    }
    public void setInputMedicalInformation(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputHospitalizationID,Main.checkInformationID);
        }
    }
    public void setInputRecipeInformation(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputRecipeInformationID,Main.checkInformationID);
        }
    }
    public void setPrint(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){

        }else{
            System.out.println("12");
        }
    }
    public void setCaculate(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){


        }else{

        }
    }
}
