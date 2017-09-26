package fileIO;

import java.io.Serializable;

public class MyData implements Serializable {
    private static final long serialVersionUID = 7981560250804078637l;
    private String name;
    private String ID;

        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
