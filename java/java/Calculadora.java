import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que ejecuta un menú que emula una calculdora
 * 
 * @author Carlos Serrano
 *
 */
public class Calculadora {

	public static void main(String[] args) {
		int opcion = -1;
		do {
			imprimeMenu();
			opcion = leeEntero();
			int op1, op2, resultado;
			switch (opcion) {
			case 1: // sumar;
				System.out.print("Introduzca op1: ");
				op1 = leeEntero();
				System.out.println("Introduzca op2: ");
				op2 = leeEntero();
				resultado = suma(op1, op2);
				System.out.println("El resultado es " + resultado);
				break;
			case 2:
				System.out.print("Introduzca op1 ");
				op1 = leeEntero();
				System.out.println("Introduzca op2: ");
				op2 = leeEntero();
				resultado = resta(op1, op2);
				System.out.println("El resultado es " + resultado);
				break;
			case 3: // multiplicar;
				System.out.print("Introduzca op1 ");
				op1 = leeEntero();
				System.out.println("Introduzca op2: ");
				op2 = leeEntero();
				resultado = multiplica(op1, op2);
				System.out.println("El resultado es " + resultado);
				break;
			case 4: // dividor;
				System.out.print("Introduzca op1 ");
				op1 = leeEntero();
				System.out.println("Introduzca op2: ");
				op2 = leeEntero();
				try {
					resultado = divide(op1, op2);
					System.out.println("El resultado es " + resultado);
				} catch (ArithmeticException ex) {
					System.out.println("Error división por 0");
				}
				break;
			case 0:
				System.out.println("Gracias por usar la calculadora");
				break;
			default:
				System.out.println("Opción incorrecta");

			}
			// if(opcion!=0) pulse cualquier tecla para continuar
		} while (opcion != 0);
	}

	/**
	 * Imprime el menú principal
	 */
	public static void imprimeMenu() {
		System.out.println("Calculadora\n------------");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Producto");
		System.out.println("4. División");
		System.out.println("0. Salir del programa");
		System.out.print("Elija un opción: ");
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

	/**
	 * Suma dos enteros
	 * 
	 * @param s1 sumando 1
	 * @param s2 sumando 2
	 * @return el resultado de la suma
	 */
	public static int suma(int s1, int s2) {
		int resultado = -1;
		resultado = s1 + s2;
		return resultado; // return s1+s2;
	}

	/**
	 * Resta dos enteros
	 * 
	 * @param s1 primer operando
	 * @param s2 segundo operando
	 * @return resultado de la resta
	 */
	public static int resta(int s1, int s2) {
		int resultado = -1;
		resultado = s1 - s2;
		return resultado; // return s1-s2;
	}

	/**
	 * Multiplica dos enteros
	 * 
	 * @param s1 operando 1
	 * @param s2 operando 2
	 * @return resultado de la multiplicación
	 */
	public static int multiplica(int s1, int s2) {
		int resultado = -1;
		resultado = s1 * s2;
		return resultado; // return s1-s2;
	}

	public static int dividev0(int s1, int s2) {
		int resultado = -1;
		if (s2 != 0) {
			resultado = s1 / s2; // ojo si s2 es 0 lanza excepción
		} else {
			System.out.println("Error: división entre 0");
		}
		return resultado; // return s1-s2;
	}

	public static int dividev1(int s1, int s2) {
		int resultado = -1;
		try {
			resultado = s1 / s2; // ojo si s2 es 0 lanza excepción
		} catch (ArithmeticException ex) {
			System.out.println("Error: división entre 0");
		} catch (Exception ex) {
			System.out.println("Error desconocido");
		}
		return resultado; // return s1-s2;
	}

	public static int divide(int s1, int s2) throws ArithmeticException {
		int resultado = -1;
		resultado = s1 / s2; // ojo si s2 es 0 lanza excepción
		return resultado; // return s1-s2;
	}

}
