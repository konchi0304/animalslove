/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

import static proyectoaula.loginProyecto.Users;
import static proyectoaula.loginProyecto.vector;

/**
 *
 * @author aylee
 */
public class usuarios {
    String documento;
    String mascota;
     static String usuario1[] = new String[20];
public usuarios(){}

 public final static void usuario(){
    
     usuario1[0] = "12345";
     usuario1[1] = "27890";
     usuario1[2] = "654321";
     usuario1[3] = "78906";
        usuarios User = new usuarios();
            User.documento = "12345";
            User.mascota = "Zeus";
            Users[0] = User;
            
            User = new usuarios();
            User.documento = "27890";
            User.mascota = "Luna";
            Users[1] = User;
            
            User = new usuarios();
            User.documento = "65432";
            User.mascota = "Manchas";
            Users[2] = User;
            
            User = new usuarios();
            User.documento = "78906";
            User.mascota = "Luki";
            Users[3] = User;
            
            User = new usuarios();
            User.documento = "34567";
            User.mascota = "Pedro";
            Users[4] = User;

}
 
  public final static int Consultar(String documento1) {
        for (int i = 0; i < usuario1.length; i++) {
            if (usuario1[i] != null && usuario1[i].equals(documento1)) {
                return i;
            }
        }
        return -1;
    }
}

   

