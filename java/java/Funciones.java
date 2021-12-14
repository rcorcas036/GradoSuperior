import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {
	// 1 tipo de acceso -> public, private, protected, default
	// 2 static (opcional)
	// 3 ¿Cuál es la salida del método? ¿Qué devuelve?
	// int, float, boolean, char, String... void
	// 4 El nombre (identificador) de la función
	// 5 () son los parámetros que recibe la función
	public static void main(String[] args) {
		int edad = leeEntero("Dime tu edad");
		int hijos = leeEntero("Número de hijos");
		System.out.println("Tienes " + edad + " años y " + hijos + " hijos");
	}

	public static int leeEntero(String frase) {
		int resultado=0;
		boolean valid=false;
		Scanner teclado=new Scanner(System.in);
		
		do {
			System.out.print(frase+": ");
			try {
				resultado= teclado.nextInt();
				valid=true;
			}catch (InputMismatchException e) {
				System.out.println("Entero erróneo");
				teclado.next();
			}
		}while(!valid);
		
		return resultado;
	}

	public static int incrementa(int n) {
		n++;
		return n;
	}

	public static void suma(int n1, int n2) {
		int resultado = n1 + n2;
		System.out.println("La suma es " + resultado);
	}

	public static void saluda() {
		System.out.println("¡Hola Mundo!");
	}
}
