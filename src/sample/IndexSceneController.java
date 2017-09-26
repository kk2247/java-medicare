package sample;

import fileIO.DataIO;
import fileIO.MyData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import sample.ControlledStage;
import sample.Main;
import sample.StageController;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

public class IndexSceneController implements ControlledStage,Initializable,Serializable {
    private static final long serialVersionUID = 7981560250804078637l;
    public static String state="";
    public static PersonInformation personInformation=new PersonInformation("","");
    public static CompanyInformation companyInformation=new CompanyInformation("","");
    private MyData myData;
    private DataIO dataIO=new DataIO();
    private StageController stageController;
    @FXML
    private MenuItem addPersonInformation;
    @FXML
    private MenuItem addCompanyInformation;
    @FXML
    private MenuItem deletePersonInformation;
    @FXML
    private MenuItem deleteCompanyInformation;
    @FXML
    private MenuItem checkPersonInformation;
    @FXML
    private MenuItem checkCompanyInformation;
    @FXML
    private MenuItem modifyPersonInformation;
    @FXML
    private MenuItem modifyCompanyInformation;
    @FXML
    private MenuItem loginInAsPerson;
    @FXML
    private MenuItem loginInAsCompany;
    @FXML
    private MenuItem quit;
    @FXML
    private MenuItem load;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setStageController(StageController stageController) throws IOException, ClassNotFoundException {
        this.stageController=stageController;
    }

    public void setAddPersonInformation() {
       if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.addPersonalInformationViewID,Main.indexViewID);
       }else{

       }
    }

    public void setAddCompanyInformation() {
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.addCompanyInformationViewID,Main.indexViewID);
        }else{

        }
    }

    public void setDeletePersonInformation() throws IOException, ClassNotFoundException {
        if(personInformation.getID()==""&&personInformation.getName()==""){
            deletePersonInformation.disableProperty();
            stageController.setStage(Main.errorViewID,Main.indexViewID);
        }else{
            state="deletePerson";
            stageController.setStage(Main.personInformationViewID,Main.indexViewID);
        }

    }

    public void setDeleteCompanyInformation() throws IOException, ClassNotFoundException {
        if(companyInformation.getID()==""&&companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.indexViewID);
        }else{
            state="deleteCompany";
            stageController.setStage(Main.companyInformationViewID,Main.indexViewID);
        }
    }

    public void setCheckPersonInformation() throws IOException, ClassNotFoundException {
        if(personInformation.getID()==""&&personInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.indexViewID);
        }else{
            state="checkPerson";
            stageController.setStage(Main.personInformationViewID,Main.indexViewID);


        }
    }

    public void setCheckCompanyInformation() throws IOException, ClassNotFoundException {
        if(companyInformation.getID()==""&&companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.indexViewID);
        }else{
            state="checkCompany";
            stageController.setStage(Main.companyInformationViewID,Main.indexViewID);
        }
    }

    public void setModifyPersonInformation() throws IOException, ClassNotFoundException {
        if(personInformation.getID()==""&&personInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.indexViewID);
        }else{
            state="modifyPerson";
            stageController.setStage(Main.personInformationViewID,Main.indexViewID);
        }
    }

    public void setModifyCompanyInformation() throws IOException, ClassNotFoundException {
        if(companyInformation.getID()==""&&companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.indexViewID);
        }else{
           state="modifyCompany";
            stageController.setStage(Main.companyInformationViewID,Main.indexViewID);
        }
    }
    public void setLoginInAsPerson() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            state="loginInAsPerson";
            stageController.setStage(Main.personInformationViewID,Main.indexViewID);
        }else{

        }
    }
    public void setLoginInAsCompany(){
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            state="loginInAsCompany";
            stageController.setStage(Main.companyInformationViewID,Main.indexViewID);
        }else{

        }
    }
    public void setQuit(){
        personInformation=new PersonInformation("","");
        stageController.setStage(Main.indexViewID,Main.indexViewID);
    }

    @FXML
    private MenuItem query;
    @FXML
    private MenuItem inputMedicalInformation;
    @FXML
    private MenuItem inputRecipeInformation;
    @FXML
    private MenuItem caculate;
    @FXML
    private MenuItem print;
    public void setQuery(){
        if(personInformation.getName()==""&&personInformation.getID()==""){

        }else{
            stageController.setStage(Main.checkInformationID,Main.indexViewID);
        }
    }
    public void setInputMedicalInformation(){
        if(personInformation.getName()==""&&personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputHospitalizationID,Main.indexViewID);
        }
    }
    public void setInputRecipeInformation(){
        if(personInformation.getName()==""&&personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputRecipeInformationID,Main.indexViewID);
        }
    }
    public void setPrint(){
        if(personInformation.getName()==""&&personInformation.getID()==""){

        }else{
            System.out.println("12");
        }
    }
    public void setCaculate(){
        if(personInformation.getName()==""&&personInformation.getID()==""){


        }else{

        }
    }


    @FXML
    private MenuItem statistics;
    public void setStatistics() throws IOException, ClassNotFoundException {
        ArrayList<MyData> list=dataIO.getAll("personInformation.dat");
        Iterator<MyData> iterator=list.iterator();
        while(iterator.hasNext()){
            PersonInformation info=(PersonInformation)iterator.next();
            if(info.getSex().equals("男")){

            }
        }
    }


}
