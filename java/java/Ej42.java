import java.util.Scanner;
import java.util.InputMismatchException;

class Ej42{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int numero=0, opcion=0;
        boolean valido=false;
        do{
           try{
                System.out.println("Introduce un valor entero: ");
                numero=teclado.nextInt();
                valido=true;

           }catch(InputMismatchException ex){
                System.out.println("numero entero no valido");
                teclado.next();
                
           }
        }while(!valido || numero<=0 || numero>15);

       valido=false;
       do{
           try{
                    System.out.println(" ** menu **");
                    System.out.println("0. Salir ");
                    System.out.println("1. Factorial ");
                    System.out.println("2. Tabla de multiplicar ");
                    System.out.println("3. Fibonacci ");
                    System.out.println("4. Cambio de numero ");
                    System.out.println("Intruzca opcion ");
                    opcion=teclado.nextInt();
                    valido=true;
                    switch(opcion){
                        case 0: System.out.println("ha elegido salir ");
                                
                                break;
                        case 1: System.out.println("Factorial ");
                                
                                break;
                        case 2: System.out.println("Multiplicar ");
                                break;
                        case 3: System.out.println("Fibonnaci ");
                                break;
                        case 4: System.out.println("Pedir numero de nuevo ");
                                do{
                                    try{
                                        System.out.println("Introduce un valor entero: ");
                                        numero=teclado.nextInt();
                                        valido=true;
                        
                                    }catch(InputMismatchException ex){
                                        System.out.println("numero entero no valido");
                                        teclado.next();
                                        
                                    }
                                }while(!valido || numero<=0 || numero>15);
                                break;
                        default:System.out.println("Opcion incorrecta");

                    }
            
            } catch(InputMismatchException ex){
            System.out.println("numero entero no valido");
            teclado.next();
            }
        }while(opcion!=0 || !valido); 
        
    }

}