import java.util.Scanner;
import java.util.InputMismatchException;
public class ClaveSecreta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0,b=0,i=0;

        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantidad de digitos en array: ");
        a = teclado.nextInt();

		Scanner teclado2 = new Scanner(System.in);
        System.out.println("Numero de intentos: ");
        b = teclado2.nextInt();
        		
        int []numeros = new int[a];
		rellenaAleatorio(numeros);
        muestraArray(numeros);
		System.out.println("-------------------------------------------------------------------------------");

		/*
			Bucle de intentos 
		*/
		for(i=1;i<=b;i++){
			rellenaArray(numeros);
			mArray(numeros);
			
		}
        
				
		

	}
	
	/**
	 * metodo que genera un numero aleatorio entre dos limites
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
	 * rellena con numeros por teclado el array
	 * @param miArray
	 */
	public static void rellenaArray(int[] miArray1) {
		for (int i = 0; i < miArray1.length; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Valor "+i+": ");
			miArray1[i]=teclado.nextInt();
		}
	}

    /**
	 * rellena con numeros aleatorios entre 1 y 5 el array
	 * @param miArray
	 */
    public static void rellenaAleatorio(int[] miArray) {
		for (int i = 0; i < miArray.length; i++) {
			miArray[i]=generaAleatorio(1,5);
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

    /**
	 * metodo que muestra por pantalla los elementos del array 
	 * @param miArray
	 */
    public static void mArray(int [] miArray1) {
		for (int i = 0; i < miArray1.length; i++) {
			System.out.print(miArray1[i]+" ");
		}
		System.out.println();
	}

    /**
	 * metodo que compara las posiciones de los arrays
	 * @param miArray
	 */

/*
    public static bolean ComparaArrays (int[]a, int[]b){
        bolean iguales=true;
        if(a.length==b.length){
            for(int i=0;i<a.lenght;i++){
                if(a[i]!=b[i]){
                    iguales=false;
                    i=a.lenght;
                }
            }
        }else{
            iguales=false;
        }return iguales;
    }
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
