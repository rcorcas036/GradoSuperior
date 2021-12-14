import java.util.Scanner;

public class RecogeEntero {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int a=0;
				
		//mostramos mensaje para informar al usuario de lo que queremos pedir
		System.out.println("\n Introduce un entero: "); 
		
		//recogemos un numero entero y lo almacenamos en la variable a. Si el usuario se equivoca y no introduce un entero se produce un error que aprenderemos a controlar un poco más adelante.
		a = teclado.nextInt(); 
		
		//mostramos el dato entero
		System.out.println("\nEntero = " + a);

	}

}
