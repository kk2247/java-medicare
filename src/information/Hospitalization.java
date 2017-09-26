package information;

import fileIO.MyData;

import java.util.ArrayList;

public class Hospitalization extends MyData {
    /*
    医疗机构信息（编码和名称）、医疗类别、疾病信息（病种编码和病种名称）、入院日期、出院日期、出院原因、住院号
    一条病人就诊信息可以对应多个处方明细信息）：收费项目类别、项目名称、单价、数量、金额
     */
    private ArrayList<Recipe> recipes;
    public Hospitalization(String name, String ID) {
        super(name, ID);
    }

    public Hospitalization(String name, String ID, ArrayList<Recipe> recipes) {
        super(name, ID);
        this.recipes = recipes;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }
}
