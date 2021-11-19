import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * programa que recorre un array en dos direcciones, desde el primer elemento hasta el �timo, 
 * y desde el �ltimo hasta el primero
 * 
 * @author pmpalacios
 *
 */
public class ArrayEj1 {

	public static void main(String[] args) {
		
		int[] numeros =new int[10];
	
		for(int i=0;i<10;i++) {
		    numeros[i]=leeEntero("introduce numero para posici�n "+ i +" :");
		}
		System.out.println("array hacia adelante");
		//recorro el array hacia adelante
		for(int i=0;i<10;i++) {
			System.out.print(numeros[i]+"  ");
		}
		System.out.println("array hacia atras");
		//recorro el array hacia atr�s
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.print(numeros[i]+"  ");
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
