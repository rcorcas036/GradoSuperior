/**
 * Ejercicio 34
 * Realizar un programa que pida una serie de números, 
 * y muestre el mayor de los números introducidos. 
 * El programa finalizará al introducir 0.
 */
import java.util.Scanner;
 class Ejercicio35{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero=-1;
        int numeroMayor=0;
        boolean esprimero=true;
        
        while(numero!=0){
            System.out.print("Introduzca un número: ");
            numero=teclado.nextInt();
            if(numero!=0){
                if(numero > numeroMayor || esprimero){
                    numeroMayor=numero;
                }
                esprimero=false;
            }
        }
        System.out.println(numeroMayor);
    }
}