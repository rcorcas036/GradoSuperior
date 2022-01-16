package Controla;

import Imprimir.Imprimir;

import Vista.Menu;

import modelo.*;
import Controla.Controla;
import Ejecutable.Introducir;
public class Controla {
	
	public Controla() {
		
	}
	//Switch principal	
		public static void switchPrincipal(int op){

		    switch (op) {
		      case 1:
		      
		        Imprimir.P("");
		        Imprimir.P("");
		        Menu.showMenuParametros();
		        

		        break;

		      case 2:

		        Imprimir.P("\n"+p1);
		       

		        break;

		      case 3:

		       
		        Imprimir.P("\n"+p1);
		        

		        break;

		      case 4:

		        break;
		   
		      default:

		        Menu.showError();

		        break;
		    
		  
		
		
		
	}

};
	}
