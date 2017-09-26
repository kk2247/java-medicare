package sample;

import fileIO.DataIO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

public class AddCompanyInformationController implements ControlledStage,Initializable,Serializable {
    private static final long serialVersionUID = 7981560250804078637l;
    private StageController stageController;
    private DataIO dataIO=new DataIO();
    private String fileName="companyInformation.dat";
    private ObservableList<String> companyType = FXCollections.observableArrayList("机关","灵活就业管理单位","企业","事业");
    private CompanyInformation companyInformation;
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
    private ComboBox type;
    @FXML
    private TextField postCode;
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
        type.setItems(companyType);
    }
    public void submitTo() throws IOException, ClassNotFoundException {
        if(name.getText().isEmpty()||ID.getText().isEmpty()||location.getText().isEmpty()||postCode.getText().isEmpty()||phoneNumber.getText().isEmpty()||(String)type.getValue()==null ){
            warn.setText("内容不可为空");
        }else{
            CompanyInformation companyInformation=new CompanyInformation(name.getText(),ID.getText(),(String)type.getValue(),location.getText(),postCode.getText(),phoneNumber.getText());
            if(dataIO.store(companyInformation,fileName)==true){
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
    public void goBackToIndex(){
        fillInformation.setVisible(true);
        succeed.setVisible(false);
        name.setText("");
        ID.setText("");
        phoneNumber.setText("");
        location.setText("");
        postCode.setText("");
        warn.setText("");
        stageController.setStage(Main.indexViewID,Main.addCompanyInformationViewID);
    }

    public void goBack(){
        fillInformation.setVisible(true);
        succeed.setVisible(false);
        name.setText("");
        ID.setText("");
        phoneNumber.setText("");
        location.setText("");
        postCode.setText("");
        warn.setText("");

        stageController.setStage(Main.indexViewID,Main.addCompanyInformationViewID);
    }



}
