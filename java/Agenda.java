import java.util.InputMismatchException;
import java.util.Scanner;

public class Agenda {
	public static void main(String[] args) {
		
		System.out.print("Introduzca su nombre:");
		String nombre=leeFrase();
		int edad;
		
		try {
			edad = pideEdad();
			System.out.println("Eres "+nombre+" y tienes "+edad+" años");
		} catch (Exception e) {
			System.out.println("Error en la edad:"+e);

		}
		
	}
	public static String leeFrase() {
		String resultado="";
		Scanner teclado=new Scanner(System.in);
		resultado=teclado.nextLine();
		return resultado;
	}
	/**
	 * Lee un número por teclado
	 * 
	 * @return el entero introducido por teclado
	 */
	public static int leeEntero() {
		int resultado = -1;
		boolean valid = false;
		Scanner teclado = new Scanner(System.in);
		do {
			try {
				resultado = teclado.nextInt();
				valid = true;
			} catch (InputMismatchException ex) {
				System.out.println("Entrada no válido");
				teclado.next();
			}
		} while (valid == false); // !valid
		return resultado;
	}
	
	
	public static int pideEdad() throws Exception{
		int edad=-1;
		System.out.print("Inserte su edad: ");
		edad=leeEntero();
		if(edad<=0) {
			throw new Exception("no has nacido");
		}
		if(edad > 120) {
			throw new Exception("no te lo crees ni tú");
		}
		return edad;
	}
	


}
