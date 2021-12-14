import java.util.Scanner;

public class RecogeFloat {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		float b=0;
			
			
		//mostramos mensaje para informar al usuario de lo que queremos pedir
		System.out.println("\n Introduce un float: "); 
		
		//recogemos un numero real y lo almacenamos en la variable b. Si se introduce un dato no numérico se produce un error que aprenderemos a controlar más adelante
		b = teclado.nextFloat(); 
		
		//mostramos el dato
		System.out.println("\nDecimal (float) = " + b);
	
	}

}
