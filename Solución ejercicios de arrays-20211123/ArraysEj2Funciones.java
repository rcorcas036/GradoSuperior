import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraysEj2Funciones {

	public static void main(String[] args) {
		int[] numeros =new int[10];
		int v=leeEntero("Introduce valor a buscar: ");
			
		rellenaArray(numeros);
		
		int pos=buscaArray(v,numeros);
		if(pos==-1) {
			System.out.println(v+" no se ha encontrado en el array");
		}else {
			System.out.println(v+ " está en la posición "+pos);
		}
	}
	
	/**
	 * Función que rellena un array con valores pedidos por teclado
	 * @param miArray: array donde se almacenan los valores pedidos
	 */
	
	public static void rellenaArray(int [] miArray) {
		for(int i=0;i<miArray.length;i++) {
		    miArray[i]=leeEntero("introduce numero para posición "+ i +" :");
		}
	}
	
	/**
	 * funcion que busca el valor x en el array miArray y devuelve su posición
	 * @param x : valor buscado
	 * @param miArray : array donde se busca x
	 * @return -1 si no encuentra el valor y la posición de x dentro del array si lo encuentra
	 */
	public static int buscaArray(int x,int []miArray) {
		for (int i = 0; i < miArray.length; i++) {
			if(miArray[i]==x) {
				return i;
			}
		}
		return -1;
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
