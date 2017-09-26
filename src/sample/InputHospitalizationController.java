package sample;

import fileIO.DataIO;
import information.ClinicalInformation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InputHospitalizationController implements Initializable,ControlledStage {
    private StageController stageController;
    private DataIO dataIO=new DataIO();
    //private PersonInformation personInformation=IndexSceneController.personInformation;
    private ObservableList<String> hosType = FXCollections.observableArrayList("普通门诊","定点药店购药","急诊抢救","普通住院","生育门诊","节育门诊","生育住院","节育住院","所有类别");
    private ObservableList<String> level = FXCollections.observableArrayList("一级医院","二级医院","三级医院","社区医院","所有医院");
    private ObservableList<String> rea = FXCollections.observableArrayList("正常治愈出院","未治愈出院","医院要求转院","病人要求转院","院内相关疾病转科治疗","院内无相关疾病专科治疗","死亡","所有类别");
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setStageController(StageController stageController) throws IOException, ClassNotFoundException {
        this.stageController=stageController;
        hospiatalType.setItems(hosType);
        hospitalLevel.setItems(level);
        reason.setItems(rea);
    }
    @FXML
    private TextField hospitalName;
    @FXML
    private TextField hospitalID;
    @FXML
    private ComboBox hospiatalType;
    @FXML
    private TextField sickInformation;
    @FXML
    private TextField outDate;
    @FXML
    private ComboBox hospitalLevel;
    @FXML
    private TextField sickName;
    @FXML
    private ComboBox reason;
    @FXML
    private Button sure;
    @FXML
    private Button back;
    public void setSure() throws IOException, ClassNotFoundException {
        ClinicalInformation clinicalInformation=new ClinicalInformation(IndexSceneController.personInformation.getName(),IndexSceneController.personInformation.getID(),
                hospitalName.getText(),hospitalID.getText(),(String)hospiatalType.getValue(),sickInformation.getText(),outDate.getText(),
                (String)hospitalLevel.getValue(),sickName.getText(),(String)reason.getValue());
        dataIO.store(clinicalInformation,"clinicalInformation.dat");
        stageController.setStage(Main.indexViewID,Main.inputHospitalizationID);
    }
    public void setBack(){
        stageController.setStage(Main.indexViewID,Main.inputHospitalizationID);
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
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""&&IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.addPersonalInformationViewID,Main.inputHospitalizationID);
        }else{

        }
    }

    public void setAddCompanyInformation() {
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""&&IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.addCompanyInformationViewID,Main.inputHospitalizationID);
        }else{

        }
    }

    public void setDeletePersonInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputHospitalizationID);
        }else{
            IndexSceneController.state="deletePerson";
            stageController.setStage(Main.personInformationViewID,Main.inputHospitalizationID);
        }

    }

    public void setDeleteCompanyInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()==""&&IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputHospitalizationID);
        }else{
            IndexSceneController.state="deleteCompany";
            stageController.setStage(Main.companyInformationViewID,Main.inputHospitalizationID);
        }
    }

    public void setCheckPersonInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputHospitalizationID);
        }else{
            IndexSceneController.state="checkPerson";
            stageController.setStage(Main.personInformationViewID,Main.inputHospitalizationID);


        }
    }

    public void setCheckCompanyInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()==""&&IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputHospitalizationID);
        }else{
            IndexSceneController.state="checkCompany";
            stageController.setStage(Main.companyInformationViewID,Main.inputHospitalizationID);
        }
    }

    public void setModifyPersonInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputHospitalizationID);
        }else{
            IndexSceneController.state="modifyPerson";
            stageController.setStage(Main.personInformationViewID,Main.inputHospitalizationID);
        }
    }

    public void setModifyCompanyInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()==""&&IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputHospitalizationID);
        }else{
            IndexSceneController.state="modifyCompany";
            stageController.setStage(Main.companyInformationViewID,Main.inputHospitalizationID);
        }
    }
    public void setLoginInAsPerson() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            IndexSceneController.state="loginInAsPerson";
            stageController.setStage(Main.personInformationViewID,Main.inputHospitalizationID);
        }else{

        }
    }
    public void setLoginInAsCompany(){
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            IndexSceneController.state="loginInAsCompany";
            stageController.setStage(Main.companyInformationViewID,Main.inputHospitalizationID);
        }else{

        }
    }
    public void setQuit(){
        IndexSceneController.personInformation=new PersonInformation("","");
        IndexSceneController.companyInformation=new CompanyInformation("","");
        stageController.setStage(Main.indexViewID,Main.inputHospitalizationID);
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
            stageController.setStage(Main.checkInformationID,Main.inputHospitalizationID);
        }
    }
    public void setInputMedicalInformation(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputHospitalizationID,Main.inputHospitalizationID);
        }
    }
    public void setInputRecipeInformation(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputRecipeInformationID,Main.inputHospitalizationID);
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
    public void setBackToIndex5(){
        stageController.setStage(Main.indexViewID,Main.inputHospitalizationID);
    }
}
