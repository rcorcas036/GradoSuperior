import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {
	// 1 tipo de acceso -> public, private, protected, default
	// 2 static (opcional)
	// 3 �Cu�l es la salida del m�todo? �Qu� devuelve?
	// int, float, boolean, char, String... void
	// 4 El nombre (identificador) de la funci�n
	// 5 () son los par�metros que recibe la funci�n
	public static void main(String[] args) {
		int edad = leeEntero("Dime tu edad");
		int hijos = leeEntero("N�mero de hijos");
		System.out.println("Tienes " + edad + " a�os y " + hijos + " hijos");
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
				System.out.println("Entero err�neo");
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
		System.out.println("�Hola Mundo!");
	}
}
