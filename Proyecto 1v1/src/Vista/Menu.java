package Vista;


import Imprimir.Imprimir;
import Ejecutable.Introducir;

public class Menu {

//Menu Principal
  public static void showMenuPrincipal() {
    Imprimir.P("");
    Imprimir.P("");
    Imprimir.P(" **-------------- Selección de Personaje ----------------** ");
 
  }


  public static int getMenuPrincipal() {
    
    boolean valid = false;
    int op_menu = -1;
    
    do{ 
      
      valid = false;                
      op_menu = Introducir.getInt("INSERTA AQUI SU ELECCION ----> ");      
      
      if(op_menu < 1 || op_menu > 4) {        
        
        Imprimir.P("Debe insertar un valor valido...");          
        valid = true;
        
      }          
    }while(valid);
    
    return op_menu;
  }

  
 
//Menu final

  public static void showEnd(){
    
      Imprimir.P("Gracias por usar mi programa. Hasta la proxima!");

    }
  
//Menu Error
  public static void showError(){

    Imprimir.P("UPS!! SE HA PRODUCIDO UN ERROR!");

  }

 
}