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

public class CompanyInformationSceneController implements ControlledStage,Initializable,Serializable {
    private static final long serialVersionUID = 7981560250804078637l;
    private String fileName="companyInformation.dat";
    private ArrayList<MyData> arr=null;
    private StageController stageController;
    private DataIO dataIO=new DataIO();
    private CompanyInformation companyInformation=new CompanyInformation("" ,"");
    private ObservableList<String> companyType = FXCollections.observableArrayList("机关","灵活就业管理单位","企业","事业");
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
    /*

     */


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setStageController(StageController stageController) throws IOException, ClassNotFoundException {
        this.stageController=stageController;
        companyTye.setItems(companyType);
        list.setVisible(false);
        loginIn.setVisible(true);
        information.setVisible(false);
        modifyPane.setVisible(false);
        comfirmToQuit.setVisible(false);
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
        companyInformation.setName(null);
        companyInformation.setID(null);
        if(name.getText().isEmpty()==true&&Id.getText().isEmpty()==true){
            warn.setText("姓名与身份证号不可同时为空");
        }else if(name.getText().isEmpty()==true&&Id.getText().isEmpty()==false){
            companyInformation.setID(Id.getText());
            arr=dataIO.readInformationByID(companyInformation.getID(),fileName);
            if(arr==null){
                warn.setText("无法找到该用户");
            }else{
                loginIn.setVisible(false);
                list.setVisible(true);
                switch (arr.size()){
                    case 1:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display2.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display2.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display3.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display2.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display3.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display4.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display2.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display3.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display4.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display5.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display2.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display3.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display4.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display5.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display6.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
            companyInformation.setName(name.getText());
            arr=dataIO.readInformationByName(companyInformation.getName(),fileName);
            if(arr==null){
                warn.setText("无法找到该用户");
            }else{
                loginIn.setVisible(false);
                list.setVisible(true);
                switch (arr.size()) {
                    case 1:{
                        Iterator<MyData> iterator=arr.iterator();
                        MyData data=iterator.next();
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display2.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display2.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display3.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display2.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display3.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display4.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display2.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display3.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display4.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display5.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
                        display1.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display2.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display3.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display4.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display5.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
                        data=iterator.next();
                        display6.setText("单位名称："+data.getName()+'\t'+"单位编码："+data.getID());
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
            companyInformation.setName(name.getText());
            companyInformation.setID(Id.getText());
            MyData myData=new MyData(name.getText(),Id.getText());
            myData=dataIO.readInformationByIDAndName(companyInformation.getID(),companyInformation.getName(),fileName);
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
        stageController.setStage(Main.companyInformationViewID,Main.companyInformationViewID);
        warn.setText("请输入单位编号或单位名字");
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
        stageController.setStage(Main.indexViewID,Main.companyInformationViewID);
    }
    public void showcompanyInformation(){
        information.setVisible(true);
        getInformation.setText("单位名称："+companyInformation.getName()+'\n'+
                "单位编号："+companyInformation.getID()+'\n'+
                "电话号码："+companyInformation.getTelephone()+'\n'+
                "单位地址："+companyInformation.getCompanyLocation()+'\n'+
                "单位类型："+ companyInformation.getCompanyType()+'\n'+
                "邮政编号："+companyInformation.getPostode());
        IndexSceneController.companyInformation=companyInformation;
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
    private TextField companyName;
    @FXML
    private TextField companyID;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField companyLocation;
    @FXML
    private TextField companyPostcode;
    @FXML
    private ComboBox companyTye;
    public void modifyInformation(){

        information.setVisible(false);
        loginIn.setVisible(false);
        list.setVisible(false);
        comfirmToQuit.setVisible(false);
        modifyPane.setVisible(true);
        companyName.setText(companyInformation.getName());
        companyID.setText(companyInformation.getID());
        phoneNumber.setText(companyInformation.getTelephone());
        companyLocation.setText(companyInformation.getCompanyLocation());
        companyPostcode.setText(companyInformation.getPostode());
        companyTye.setValue(companyInformation.getCompanyType());

    }

    public void comfireToModify() throws IOException, ClassNotFoundException {
        CompanyInformation myCompanyInformation=new CompanyInformation(companyName.getText(),companyID.getText(),(String)companyTye.getValue(),companyLocation.getText(),
                companyPostcode.getText(),phoneNumber.getText());
        dataIO.modify(companyInformation,myCompanyInformation,fileName);
        companyInformation=myCompanyInformation;
        IndexSceneController.companyInformation=myCompanyInformation;
        stageController.setStage(Main.indexViewID,Main.companyInformationViewID);
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
        companyInformation=(CompanyInformation) arr.iterator().next();
        information.setVisible(true);
        list.setVisible(false);
        showcompanyInformation();
    }
    public void choose2(){
        Iterator<MyData>iterator=arr.iterator();
        iterator.next();
        companyInformation=(CompanyInformation) iterator.next();
        showcompanyInformation();
        list.setVisible(false);
    }

    public void choose3(){
        Iterator<MyData>iterator=arr.iterator();
        iterator.next();
        iterator.next();
        companyInformation=(CompanyInformation) iterator.next();
        showcompanyInformation();
        list.setVisible(false);

    }
    public void choose4(){
        Iterator<MyData>iterator=arr.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
        companyInformation=(CompanyInformation) iterator.next();
        showcompanyInformation();
        list.setVisible(false);
    }
    public void choose5(){
        Iterator<MyData>iterator=arr.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        companyInformation=(CompanyInformation) iterator.next();
        showcompanyInformation();
        list.setVisible(false);
    }
    public void choose6(){
        Iterator<MyData>iterator=arr.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        companyInformation=(CompanyInformation) iterator.next();
        showcompanyInformation();
        list.setVisible(false);

    }




    /*
    确认退保界面
     */
    @FXML
    private AnchorPane comfirmToQuit;
    @FXML
    private Button sure;
    @FXML
    private Button backToIndex3;
    public void sureToQuit() throws IOException, ClassNotFoundException {
        dataIO.deleteByIDAndName(companyInformation.getID(),companyInformation.getName(),fileName);
        name.setText("");
        Id.setText("");
        IndexSceneController.companyInformation=new CompanyInformation("","");
        stageController.setStage(Main.indexViewID,Main.companyInformationViewID);
    }
    public void setBackToIndex3(){
        stageController.setStage(Main.indexViewID,Main.companyInformationViewID);
    }


    @FXML
    private MenuItem addPersonInformation1;
    @FXML
    private MenuItem addCompanyInformation1;
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

    }

    public void setAddCompanyInformation() {
        if(IndexSceneController.companyInformation.getID()=="" && IndexSceneController.companyInformation.getName()==""&&IndexSceneController.personInformation.getID()==""&&IndexSceneController.personInformation.getName()==""){
            stageController.setStage(Main.addCompanyInformationViewID,Main.companyInformationViewID);
        }else{
        }
    }

    public void setDeletePersonInformation() throws IOException, ClassNotFoundException {

    }

    public void setDeleteCompanyInformation() throws IOException, ClassNotFoundException {
        information.setVisible(false);
        loginIn.setVisible(false);
        list.setVisible(false);
        modifyPane.setVisible(false);
        comfirmToQuit.setVisible(true);
    }

    public void setCheckPersonInformation() throws IOException, ClassNotFoundException {

    }

    public void setCheckCompanyInformation() throws IOException, ClassNotFoundException {

        showcompanyInformation();
    }

    public void setModifyPersonInformation() throws IOException, ClassNotFoundException {

    }

    public void setModifyCompanyInformation() throws IOException, ClassNotFoundException {

        modifyInformation();
    }
    public void setLoginInAsPerson(){

    }
    public void setLoginInAsCompany(){

    }
    public void setQuit(){
        getInformation.setText("");
        companyName.setText("");
        companyID.setText("");
        companyLocation.setText("");
        phoneNumber.setText("");
        companyPostcode.setText("");
        IndexSceneController.companyInformation=new CompanyInformation("","");
        stageController.setStage(Main.indexViewID,Main.companyInformationViewID);
    }

    @FXML
    private MenuItem backToIndex5;
    public void setBackToIndex5() throws IOException, ClassNotFoundException {
        getInformation.setText("");
        companyName.setText("");
        companyID.setText("");
        companyLocation.setText("");
        phoneNumber.setText("");
        companyPostcode.setText("");
        stageController.setStage(Main.indexViewID,Main.companyInformationViewID);
    }

    @FXML
    private MenuItem load;
    public int setLoad() throws IOException, ClassNotFoundException {
        String state=IndexSceneController.state;
        IndexSceneController.state="";
        if(state.equals("checkCompany")){
            list.setVisible(false);
            loginIn.setVisible(false);
            information.setVisible(true);
            modifyPane.setVisible(false);
            comfirmToQuit.setVisible(false);
            showcompanyInformation();
            return 1;
        }else if(state.equals("deleteCompany")){
            information.setVisible(false);
            loginIn.setVisible(false);
            list.setVisible(false);
            modifyPane.setVisible(false);
            comfirmToQuit.setVisible(true);
            return 2;
        }else if(state.equals("modifyCompany")){
            list.setVisible(false);
            loginIn.setVisible(false);
            information.setVisible(false);
            modifyPane.setVisible(true);
            comfirmToQuit.setVisible(false);
            modifyInformation();
            return 3;
        }else if(state.equals("loginInAsCompany")){
            loginIn.setVisible(true);
            information.setVisible(false);
            list.setVisible(false);
            modifyPane.setVisible(false);
            comfirmToQuit.setVisible(false);
            return 4;
        }
        return 0;
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
            stageController.setStage(Main.checkInformationID,Main.companyInformationViewID);
        }
    }
    public void setInputMedicalInformation(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.
                personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputHospitalizationID,Main.companyInformationViewID);
        }
    }
    public void setInputRecipeInformation(){
        if(IndexSceneController.personInformation.getName()==""&&IndexSceneController.personInformation.getID()==""){

        }else{
            stageController.setStage(Main.inputRecipeInformationID,Main.companyInformationViewID);
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
