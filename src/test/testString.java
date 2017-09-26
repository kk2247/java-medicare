package test;

import fileIO.FuzzySeach;
import fileIO.MyData;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import static jxl.Workbook.*;

public class testString {

    public static void main(String[] args) throws IOException, BiffException {
        MyData oldData=new MyData("123456","qqqwweeasdads");
        MyData oldData1=new MyData("123457","qqrwweeasdadasd");
        MyData oldData2=new MyData("123458","qqqwwee555");
        ArrayList<MyData>mydatas=new ArrayList<MyData>();
        mydatas.add(oldData);
        mydatas.add(oldData1);
        mydatas.add(oldData2);
        FuzzySeach fuzzySeach=new FuzzySeach();
        ArrayList<MyData>arr=fuzzySeach.search("qq",mydatas);
        Iterator<MyData> iterator=arr.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getID());
        }

    }
}
