package information;

public class Recipe {
    /*
    收费项目类别、项目名称、单价、数量、金额
     */
    private String type;
    private String name;
    private float price;
    private int number;
    private float sum;

    public Recipe() {
    }

    public Recipe(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Recipe(String type, String name, float price, int number, float sum) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.number = number;
        this.sum = sum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }
}
