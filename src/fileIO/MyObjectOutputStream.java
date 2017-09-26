package fileIO;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class MyObjectOutputStream extends ObjectOutputStream implements Serializable{
    private static final long serialVersionUID = 7981560250804078637l;

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        return;
    }

    protected MyObjectOutputStream() throws IOException, SecurityException {
    }
}
