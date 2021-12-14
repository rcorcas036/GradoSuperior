import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Scanner;

class TryCatchEjemplo{
   public static void main(String[] args){
      Scanner teclado=new Scanner(System.in);
      int numero=0;
      
      System.out.print("Inserte un número entero: ");
      try{  
        numero=teclado.nextInt();
        numero/=0;  //numero=numero/0;
        System.out.println("El número insertado es "+numero);
       // throw new Exception("Estoy cansado");
      }catch(InputMismatchException ex){
        System.out.println("¡¡¡¡ERROR!!!!! Inserte un número entero");
        //System.out.println(ex);
        //ex.printStackTrace();
      }catch(ArithmeticException ex){
          System.out.println("Illo, no dividas entre 0");
      }catch(Exception ex){
          System.out.println("Error desconocido "+ex);
      }finally{
          System.out.println("En cualquier caso esto se ejecuta");
      }
      
      teclado.close();
   }
}