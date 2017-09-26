package sample;

import fileIO.DataIO;
import fileIO.MyData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

public class PersonInformationSceneController implements ControlledStage,Initializable,Serializable,LoadInformation {
    private static final long serialVersionUID = 7981560250804078637l;
    private String fileName="personInformation.dat";
    private ArrayList<MyData> arr=null;
    private StageController stageController;
    private DataIO dataIO=new DataIO();
    private PersonInformation personInformation=new PersonInformation("","");



    //显示得到所有信息的界面，可选择
    @FXML
    private AnchorPane list;
    @FXML
    private Button getBackToQuery2;
    @FXML
    private Button check1;
    @FXML
    private Button check2;
    @FXML
    private Button check3;
    @FXML
    private Button check4;
    @FXML
    private Button check5;
    @FXML
    private Button check6;
    @FXML
    private Label display1;
    @FXML
    private Label display2;
    @FXML
    private Label display3;
    @FXML
    private Label display4;
    @FXML
    private Label display5;
    @FXML
    private Label display6;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setStageController(StageController stageController) throws IOException, ClassNotFoundException {
        this.stageController=stageController;

    }
    /*
    该界面为登陆界面
     */
    //登陆界面
    @FXML
    private AnchorPane loginIn;
    @FXML
    private Label warn;
    @FXML
    private TextField name;
    @FXML
    private TextField Id;
    @FXML
    private Button clear;
    @FXML
    private Button loginInButton;
    public void transToQuery() throws IOException, ClassNotFoundException {
        personInformation.setName("");
        personInformation.setID("");
        if(name.getText().isEmpty()==true&&Id.getText().isEmpty()==true){
            warn.setText("姓名与身份证号不可同时为空");
        }else if(name.getText().isEmpty()==true&&Id.getText().isEmpty()==false){
            personInformation.setID(Id.getText());
            arr=dataIO.readInformationByID(personInformation.getID(),fileName);
            if(arr==null){
                warn.setText("无法找到该用户");
            }else{
                loginIn.setVisible(false);
                list.setVisible(true);
                switch (arr.size()){
                    case 1:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(false);
                        check3.setVisible(false);
                        check4.setVisible(false);
                        check5.setVisible(false);
                        check6.setVisible(false);
                        break;
                    }
                    case 2:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display2.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(true);
                        check3.setVisible(false);
                        check4.setVisible(false);
                        check5.setVisible(false);
                        check6.setVisible(false);
                        break;
                    }
                    case 3:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display2.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display3.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(true);
                        check3.setVisible(true);
                        check4.setVisible(false);
                        check5.setVisible(false);
                        check6.setVisible(false);
                        break;
                    }
                    case 4:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display2.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display3.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display4.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(true);
                        check3.setVisible(true);
                        check4.setVisible(true);
                        check5.setVisible(false);
                        check6.setVisible(false);
                        break;
                    }
                    case 5:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display2.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display3.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display4.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display5.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(true);
                        check3.setVisible(true);
                        check4.setVisible(true);
                        check5.setVisible(true);
                        check6.setVisible(false);
                        break;
                    }
                    case 6:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display2.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display3.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display4.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display5.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display6.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(true);
                        check3.setVisible(true);
                        check4.setVisible(true);
                        check5.setVisible(true);
                        check6.setVisible(true);
                        break;
                    }
                }

            }
        }else if(name.getText().isEmpty()==false&&Id.getText().isEmpty()==true){
            personInformation.setName(name.getText());
            arr=dataIO.readInformationByName(personInformation.getName(),fileName);
            if(arr==null){
                warn.setText("无法找到该用户");
            }else{
                loginIn.setVisible(false);
                list.setVisible(true);
                switch (arr.size()) {
                    case 1:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(false);
                        check3.setVisible(false);
                        check4.setVisible(false);
                        check5.setVisible(false);
                        check6.setVisible(false);
                        break;
                    }
                    case 2:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display2.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(true);
                        check3.setVisible(false);
                        check4.setVisible(false);
                        check5.setVisible(false);
                        check6.setVisible(false);
                        break;
                    }
                    case 3:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display2.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display3.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(true);
                        check3.setVisible(true);
                        check4.setVisible(false);
                        check5.setVisible(false);
                        check6.setVisible(false);
                        break;
                    }
                    case 4:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display2.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display3.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display4.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(true);
                        check3.setVisible(true);
                        check4.setVisible(true);
                        check5.setVisible(false);
                        check6.setVisible(false);
                        break;
                    }
                    case 5:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display2.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display3.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display4.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display5.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(true);
                        check3.setVisible(true);
                        check4.setVisible(true);
                        check5.setVisible(true);
                        check6.setVisible(false);
                        break;
                    }
                    case 6:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display2.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display3.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display4.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display5.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        data=iterator.next();
                        display6.setText("姓名："+data.getName()+'\t'+"身份证号："+data.getID());
                        check1.setVisible(true);
                        check2.setVisible(true);
                        check3.setVisible(true);
                        check4.setVisible(true);
                        check5.setVisible(true);
                        check6.setVisible(true);
                        break;
                    }
                }
            }
        }else if(name.getText().isEmpty()==false&&Id.getText().isEmpty()==false){
            personInformation.setName(name.getText());
            personInformation.setID(Id.getText());
            MyData myData=new MyData(name.getText(),Id.getText());
            myData=dataIO.readInformationByIDAndName(personInformation.getID(),personInformation.getName(),fileName);
            if(myData==null){
                warn.setText("无法找到该用户");
            }else{
                list.setVisible(true);
                loginIn.setVisible(false);
                display1.setText("姓名：" + myData.getName() + '\t' + "身份证号：" + myData.getID());
            }
        }
    }

    public void setClear(){
        name.setText("");
        Id.setText("");
        stageController.setStage(Main.personInformationViewID,Main.personInformationViewID);
        warn.setText("请输入ID或姓名");
    }



    /*
    信息显示界面
     */
    //个人信息显界面
    @FXML
    private AnchorPane information;
    @FXML
    private Label getInformation;
    @FXML
    private Button backToIndex2;
    public void setBackToIndex2() throws IOException, ClassNotFoundException {
        stageController.setStage(Main.indexViewID,Main.personInformationViewID);
    }
    public void showPersonInformation(){
        information.setVisible(true);
        loginIn.setVisible(false);
        list.setVisible(false);
        modifyPane.setVisible(false);
        comfirmToQuit.setVisible(false);
        getInformation.setText("名字："+personInformation.getName()+'\n'+
                "身份证号："+personInformation.getID()+'\n'+
                "电话号码："+personInformation.getPhone()+'\n'+
                "家庭住址："+personInformation.getLocation()+'\n'+
                "备注："+ personInformation.getRemark()+'\n'+
                "医保卡号："+personInformation.getCardNumber()+'\n'+
                "出生日期："+personInformation.getBirthDate());
        IndexSceneController.personInformation=personInformation;
    }



   /*
   x修改数据
    */
    /*
    修改数据界面
     */
    @FXML
    private AnchorPane modifyPane;
    @FXML
    private Button submit;
    @FXML
    private Label sex;
    @FXML
    private Label birthDay;
    @FXML
    private TextField personName;
    @FXML
    private TextField personID;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField personLocation;;
    @FXML
    private TextField personRemark;
    @FXML
    private TextField personCarsNumber;
    public void modifyInformation(){

        information.setVisible(false);
        loginIn.setVisible(false);
        list.setVisible(false);
        comfirmToQuit.setVisible(false);
        modifyPane.setVisible(true);
        personName.setText(personInformation.getName());
        personID.setText(personInformation.getID());
        sex.setText(personInformation.getSex());
        phoneNumber.setText(personInformation.getPhone());
        personLocation.setText(personInformation.getLocation());
        birthDay.setText(personInformation.getBirthDate());
        personCarsNumber.setText(personInformation.getCardNumber());
        personRemark.setText(personInformation.getRemark());

    }

    public void comfireToModify() throws IOException, ClassNotFoundException {
        PersonInformation myPersonInformation=new PersonInformation(personName.getText(),personID.getText(),sex.getText(),phoneNumber.getText(),
                birthDay.getText(),personLocation.getText(),personRemark.getText(),personCarsNumber.getText());
        dataIO.modify(personInformation,myPersonInformation,fileName);
        personInformation=myPersonInformation;
        stageController.setStage(Main.indexViewID,Main.personInformationViewID);
    }


    /*
    选择信息界面
     */
    public void goBackToQuery2(){
        loginIn.setVisible(true);
        list.setVisible(false);
        name.setText("");
        Id.setText("");
        arr=null;

    }
    public void choose1(){
        personInformation=(PersonInformation) arr.iterator().next();
        information.setVisible(true);
        list.setVisible(false);
        showPersonInformation();
    }
    public void choose2(){
        Iterator<MyData>iterator=arr.iterator();
        iterator.next();
        personInformation=(PersonInformation) iterator.next();
        showPersonInformation();
        list.setVisible(false);
    }

    public void choose3(){
        Iterator<MyData>iterator=arr.iterator();
        iterator.next();
        iterator.next();
        personInformation=(PersonInformation) iterator.next();
        showPersonInformation();
        list.setVisible(false);

    }
    public void choose4(){
        Iterator<MyData>iterator=arr.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
        personInformation=(PersonInformation) iterator.next();
        showPersonInformation();
        list.setVisible(false);
    }
    public void choose5(){
        Iterator<MyData>iterator=arr.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        personInformation=(PersonInformation) iterator.next();

        showPersonInformation();
        list.setVisible(false);
    }
    public void choose6(){
        Iterator<MyData>iterator=arr.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        personInformation=(PersonInformation) iterator.next();

        showPersonInformation();
        list.setVisible(false);

    }



    public void oneClick(){
        if(Id.getText().isEmpty()==false&&Id.getText().length()==18){
            String yearString= String.valueOf(Id.getText().subSequence(6,10));
            String monthString= String.valueOf(Id.getText().subSequence(10,12));
            String dayString= String.valueOf(Id.getText().subSequence(12,14));
            String sexString;
            if(Integer.valueOf(String.valueOf(Id.getText().charAt(16)))%2==0){
                sexString="女";
            }else{
                sexString="男";
            }
            birthDay.setText(yearString+"年"+'\t'+monthString+"月"+'\t'+dayString+"日");
            sex.setText(sexString);
        }

    }

    /*
    确认退保界面
     */
    @FXML
    private AnchorPane comfirmToQuit;
    @FXML
    private Button sure;
    public void sureToQuit() throws IOException, ClassNotFoundException {
        dataIO.deleteByIDAndName(personInformation.getID(),personInformation.getName(),fileName);
        name.setText("");
        Id.setText("");
        IndexSceneController.personInformation=new PersonInformation("","");
        stageController.setStage(Main.indexViewID,Main.personInformationViewID);
    }


    @FXML
    private MenuItem addPersonInformation1;
    @FXML
    private MenuItem addCompanyInformation;
    @FXML
    private MenuItem deletePersonInformation1;
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
    private MenuItem quit1;


    public void setAddPersonInformation() {
        if(personInformation==null){
            stageController.setStage(Main.addPersonalInformationViewID,Main.personInformationViewID);
        }else{
            addPersonInformation1.setDisable(true);
        }
    }

    public void setAddCompanyInformation() {

    }

    public void setDeletePersonInformation() throws IOException, ClassNotFoundException {
        information.setVisible(false);
        loginIn.setVisible(false);
        list.setVisible(false);
        modifyPane.setVisible(false);
        comfirmToQuit.setVisible(true);
    }

    public void setDeleteCompanyInformation() throws IOException, ClassNotFoundException {

    }

    public void setCheckPersonInformation() throws IOException, ClassNotFoundException {
        showPersonInformation();
    }

    public void setCheckCompanyInformation() throws IOException, ClassNotFoundException {

    }

    public void setModifyPersonInformation() throws IOException, ClassNotFoundException {
        modifyInformation();
    }

    public void setModifyCompanyInformation() throws IOException, ClassNotFoundException {

    }
    public void setLoginInAsPerson(){

    }
    public void setLoginInAsCompany(){

    }
    public void setQuit(){
        getInformation.setText("");
        personName.setText("");
        personID.setText("");
        personLocation.setText("");
        phoneNumber.setText("");
        personRemark.setText("");
        personCarsNumber.setText("");
        IndexSceneController.personInformation=new PersonInformation("","");
        stageController.setStage(Main.indexViewID,Main.personInformationViewID);
    }

    @FXML
    private MenuItem backToIndex5;
    public void setBackToIndex5() throws IOException, ClassNotFoundException {
        getInformation.setText("");
        personName.setText("");
        personID.setText("");
        personLocation.setText("");
        phoneNumber.setText("");
        personRemark.setText("");
        personCarsNumber.setText("");
        stageController.setStage(Main.indexViewID,Main.personInformationViewID);
    }

    @FXML
    private MenuItem load;
    public int setLoad() throws IOException, ClassNotFoundException {
        String state=IndexSceneController.state;
        IndexSceneController.state="";
        if(state.equals("checkPerson")){
            showPersonInformation();
            return 1;
        }else if(state.equals("deletePerson")){
            information.setVisible(false);
            loginIn.setVisible(false);
            list.setVisible(false);
            modifyPane.setVisible(false);
            comfirmToQuit.setVisible(true);
            return 2;
        }else if(state.equals("modifyPerson")){
            modifyInformation();
            return 3;
        }else if(state.equals("loginInAsPerson")){
            loginIn.setVisible(true);
            information.setVisible(false);
            list.setVisible(false);
            modifyPane.setVisible(false);
            comfirmToQuit.setVisible(false);
            return 4;
        }
        return 0;
    }

    @Override
    public void load() throws IOException, ClassNotFoundException {
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
            stageController.setStage(Main.checkInformationID,Main.personInformationViewID);
        }
    }
    public void setInputMedicalInformation(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.
                personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputHospitalizationID,Main.personInformationViewID);
        }
    }
    public void setInputRecipeInformation(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputRecipeInformationID,Main.personInformationViewID);
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
