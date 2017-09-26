package fileIO;

import java.util.ArrayList;
import java.util.Iterator;

public class FuzzySeach {
    public ArrayList<MyData> search(String content, ArrayList<MyData> myDatas){
        Iterator<MyData>iterator=myDatas.iterator();
        ArrayList<MyData>getDatas=new ArrayList<MyData>();
        while(iterator.hasNext()){
            MyData myData=iterator.next();
            if(content.equals(myData.getID().subSequence(0,content.length()))){
                getDatas.add(myData);
            }
        }
        return getDatas;
    }
}
