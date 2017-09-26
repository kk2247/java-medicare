package sample;

import fileIO.DataIO;
import fileIO.MyData;

import java.io.Serializable;
import java.util.Date;

public class PersonInformation extends MyData implements Serializable {
    private static final long serialVersionUID = 7981560250804078637l;
    private String sex;
    private String phone;
    private String birthDate;
    private String location;
    private String remark;
    private String cardNumber;

    public PersonInformation(String name, String ID) {
        super(name, ID);
    }

    public PersonInformation(String name, String ID, String sex, String phone, String birthDate, String location, String remark, String cardNumber) {
        super(name, ID);
        this.sex = sex;
        this.phone = phone;
        this.birthDate = birthDate;
        this.location = location;
        this.remark = remark;
        this.cardNumber = cardNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
