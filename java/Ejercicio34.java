/**
 * Ejercicio 34
 * Realizar un programa para calcular datos estadísticos 
 * de los alumnos de un centro. Se introducirá datos hasta 
 * que uno sea negativo, y se mostrará la suma de todas las edades, 
 * la media aritmética de las edades, el número de alumnos y cuántos 
 * son mayores de edad.
 */
import java.util.Scanner;
 class Ejercicio34{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int edad=0;
        int numeroTotal=0;
        int numeroMayorDeEdad=0;
        int sumaTotal=0;
        float mediaEdad=0.0f;
        
        while(edad>=0){
            System.out.print("Introduzca una edad o "+
                             "un número negativo para acabar: ");
            edad=teclado.nextInt();
            if(edad>=0){
                numeroTotal++;
                sumaTotal+=edad;  //sumaTotal=sumaTotal+edad;
                if(edad>=18){
                    numeroMayorDeEdad++;
                }
            }
        }
        if(numeroTotal>0){
            mediaEdad=(float)sumaTotal/numeroTotal;
        }
        System.out.println("Númerto total: "+numeroTotal+
                            "\n Número mayor de edad: "+numeroMayorDeEdad+
                            "\n Suma total: "+sumaTotal+
                            "\n La media es: "+mediaEdad);
    }
}