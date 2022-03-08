package lu;
import java.util.Scanner;

public class l9 {
public static void main(String[] args) {
	int media1=0,media2=0,media3=0,media4=0,a;
	int[] trimestre1 =new int[5];
	int[] trimestre2 =new int[5];
	int[] trimestre3 =new int[5];
	
	System.out.println("Notas del trimestre1: ");
	for(int i=0;i<trimestre1.length;i++) {
		Scanner teclado = new Scanner(System.in);
        
        trimestre1[i] = teclado.nextInt();
         media1=media1+trimestre1[i];
	}
	
	System.out.println("Notas del trimestre2: ");
	for(int i=0;i<trimestre2.length;i++) {
		Scanner teclado = new Scanner(System.in);
		        
		 trimestre2[i] = teclado.nextInt();
		  media2=media2+trimestre2[i];
	}
	System.out.println("Notas del trimestre3: ");
	for(int i=0;i<trimestre3.length;i++) {
		Scanner teclado = new Scanner(System.in);
		        
		 trimestre3[i] = teclado.nextInt();
		  media3=media3+trimestre3[i];
	}
	
	media1=media1/5;
	media2=media2/5;
	media3=media3/5;
	System.out.println("la media es: "+media1);
	System.out.println("la media es: "+media2);
	System.out.println("la media es: "+media3);
			
	Scanner teclado = new Scanner(System.in);		
	System.out.println("Posicion de los estudiantes: ");
	a = teclado.nextInt();
	
	media4=((trimestre1[a]+trimestre2[a]+trimestre3[a])/3);
	System.out.println("La media de los estudiantes de la posicion "+a+" es: "+media4);
}
}
