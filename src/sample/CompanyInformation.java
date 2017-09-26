package sample;

import fileIO.MyData;

import java.io.Serializable;

public class CompanyInformation extends MyData implements Serializable {
    private static final long serialVersionUID = 7981560250804078637l;
    private String companyType;
    private String companyLocation;
    private String postode;
    private String telephone;

    public CompanyInformation(String name, String ID) {
        super(name, ID);
    }

    public CompanyInformation(String name, String ID, String companyType, String companyLocation, String postode, String telephone) {
        super(name, ID);
        this.companyType = companyType;
        this.companyLocation = companyLocation;
        this.postode = postode;
        this.telephone = telephone;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public String getPostode() {
        return postode;
    }

    public void setPostode(String postode) {
        this.postode = postode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
