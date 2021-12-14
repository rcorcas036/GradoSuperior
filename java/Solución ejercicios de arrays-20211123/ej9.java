import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []t1=new int[5];
		int []t2=new int[5];
		int []t3=new int[5];
		System.out.println("Rellenando Trimestre 1 ...");
		rellenaArray(t1);
		System.out.println("Rellenando Trimestre 2 ...");
		rellenaArray(t2);
		System.out.println("Rellenando Trimestre 3 ...");
		rellenaArray(t3);
		
		System.out.println("Media del trimestre 1 = "+mediaArray(t1));
		System.out.println("Media del trimestre 2 = "+mediaArray(t2));
		System.out.println("Media del trimestre 3 = "+mediaArray(t3));
		
		
			for (int i = 0; i < t3.length; i++) {
				try {
					System.out.println("Nota media del alumno "+(i+1)+":"+
							+mediaAlumno(i,t1,t2,t3));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
			}
			
		
	}
	
	public static double mediaArray(int [] miArray) {
	//	double media=0;
		int suma=0;
		for (int i = 0; i < miArray.length; i++) {
			suma+=miArray[i];
		}
		return (double)suma/miArray.length;
		
	}
	
	public static double mediaAlumno (int pos,int []t1,int []t2, int []t3) throws Exception {
		if(pos>t1.length||pos<0) {
			throw new Exception ("Indice fuera de rango");
		}
		return (double)(t1[pos]+t2[pos]+t3[pos])/3;
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
		if(valor<=0 || valor>10) {
			throw new Exception("Error,nota incorrecta");
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


}
