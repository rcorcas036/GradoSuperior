package test;

import java.util.Scanner;

public class t1 {
	//tipo de acceso-> public,private,protected,default
	//static(opcional)
	//Salida del metodo?. Que devuelve?
	//	int, float, boolean, char, string..........
	//Nombre (identificador) de la funcion
	//() parametros que recibe la funcion

	public static void main(String[] args) {
		System.out.println("q");
		int contador=0;		
		contador++;		
		sa();
		sum(2,65);
		
		System.out.println(contador);
		contador=incrementa(contador);
		System.out.println(contador);
		
	}
	public static void sum(int n1,int n2){
		int sum=(n1+n2);
		System.out.println("la suma es "+sum);
	}	
		public static void sa() {
			System.out.println("h");
		}
		
		public static int incrementa(int n) {
			n++;
			System.out.println(n);
			return n;
		}
		
		public static int entero(String f) {
			int resul=0;
			Scanner teclado=new Scanner(System.in);
			System.out.println(f+": ");
			do{
				try {
									}
			}
			resul=teclado.nextInt();
			teclado.close();
			return resul;
		}
		
}
