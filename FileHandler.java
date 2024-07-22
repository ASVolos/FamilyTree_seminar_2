package FamilyTree.Writer;

import FamilyTree.FamilyTree.FamilyTree;
import FamilyTree.Human.Human;

import java.io.*;
import java.util.List;

public class FileHandler implements Writer {

    @Override
    public void serializeFamily(Serializable serializable) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("family_members.ser"))) {
            out.writeObject(serializable);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Object deserializeFamily() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("family_members.ser"))) {
            Object object = in.readObject();
            return object;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void setPath(String path) {

    }
}