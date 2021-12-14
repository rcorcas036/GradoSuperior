import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * programa que recorre un array en dos direcciones, desde el primer elemento hasta el útimo, 
 * y desde el último hasta el primero
 * 
 * @author pmpalacios
 *
 */
public class ArrayEj2 {

	public static void main(String[] args) {
		
		int[] numeros =new int[10];
		
	    //recoge los 10 valores enteros
		for(int i=0;i<10;i++) {
		    numeros[i]=leeEntero("introduce numero para posición "+ i +" :");
		}
		
		//pedimos 
		int v=leeEntero("Introduce valor a buscar: ");
	    boolean encontrado=false;
		
		for(int i=0;i<10 && !encontrado;i++) {
			System.out.println(i);
			if(numeros[i]==v) {
				System.out.println(v+ " está en la posición "+i);
			    encontrado=true;
			   // i=10;
			}
		}
		
		if(!encontrado) {
			System.out.println("valor no encontrado");
		}
	}
	/**
	 * lee un entero por teclado y valide el dato
	 * @param f :cadena para mostrar mensaje
	 * @return un entero con el valor recibido
	 */
	public static int leeEntero(String f) {
		Scanner teclado = new Scanner (System.in);
		int numero=-1;
		boolean valid=false;//variable para terminar el bucle cuando el valor sea correcto
        do{
           try{
                System.out.println(f);
                numero=teclado.nextInt();
                valid=true;

           }catch(InputMismatchException ex){
                System.out.println("numero entero no valido");
                teclado.next();
                
           }
        }while(!valid);
        return numero;
	}

}
