
public class ArraysEj5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lon=5;
		int []numeros=new int[lon];
		//rellenaAleatorio(numeros,0,9);
		rellenaAleatorio(numeros);
		muestraArray(numeros);
		System.out.println("la suma es "+sumaElement(numeros));
		
	
	}
	
	
	/**
	 * metodo que rellena un array con numeros aleatorios comprendidos entre dos limites
	 * @param miArray: array que genero con numeros aleatorios entre dos limites
	 * @param lower: limite inferior
	 * @param upper: limite superior
	 */
	/*public static void rellenaAleatorio(int[] miArray, int lower, int upper) {
		int aux=0;
		if(lower>upper) {
			aux=lower;
			lower=upper;
			upper=aux;
		}
		for(int i=0;i<miArray.length;i++) {
			miArray[i]= (int) (Math.random() * (upper - lower)) + lower;
		}
	}*/
	
	/**
	 * metodo que muestra por pantalla los elementos del array pasado como argumento
	 * @param miArray
	 */
	public static void muestraArray (int [] miArray) {
		for (int i = 0; i < miArray.length; i++) {
			System.out.println(miArray[i]);
		}
	}

	/**
	 * metodo que recorre miArray sumando todos los elementos
	 * @param miArray
	 * @return la suma de los elementos
	 */
	public static int sumaElement (int [] miArray) {
		int suma=0;
		for (int i = 0; i < miArray.length; i++) {
			suma+=miArray[i];
			//suma=suma+miArray[i];
		}
		
		return suma;
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
			miArray[i]=generaAleatorio(0,9);
		}
	}
	
}
