import java.util.Scanner;

public class RecogeCadena {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena="";
		String cadena2="";
		
			
		//para recoger una cadena hasta pulsar el salto de línea.
		System.out.println("\n Introduce una cadena: ");
		
		//nextLine recoge todo el texto hasta que se pulsa un salto de línea
		cadena=teclado.nextLine();
		
		//mostramos los datos que hemos recogido
		System.out.println("\nCadena = " + cadena);
		
		// para recoger una cadena hasta el primer espacio
		System.out.println("\n Introduce una cadena: ");
		
		//nextLine recoge el texto hasta el primer espacio
		cadena2=teclado.next();
		
		//mostramos los datos que hemos recogido
		System.out.println("\nCadena = " + cadena2);
		
	}

}
