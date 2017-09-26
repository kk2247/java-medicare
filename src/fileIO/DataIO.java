package fileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class DataIO implements Serializable{
    private static final long serialVersionUID = 7981560250804078637l;
    private ArrayList<MyData> myDatas=new ArrayList<MyData>();
    public boolean store(MyData data, String fileName) throws IOException, ClassNotFoundException {
        ObjectOutputStream output = null;
        File file=new File(fileName);
        if(file.length()<1){
            output=new ObjectOutputStream(new FileOutputStream(file));
            myDatas.add(data);
            output.writeObject(myDatas);
            output.close();
            return true;
        }else {
            if(readInformationByIDAndName(data.getID(),data.getName(),fileName)==null){
                myDatas=getAll(fileName);
                myDatas.add(data);
                output=new ObjectOutputStream(new FileOutputStream(file));
                output.writeObject(myDatas);
                output.close();
                return true;
            }else{
                System.out.println("已经存在");
                output.close();
                return false;
            }
        }
    }
    public ArrayList<MyData> readInformationByName(String name, String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        MyData readData;
        ArrayList<MyData> datas=new ArrayList<MyData>();
        myDatas=(ArrayList<MyData>)input.readObject();
        Iterator<MyData> iter=myDatas.iterator();
        int i=0;
        while(iter.hasNext()==true){
            i=0;
            readData=iter.next();
            if(readData.getName().equals(name)==true){
                i++;
                datas.add(readData);
                System.out.println(i);
            }
        }
        input.close();
        if(i==0){
            return null;
        }
        System.out.println(i);
        return datas;
    }
    public boolean deleteByIDAndName(String ID,String name,String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        ArrayList<MyData> arrayList=new ArrayList<MyData>();
        MyData readData;
        myDatas=(ArrayList<MyData>) input.readObject();
        Iterator<MyData> iter=myDatas.iterator();
        for(int i=1;iter.hasNext();i++){
            readData=iter.next();
            System.out.println(i);
            if(readData.getID().equals(ID)&&readData.getName().equals(name)){
            }else{
                arrayList.add(readData);
            }
        }
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
        output.writeObject(arrayList);
        output.close();
        return true;
    }
    public void  modify(MyData oldData,MyData newData,String fileName) throws IOException, ClassNotFoundException {
        deleteByIDAndName(oldData.getID(),oldData.getName(),fileName);
        store(newData,fileName);
    }
    public MyData readAllData(String fileName) throws IOException, ClassNotFoundException {
        MyData myData;
        File file=new File(fileName);
        if(file.exists()){
            myData=getAll(fileName).iterator().next();
            FileWriter fw=new FileWriter(file);
            fw.write("");
            fw.close();
            return myData;
        }else{
            return null;
        }
    }
    public ArrayList<MyData> getAll(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        myDatas=(ArrayList<MyData>) input.readObject();
        input.close();
        return myDatas;
    }
    public ArrayList<MyData> readInformationByID(String ID, String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        MyData readData;
        ArrayList<MyData> datas=new ArrayList<MyData>();
        myDatas=(ArrayList<MyData>) input.readObject();
        Iterator<MyData> iter=myDatas.iterator();
        int i=0;
        while(iter.hasNext()){
            i=0;
            readData=iter.next();
            if(readData.getID().equals(ID)){
                i++;
                datas.add(readData);
            }
        }
        input.close();
        if(i==0){
            return null;
        }
        return datas;
    }
    public MyData readInformationByIDAndName(String ID, String name, String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        MyData readData;
        myDatas=(ArrayList<MyData>) input.readObject();
        Iterator<MyData> iter=myDatas.iterator();
        int i=0;
        while(iter.hasNext()){
            i=0;
            readData=iter.next();
            if(readData.getName().equals(name)&&readData.getID().equals(ID)){
                input.close();
                return readData;
            }
        }
        return null;
    }
}
