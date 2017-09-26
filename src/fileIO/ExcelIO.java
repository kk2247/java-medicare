package fileIO;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.*;
import java.util.ArrayList;

import static jxl.Workbook.getWorkbook;

public class ExcelIO {


    public ExcelIO() throws IOException, BiffException {
    }
    public ArrayList<MyData> readInformation(int sheetNumber,int begin,int end,String excelName) throws IOException, BiffException {
        File file = new File(excelName);
        InputStream inputStream = new FileInputStream(file);
        Workbook workbook = getWorkbook(inputStream);
        ArrayList<MyData> myDatas=new ArrayList<MyData>();
        Sheet sheet = workbook.getSheet(sheetNumber);
        for(int i=begin;i<end;i++){
            MyData myData=new MyData(sheet.getCell(2,i).getContents(),sheet.getCell(1,i).getContents());
            myDatas.add(myData);
        }
        return myDatas;
    }
}
