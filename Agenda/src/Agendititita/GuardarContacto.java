package Agendititita;
import java.io.*;
import java.util.*;

public class GuardarContacto {
    
    public static synchronized void guardar(Contactos c) throws Exception{
       ArrayList<Contactos> c1 = new ArrayList<Contactos>();
        
        File file= new File("noleer.xxx");
        if(file.exists()) {
         c1= LeerContacto.leer();
         c1.add(c);
        }
        FileOutputStream fos= new FileOutputStream(file);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(c1);
    }  
      
}