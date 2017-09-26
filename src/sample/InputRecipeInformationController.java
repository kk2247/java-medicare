package sample;

import fileIO.DataIO;
import information.Hospitalization;
import information.PatientInformation;
import information.Recipe;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import fileIO.*;
import javafx.scene.image.ImageView;
import jxl.read.biff.BiffException;

public class InputRecipeInformationController implements ControlledStage,Initializable,Serializable {
    private StageController stageController;
    private DataIO dataIO=new DataIO();
    private ExcelIO excellIO=new ExcelIO();
    //private PersonInformation personInformation=IndexSceneController.personInformation;
    private Hospitalization hospitalization;
    private String fileName="hospitalization.dat";


    public InputRecipeInformationController() throws IOException, BiffException {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }@FXML
    private Button button;
/*
删除账号以后
新增账号以后
 */

    @FXML
    private Button submit1;
    @FXML
    private Button submit2;
    @FXML
    private Button submit3;
    @FXML
    private Button submit4;
    @FXML
    private Button submit5;
    @FXML
    private Button submit6;
    @FXML
    private Button submit7;
    @FXML
    private Button submit8;
    @FXML
    private Button submit9;
    @FXML
    private TextField search1;
    @FXML
    private TextField search2;
    @FXML
    private TextField search3;
    @FXML
    private TextField search4;
    @FXML
    private TextField search5;
    @FXML
    private TextField search6;
    @FXML
    private TextField search7;
    @FXML
    private TextField search8;
    @FXML
    private TextField search9;
    @FXML
    private ImageView add1;
    @FXML
    private ImageView add2;
    @FXML
    private ImageView add3;
    @FXML
    private ImageView add4;
    @FXML
    private ImageView delete1;
    @FXML
    private ImageView delete2;
    @FXML
    private ImageView delete3;
    @FXML
    private ImageView delete4;
    @FXML
    private ImageView delete5;
    @FXML
    private ImageView delete6;
    @FXML
    private ImageView delete7;
    @FXML
    private ImageView delete8;
    @FXML
    private ImageView delete9;

