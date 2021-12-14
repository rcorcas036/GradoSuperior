
public class ArrayEj6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numeros = new int[50];
		rellenaAleatorio(numeros);
		int nPrimos=cuentaPrimos(numeros);
		int []primos=new int[nPrimos];
		rellenaPrimos(numeros,primos);
		muestraArray(numeros);
		muestraArray(primos);
		
		
		

	}
	
	public static boolean esPrimo(int n) {
		boolean primo=true;
		for(int cont=2;cont<=n/2;cont++) {
			if(n%cont==0) {
				primo=false;
				cont=n;//cuando encontramos un divisor forzamos la salida del bucle
			}
		}
		return primo;
	}
	
	public static int cuentaPrimos(int []miArray) {
		int c=0;
		/*for (int i = 0; i < miArray.length; i++) {
			if(esPrimo(miArray[i])) {
				c++;
			}
		}*/
		
		for(int elemento:miArray) {
			if(esPrimo(elemento)) {
				c++;
			}
		}
		
		return c;
	}
	
	public static void rellenaPrimos(int []miArray, int []primos){
		int i=0;	
		for(int e:miArray) {
			if(esPrimo(e)) {
				primos[i]=e;
				i++;
			}
		}
	}
	
	/**
	 * metodo que genera un numero aleatorio entre dos límites
	 * @param upper limite superior
	 * @param lower limite inferior
	 * @return valor aleatorio comprendido entre los dos limites
	 */
	private static int generaAleatorio(int upper,int lower) {
		int valor=0;
		int aux=0;
		if(lower>upper) {
			aux=lower;
			lower=upper;
			upper=aux;
		}
		valor=(int) (Math.random() * (upper - lower)) + lower;
		//return (int) (Math.random() * (upper - lower)) + lower;
		return valor;
	}
	
	/**
	 * rellena con numeros aleatorios entre 0 y 9 el array
	 * @param miArray
	 */
	public static void rellenaAleatorio(int[] miArray) {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i]=generaAleatorio(0,99);
		}
	}

	/**
	 * metodo que muestra por pantalla los elementos del array pasado como argumento
	 * @param miArray
	 */
	public static void muestraArray (int [] miArray) {
		for (int i = 0; i < miArray.length; i++) {
			System.out.print(miArray[i]+" ");
		}
		System.out.println();
	}

}
