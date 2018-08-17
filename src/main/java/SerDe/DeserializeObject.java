package SerDe;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeObject {
    Demo d2 = null;
    public void Deserialize() {
        try {
            FileInputStream fi = new FileInputStream("file.ser");
            ObjectInputStream oi = new ObjectInputStream(fi);
            d2 = (Demo) oi.readObject();
            d2.test();
        }catch(Exception e )
        {
            e.printStackTrace();
        }
    }
}
