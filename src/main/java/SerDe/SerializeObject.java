package SerDe;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeObject {
    Demo demo=new Demo();
    public void Serialize() {
        String filename = "file.ser";
        try {
            FileOutputStream fo = new FileOutputStream(filename);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(demo);
            oo.close();
            fo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
