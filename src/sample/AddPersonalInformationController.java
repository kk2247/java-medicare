package sample;

import fileIO.DataIO;
import fileIO.MyData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class AddPersonalInformationController implements ControlledStage,Initializable,Serializable {
    private static final long serialVersionUID = 7981560250804078637l;
    private StageController stageController;
    private DataIO dataIO=new DataIO();
    private String fileName="personInformation.dat";
    private PersonInformation personInformation;
    @FXML
    private AnchorPane fillInformation;
    @FXML
    private TextField name;
    @FXML
    private TextField ID;
    @FXML
    private TextField phoneNumber;
    @FXML
    private TextField location;
    @FXML
    private TextField remark;
    @FXML
    private Label birthDay;
    @FXML
    private Label sex;
    @FXML
    private Label warn;
    @FXML
    private Button submit;
    @FXML
    private Button backToQuery;

    @FXML
    private AnchorPane succeed;
    @FXML
    private Label label;
    @FXML
    private Button back;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public void setStageController(StageController stageController) throws IOException, ClassNotFoundException {
        this.stageController=stageController;
        fillInformation.setVisible(true);
        succeed.setVisible(false);
    }
    public void submitTo() throws IOException, ClassNotFoundException {
        if(name.getText().isEmpty()||ID.getText().isEmpty()||location.getText().isEmpty()){
            warn.setText("除备注外不可为空");
            if(ID.getText().length()!=18){
                warn.setText("身份证号格式不正确");
            }
        }else{
            oneClick();
            String cardNumber=ID.getText()+"4321321";
            PersonInformation personInformation=new PersonInformation(name.getText(),ID.getText(),sex.getText(),phoneNumber.getText(),birthDay.getText(),location.getText(),remark.getText(),cardNumber);
            if(dataIO.store(personInformation,fileName)==true){
                fillInformation.setVisible(false);
                succeed.setVisible(true);
                warn.setText("信息录入成功");
            }else{
                fillInformation.setVisible(false);
                succeed.setVisible(true);
                warn.setText("很遗憾，录入失败");
            }
        }
    }
    public void oneClick(){
        if(ID.getText().isEmpty()==false&&ID.getText().length()==18){
            String yearString= String.valueOf(ID.getText().subSequence(6,10));
            String monthString= String.valueOf(ID.getText().subSequence(10,12));
            String dayString= String.valueOf(ID.getText().subSequence(12,14));
            String sexString;
            if(Integer.valueOf(String.valueOf(ID.getText().charAt(16)))%2==0){
                sexString="女";
            }else{
                sexString="男";
            }
            birthDay.setText(yearString+"年"+'\t'+monthString+"月"+'\t'+dayString+"日");
            sex.setText(sexString);
        }
    }
    public void goBackToQuery(){
        fillInformation.setVisible(true);
        succeed.setVisible(false);
        name.setText("");
        ID.setText("");
        phoneNumber.setText("");
        location.setText("");
        remark.setText("");
        warn.setText("");
        stageController.setStage(Main.indexViewID,Main.addPersonalInformationViewID);
    }

    public void goBack(){
        fillInformation.setVisible(true);
        succeed.setVisible(false);
        name.setText("");
        ID.setText("");
        phoneNumber.setText("");
        location.setText("");
        remark.setText("");
        warn.setText("");
        stageController.setStage(Main.indexViewID,Main.addPersonalInformationViewID);
    }
}
