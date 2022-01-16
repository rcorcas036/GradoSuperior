package Ejecutable;

import Imprimir.Imprimir;

import Vista.Menu;

import modelo.*;
import Controla.Controla;
public class ejecutable {

	public static void main(String[] args) {
		//Menu de personajes
		Menu.showMenuPrincipal();
		
		
		Mago p1=new Mago("Rogue",6,4,10,3);
		Imprimir.P("\n"+p1);
		Imprimir.P("------------------------");
		
		Guerrero p2=new Guerrero("Bodyguard",4,6,10,3);
		Imprimir.P("\n"+p2);
		Imprimir.P("------------------------");
		
		Guerrero p3=new Guerrero("Tank",3,8,10,3);
		Imprimir.P("\n"+p3);
		Imprimir.P("------------------------");
		
		Mago p4=new Mago("Glass Canon",6,3,10,3);
		Imprimir.P("\n"+p4);
		Imprimir.P("------------------------");
		
		
		//array de personajes
		
		String[] personaje = new String[4];
		personaje[0] = ("Rogue");
		personaje[1] = ("Bodyguard");
		personaje[2] = ("Tank");
		personaje[3] = ("Glass Canon");
		
		Imprimir.p("Eliga un personaje \n");
		for (int i = 0; i < personaje.length; i++) {
		Imprimir.P("\n"+personaje[i]);
		};
		
		
		
		//incrementar stats
		
		p1.setSalud(600);
		Imprimir.P("\n"+p1);
		
		
		p1.increaseSalud(Introducir.getDouble("Aumento de salud: "));
        Imprimir.P("\n"+p1);

       
        
        
	}

}
