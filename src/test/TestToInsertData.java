package test;

import fileIO.DataIO;
import fileIO.MyData;
import sample.PersonInformation;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/*
   private DataIO dataIO=new DataIO();
    private String sex;
    private String phone;
    private Date birthDate;
    private String location;
    private String remark;
    private String cardNumber;

 */
public class TestToInsertData implements Serializable {
    private static final long serialVersionUID = 7981560250804078637l;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PersonInformation personInformation=new PersonInformation("kkoo","123454321","man","11111111111111111","2016","sddsdsdsdsds","rn","123211");
        //PersonInformation newpersonInformation=new PersonInformation("kkoo","123454321","woman","11111111111111111","2016","sddsdsdsdsds","rn","123211");
        DataIO dataIO=new DataIO();
        //dataIO.store(personInformation,"buffer.dat");
        MyData myData=dataIO.readAllData("buffer.dat");
        if(myData==null){
            System.out.println("1");
        }
        //dataIO.deleteByIDAndName("123454321","kkoo","personInformation.dat");
        //dataIO.modify(personInformation,newpersonInformation,"personInformation.dat");
        //System.out.println(dataIO.readInformationByName("kkkk","personInformation.dat").size());
        //ArrayList<MyData> myDatas2=dataIO.getAll("personInformation.dat");
        //Iterator<MyData> iter=myDatas2.iterator();
        //(iter.hasNext()){
        //    PersonInformation information=(PersonInformation)iter.next();
       //     System.out.println(information.getName());
       //     System.out.println(information.getID());
       // }
    }
}