    public void setSubmit1(){
        FuzzySeach fuzzySeach=new FuzzySeach();
       ObservableList<String> medi = FXCollections.observableArrayList();
        ArrayList<MyData>arrayList=new ArrayList<MyData>();
        try {
            ArrayList<MyData> myDatas=excellIO.readInformation(0,1,1024,"dta.xls");
            if(search1.getText().isEmpty()==false){
                arrayList=fuzzySeach.search(search1.getText(),myDatas);
                Iterator<MyData>iterator=arrayList.iterator();
                while(iterator.hasNext()) {
                    medi.add(iterator.next().getName());
                }if(arrayList.size()==0){
                    medicine1.setVisible(false);
                    search1.setVisible(true);
                    submit1.setVisible(false);
                    number1.setVisible(true);
                    medicine1.setValue(search1.getText());
                }
                medicine1.setVisible(true);
                search1.setVisible(false);
                submit1.setVisible(false);
                number1.setVisible(true);
                medicine1.setItems(medi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        medicine1.setItems(medi);
    }
    public void setSubmit2(){
        FuzzySeach fuzzySeach=new FuzzySeach();
        ObservableList<String> medi = FXCollections.observableArrayList();
        ArrayList<MyData>arrayList=new ArrayList<MyData>();
        try {
            ArrayList<MyData> myDatas=excellIO.readInformation(0,1,1024,"dta.xls");
            if(search2.getText().isEmpty()==false){
                arrayList=fuzzySeach.search(search2.getText(),myDatas);
                Iterator<MyData>iterator=arrayList.iterator();
                while(iterator.hasNext()) {
                    medi.add(iterator.next().getName());
                }if(arrayList.size()==0){
                    medicine2.setVisible(false);
                    search2.setVisible(true);
                    submit2.setVisible(false);
                    number2.setVisible(true);
                    medicine2.setValue(search1.getText());
                }
                medicine2.setVisible(true);
                search2.setVisible(false);
                submit2.setVisible(false);
                number2.setVisible(true);
                medicine2.setItems(medi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        medicine2.setItems(medi);
    }
    public void setSubmit3(){
        FuzzySeach fuzzySeach=new FuzzySeach();
        ObservableList<String> medi = FXCollections.observableArrayList();
        ArrayList<MyData>arrayList=new ArrayList<MyData>();
        try {
            ArrayList<MyData> myDatas=excellIO.readInformation(0,1,1024,"dta.xls");
            if(search3.getText().isEmpty()==false){
                arrayList=fuzzySeach.search(search3.getText(),myDatas);
                Iterator<MyData>iterator=arrayList.iterator();
                while(iterator.hasNext()) {
                    medi.add(iterator.next().getName());
                }if(arrayList.size()==0){
                    medicine3.setVisible(false);
                    search3.setVisible(true);
                    submit3.setVisible(false);
                    number3.setVisible(true);
                    medicine3.setValue(search1.getText());
                }
                medicine3.setVisible(true);
                search3.setVisible(false);
                submit3.setVisible(false);
                number3.setVisible(true);
                medicine3.setItems(medi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        medicine3.setItems(medi);
    }
    public void setSubmit4(){
        FuzzySeach fuzzySeach=new FuzzySeach();
        ObservableList<String> medi = FXCollections.observableArrayList();
        ArrayList<MyData>arrayList=new ArrayList<MyData>();
        try {
            ArrayList<MyData> myDatas=excellIO.readInformation(0,1,1024,"dta.xls");
            if(search4.getText().isEmpty()==false){
                arrayList=fuzzySeach.search(search4.getText(),myDatas);
                Iterator<MyData>iterator=arrayList.iterator();
                while(iterator.hasNext()) {
                    medi.add(iterator.next().getName());
                }if(arrayList.size()==0){
                    medicine4.setVisible(false);
                    search4.setVisible(true);
                    submit4.setVisible(false);
                    number4.setVisible(true);
                    medicine4.setValue(search1.getText());
                }
                medicine4.setVisible(true);
                search4.setVisible(false);
                submit4.setVisible(false);
                number4.setVisible(true);
                medicine4.setItems(medi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        medicine4.setItems(medi);
    }
    public void setSubmit5(){
        FuzzySeach fuzzySeach=new FuzzySeach();
        ObservableList<String> medi = FXCollections.observableArrayList();
        ArrayList<MyData>arrayList=new ArrayList<MyData>();
        try {
            ArrayList<MyData> myDatas=excellIO.readInformation(0,1,1024,"dta.xls");
            if(search5.getText().isEmpty()==false){
                arrayList=fuzzySeach.search(search5.getText(),myDatas);
                Iterator<MyData>iterator=arrayList.iterator();
                while(iterator.hasNext()) {
                    medi.add(iterator.next().getName());
                }if(arrayList.size()==0){
                    medicine5.setVisible(false);
                    search5.setVisible(true);
                    submit5.setVisible(false);
                    number5.setVisible(true);
                    medicine5.setValue(search1.getText());
                }
                medicine5.setVisible(true);
                search5.setVisible(false);
                submit5.setVisible(false);
                number5.setVisible(true);
                medicine5.setItems(medi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        medicine5.setItems(medi);
    }
    public void setSubmit6(){
        FuzzySeach fuzzySeach=new FuzzySeach();
        ObservableList<String> medi = FXCollections.observableArrayList();
        ArrayList<MyData>arrayList=new ArrayList<MyData>();
        try {
            ArrayList<MyData> myDatas=excellIO.readInformation(0,1,1024,"dta.xls");
            if(search6.getText().isEmpty()==false){
                arrayList=fuzzySeach.search(search6.getText(),myDatas);
                Iterator<MyData>iterator=arrayList.iterator();
                while(iterator.hasNext()) {
                    medi.add(iterator.next().getName());
                }if(arrayList.size()==0){
                    medicine6.setVisible(false);
                    search6.setVisible(true);
                    submit6.setVisible(false);
                    number6.setVisible(true);
                    medicine6.setValue(search1.getText());
                }
                medicine6.setVisible(true);
                search6.setVisible(false);
                submit6.setVisible(false);
                number6.setVisible(true);
                medicine6.setItems(medi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        medicine6.setItems(medi);
    }
    public void setSubmit7(){
        FuzzySeach fuzzySeach=new FuzzySeach();
        ObservableList<String> medi = FXCollections.observableArrayList();
        ArrayList<MyData>arrayList=new ArrayList<MyData>();
        try {
            ArrayList<MyData> myDatas=excellIO.readInformation(0,1,1024,"dta.xls");
            if(search7.getText().isEmpty()==false){
                arrayList=fuzzySeach.search(search7.getText(),myDatas);
                Iterator<MyData>iterator=arrayList.iterator();
                while(iterator.hasNext()) {
                    medi.add(iterator.next().getName());
                }if(arrayList.size()==0){
                    medicine7.setVisible(false);
                    search7.setVisible(true);
                    submit7.setVisible(false);
                    number7.setVisible(true);
                    medicine7.setValue(search1.getText());
                }
                medicine7.setVisible(true);
                search7.setVisible(false);
                submit7.setVisible(false);
                number7.setVisible(true);
                medicine7.setItems(medi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        medicine7.setItems(medi);
    }
    public void setSubmit8(){
        FuzzySeach fuzzySeach=new FuzzySeach();
        ObservableList<String> medi = FXCollections.observableArrayList();
        ArrayList<MyData>arrayList=new ArrayList<MyData>();
        try {
            ArrayList<MyData> myDatas=excellIO.readInformation(0,1,1024,"dta.xls");
            if(search8.getText().isEmpty()==false){
                arrayList=fuzzySeach.search(search8.getText(),myDatas);
                Iterator<MyData>iterator=arrayList.iterator();
                while(iterator.hasNext()) {
                    medi.add(iterator.next().getName());
                }if(arrayList.size()==0){
                    medicine8.setVisible(false);
                    search8.setVisible(true);
                    submit8.setVisible(false);
                    number8.setVisible(true);
                    medicine8.setValue(search1.getText());
                }
                medicine8.setVisible(true);
                search8.setVisible(false);
                submit8.setVisible(false);
                number8.setVisible(true);
                medicine8.setItems(medi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        medicine8.setItems(medi);
    }
    public void setSubmit9(){
        FuzzySeach fuzzySeach=new FuzzySeach();
        ObservableList<String> medi = FXCollections.observableArrayList();
        ArrayList<MyData>arrayList=new ArrayList<MyData>();
        try {
            ArrayList<MyData> myDatas=excellIO.readInformation(0,1,1024,"dta.xls");
            if(search9.getText().isEmpty()==false){
                arrayList=fuzzySeach.search(search9.getText(),myDatas);
                Iterator<MyData>iterator=arrayList.iterator();
                while(iterator.hasNext()) {
                    medi.add(iterator.next().getName());
                }if(arrayList.size()==0){
                    medicine9.setVisible(false);
                    search9.setVisible(true);
                    submit9.setVisible(false);
                    number9.setVisible(true);
                    medicine9.setValue(search1.getText());
                }
                medicine9.setVisible(true);
                search9.setVisible(false);
                submit9.setVisible(false);
                number9.setVisible(true);
                medicine9.setItems(medi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        medicine9.setItems(medi);
    }
    public void setAdd1(){
        search6.setVisible(true);
        submit6.setVisible(true);
        add2.setVisible(true);
        add1.setVisible(false);
        delete6.setVisible(true);
    }
    public void setAdd2(){
        search7.setVisible(true);
        submit7.setVisible(true);
        add3.setVisible(true);
        add2.setVisible(false);
        delete7.setVisible(true);
    }
    public void setAdd3(){
        search8.setVisible(true);
        submit8.setVisible(true);
        add4.setVisible(true);
        add3.setVisible(false);
        delete8.setVisible(true);
    }
    public void setAdd4(){
        search9.setVisible(true);
        submit9.setVisible(true);
        add4.setVisible(false);
        delete9.setVisible(true);
    }
    public void setDelete1(){
        search1.setText("");
        submit1.setVisible(true);
        search1.setVisible(true);
        medicine1.setVisible(false);
        number1.setVisible(false);
        number1.setText("");
    }
    public void setDelete2(){
        search2.setText("");
        submit2.setVisible(true);
        search2.setVisible(true);
        medicine2.setVisible(false);
        number2.setVisible(false);
        number2.setText("");
    }
    public void setDelete3(){
        search3.setText("");
        submit3.setVisible(true);
        search3.setVisible(true);
        medicine3.setVisible(false);
        number3.setVisible(false);
        number3.setText("");
    }
    public void setDelete4(){
        search4.setText("");
        submit4.setVisible(true);
        search4.setVisible(true);
        medicine4.setVisible(false);
        number4.setVisible(false);
        number4.setText("");
    }
    public void setDelete5(){
        search5.setText("");
        submit5.setVisible(true);
        search5.setVisible(true);
        medicine5.setVisible(false);
        number5.setVisible(false);
        number5.setText("");
    }
    public void setDelete6(){
        search6.setText("");
        submit6.setVisible(true);
        search6.setVisible(true);
        medicine6.setVisible(false);
        number6.setVisible(false);
        number6.setText("");
    }
    public void setDelete7(){
        search7.setText("");
        submit7.setVisible(true);
        search7.setVisible(true);
        medicine7.setVisible(false);
        number7.setVisible(false);
        number7.setText("");
    }
    public void setDelete8(){
        search8.setText("");
        submit8.setVisible(true);
        search8.setVisible(true);
        medicine8.setVisible(false);
        number8.setVisible(false);
        number8.setText("");
    }
    public void setDelete9(){
        search9.setText("");
        submit9.setVisible(true);
        search9.setVisible(true);
        medicine9.setVisible(false);
        number9.setVisible(false);
        number9.setText("");
    }


//    public void loadMedicine(){
//        try {
//            ArrayList<MyData> myDatas=excellIO.readInformation(0,1,1024,"dta.xls");
//            Iterator<MyData>iterator=myDatas.iterator();
//            while(iterator.hasNext()) {
//                medi.add(iterator.next().getName());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (BiffException e) {
//            e.printStackTrace();
//        }
//        medicine1.setItems(medi);
//    }

    @Override
    public void setStageController(StageController stageController) throws IOException, ClassNotFoundException {
        this.stageController=stageController;
        search1.setVisible(true);search2.setVisible(true);
        search3.setVisible(true);search4.setVisible(true);search5.setVisible(true);search6.setVisible(false);search7.setVisible(false);
        search8.setVisible(false);search9.setVisible(false);
        submit1.setVisible(true);submit2.setVisible(true);submit3.setVisible(true);submit4.setVisible(true);submit5.setVisible(true);submit6.setVisible(false);submit7.setVisible(false);submit8.setVisible(false);submit9.setVisible(false);
        delete1.setVisible(true);delete2.setVisible(true);delete3.setVisible(true);delete4.setVisible(true);delete5.setVisible(true);delete6.setVisible(false);delete7.setVisible(false);delete8.setVisible(false);delete9.setVisible(false);
        add1.setVisible(true);add2.setVisible(false);add3.setVisible(false);add4.setVisible(false);
        medicine1.setVisible(false);medicine2.setVisible(false);medicine3.setVisible(false);medicine4.setVisible(false);medicine5.setVisible(false);medicine6.setVisible(false);medicine7.setVisible(false);medicine8.setVisible(false);medicine9.setVisible(false);
        number1.setVisible(false);number2.setVisible(false);number3.setVisible(false);number4.setVisible(false);number5.setVisible(false);number6.setVisible(false);number7.setVisible(false);number8.setVisible(false);number9.setVisible(false);
        medicine1.setValue("");
        medicine2.setValue("");
        medicine3.setValue("");
        medicine4.setValue("");
        medicine5.setValue("");
        medicine6.setValue("");
        medicine7.setValue("");
        medicine8.setValue("");
        medicine9.setValue("");
    }
    @FXML
    private ComboBox medicine1;
    @FXML
    private ComboBox medicine2;
    @FXML
    private ComboBox medicine3;
    @FXML
    private ComboBox medicine4;
    @FXML
    private ComboBox medicine5;
    @FXML
    private ComboBox medicine6;
    @FXML
    private ComboBox medicine7;
    @FXML
    private ComboBox medicine8;
    @FXML
    private ComboBox medicine9;
    @FXML
    private TextField number1;
    @FXML
    private TextField number2;
    @FXML
    private TextField number3;
    @FXML
    private TextField number4;
    @FXML
    private TextField number5;
    @FXML
    private TextField number6;
    @FXML
    private TextField number7;
    @FXML
    private TextField number8;
    @FXML
    private TextField number9;
    @FXML
    private Button sure;
    @FXML
    private Button back;

    public void setSure() throws IOException, ClassNotFoundException {
//        hospitalization=new Hospitalization(IndexSceneController.personInformation.getName(),IndexSceneController.personInformation.getID());
//        ArrayList<Recipe>recipes=new ArrayList<Recipe>();
//        if(((String)medicine1.getValue()).equals("")==false){
//            recipes.add(new Recipe((String)medicine1.getValue(),Integer.valueOf( number1.getText())));
//        }
//        if(((String)medicine2.getValue()).equals("")==false){
//            recipes.add(new Recipe((String)medicine2.getValue(),Integer.valueOf( number2.getText())));
//        }
//        if(((String)medicine3.getValue()).equals("")==false){
//            recipes.add(new Recipe((String)medicine3.getValue(),Integer.valueOf( number3.getText())));
//        }
//        if(((String)medicine4.getValue()).equals("")==false){
//            recipes.add(new Recipe((String)medicine4.getValue(),Integer.valueOf( number4.getText())));
//        }
//        if(((String)medicine5.getValue()).equals("")==false){
//            recipes.add(new Recipe((String)medicine5.getValue(),Integer.valueOf( number5.getText())));
//        }
//        if(((String)medicine6.getValue()).equals("")==false){
//            recipes.add(new Recipe((String)medicine6.getValue(),Integer.valueOf( number6.getText())));
//        }
//        if(((String)medicine7.getValue()).equals("")==false){
//            recipes.add(new Recipe((String)medicine7.getValue(),Integer.valueOf( number7.getText())));
//        }
//        if(((String)medicine8.getValue()).equals("")==false){
//            recipes.add(new Recipe((String)medicine8.getValue(),Integer.valueOf( number8.getText())));
//        }
//        if(((String)medicine9.getValue()).equals("")==false){
//            recipes.add(new Recipe((String)medicine9.getValue(),Integer.valueOf( number9.getText())));
//        }
//
//        hospitalization.setRecipes(recipes);
//        dataIO.store(hospitalization,fileName);
        stageController.setStage(Main.indexViewID,Main.inputRecipeInformationID);
    }
    public void clear1(){

    }
    public void setBack(){
        stageController.setStage(Main.indexViewID,Main.inputRecipeInformationID);
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
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.addPersonalInformationViewID,Main.inputRecipeInformationID);
        }else{

        }
    }

    public void setAddCompanyInformation() {
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.addCompanyInformationViewID,Main.inputRecipeInformationID);
        }else{

        }
    }

    public void setDeletePersonInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputRecipeInformationID);
        }else{
            IndexSceneController.state="deletePerson";
            stageController.setStage(Main.personInformationViewID,Main.inputRecipeInformationID);
        }

    }

    public void setDeleteCompanyInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()==""&&IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputRecipeInformationID);
        }else{
            IndexSceneController.state="deleteCompany";
            stageController.setStage(Main.companyInformationViewID,Main.indexViewID);
        }
    }

    public void setCheckPersonInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputRecipeInformationID);
        }else{
            IndexSceneController.state="checkPerson";
            stageController.setStage(Main.personInformationViewID,Main.inputRecipeInformationID);


        }
    }

    public void setCheckCompanyInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()==""&&IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputRecipeInformationID);
        }else{
            IndexSceneController.state="checkCompany";
            stageController.setStage(Main.companyInformationViewID,Main.inputRecipeInformationID);
        }
    }

    public void setModifyPersonInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputRecipeInformationID);
        }else{
            IndexSceneController.state="modifyPerson";
            stageController.setStage(Main.personInformationViewID,Main.inputRecipeInformationID);
        }
    }

    public void setModifyCompanyInformation() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()==""&&IndexSceneController.companyInformation.getName()==""){
            stageController.setStage(Main.errorViewID,Main.inputRecipeInformationID);
        }else{
            IndexSceneController.state="modifyCompany";
            stageController.setStage(Main.companyInformationViewID,Main.inputRecipeInformationID);
        }
    }
    public void setLoginInAsPerson() throws IOException, ClassNotFoundException {
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            IndexSceneController.state="loginInAsPerson";
            stageController.setStage(Main.personInformationViewID,Main.inputRecipeInformationID);
        }else{

        }
    }
    public void setLoginInAsCompany(){
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            IndexSceneController.state="loginInAsCompany";
            stageController.setStage(Main.companyInformationViewID,Main.inputRecipeInformationID);
        }else{

        }
    }
    public void setQuit(){
        IndexSceneController.companyInformation=new CompanyInformation("","");
        IndexSceneController.personInformation=new PersonInformation("","");
        stageController.setStage(Main.indexViewID,Main.inputRecipeInformationID);
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
            stageController.setStage(Main.checkInformationID,Main.inputRecipeInformationID);
        }
    }
    public void setInputMedicalInformation(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputHospitalizationID,Main.inputRecipeInformationID);
        }
    }
    public void setInputRecipeInformation(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputRecipeInformationID,Main.inputRecipeInformationID);
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
