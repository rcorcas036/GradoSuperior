import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int[] numeros = new int [5];
		rellenaArray(numeros);
		System.out.println("el elemento mayor es "+numeros[posMayor(numeros)]+" y está en la posición "+posMayor(numeros));
		System.out.println("el elemento menor es "+numeros[posMenor(numeros)]+" y está en la posición "+posMenor(numeros));
		
		

	}
	/**
	 * Función que rellena un array con valores pedidos por teclado
	 * @param miArray: array donde se almacenan los valores pedidos
	 */
	
	public static void rellenaArray(int [] miArray) {
		for(int i=0;i<miArray.length;i++) {
		    try {
				miArray[i]=pideValor(i);
			} catch (Exception e) {
				i--;
				System.out.println(e);
			}
		}
	}
	
	/**
	 * metodo que pide un valor entero mayor que 0,
	 * cuando el numero introducido es menor o igual a 0, lanza excepcion
	 * @param i: tendrá la posición del elemento dentro del array, servirá para informar al usuario unicamente
	 * @return valor entero
	 * @throws Exception: lanzará la excepcion cuando el numero sea 0 o menos que 0
	 */
	public static int pideValor(int i) throws Exception {
		int valor=-1;
		valor=leeEntero("introduce numero para posición "+ i +" :");
		if(valor<=0) {
			throw new Exception("Error,numero negativo");
		}
		return valor;
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

	/**
	 * devuelve la posición en el array del elemento mayor
	  * @param miArray: array donde buscamos el elemento menor
	 * @return posicion del elemento mayor
	 */
public static int posMayor(int [] miArray) {
	int mayor=-1;
	int posMayor=-1;
	for(int i=0;i<miArray.length;i++) {
		if(mayor<miArray[i]) {
			mayor=miArray[i];
			posMayor=i;
		}
	}
	return posMayor;
}

/**
 * devuelve la posición en el array del elemento menor
 * @param miArray: array donde buscamos el elemento menor
 * @return posición del elemento menor
 */
public static int posMenor(int [] miArray) {
	int menor=miArray[0];
	int pos=0;
	for(int i=1;i<miArray.length;i++) {
		if(menor>miArray[i]) {
			menor=miArray[i];
			pos=i;
		}
	}
	return pos;
}

}
