
package Agendititita;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LeerContacto {
   public static synchronized ArrayList<Contactos> leer() throws Exception{
        File file= new File("noleer.xxx");
        FileInputStream fis= new FileInputStream(file);
        ObjectInputStream ois= new ObjectInputStream(fis);
        ArrayList<Contactos> c= (ArrayList<Contactos>)ois.readObject();
        return c;
    }  
}
