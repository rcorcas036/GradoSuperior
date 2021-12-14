/**
 * @title:
 * @description: 
 * @autor: Carlos Serrano
 */
import java.util.Scanner;
class Ejercicio33{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero=-1;

        while(numero!=0){
            System.out.print("Introduzca un número: ");
            numero=teclado.nextInt();
            if(numero!=0){
                if(numero%2==0){
                    System.out.println("Es par");
                }else{
                    System.out.println("Es impar");
                }
                if(numero > 0){
                    System.out.println("Es positivo");
                }else{
                    System.out.println("Es negativo");
                }
                System.out.println("El cuadrado de "+numero+" es "+
                        numero*numero);
            }
        }


    }
}