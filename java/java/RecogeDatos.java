import java.util.Scanner;

public class RecogeDatos{
    public static void main (String args[]){
        int num;
        float numf;
        String cadena;
        Scanner teclado = new Scanner (System.in);
        System.out.println("entero:");
        num=teclado.nextInt();
        System.out.println("real:");
        numf=telcado.nextFloat();
        System.out.println("texto");
        cadena=teclado.nextLine();
        
        //cadena++;

        System.out.println("real:" +numf);
        System.out.println("entero" +num);
        System.out.println("cadena" +cadena);       
    }
}

