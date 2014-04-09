package Agendititita;
public class TestAgendititita {
public static void main(String args[]) throws Exception{
    Contactos c11= new Contactos("Ruben1", "Veloz", "Farallon 4", "58540376", 
            "ruben_Veloz89@hotmail.com", 1);
    GuardarContacto.guardar(c11);
    System.out.println(LeerContacto.leer());
}    
}
