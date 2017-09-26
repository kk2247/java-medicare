package information;

import com.sun.org.apache.regexp.internal.RE;
import fileIO.DataIO;
import fileIO.MyData;

import java.util.ArrayList;

public class PatientInformation extends MyData{
    private String sex;
    private String birthDay;
    private int times;
    private String lastTime;
    private float ReimbursementCost;
    private float cost;
    private float sum;
    public PatientInformation(String name, String ID) {
        super(name, ID);
    }

    public PatientInformation(String name, String ID, String sex, String birthDay, int times, String lastTime, float reimbursementCost, float cost, float sum) {
        super(name, ID);
        this.sex = sex;
        this.birthDay = birthDay;
        this.times = times;
        this.lastTime = lastTime;
        ReimbursementCost = reimbursementCost;
        this.cost = cost;
        this.sum = sum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public float getReimbursementCost() {
        return ReimbursementCost;
    }

    public void setReimbursementCost(float reimbursementCost) {
        ReimbursementCost = reimbursementCost;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getSum() {
        return sum;
    }


    public void setSum(float sum) {
        this.sum = sum;
    }
}
