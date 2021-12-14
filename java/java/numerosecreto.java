import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class numerosecreto {
  public static void main(String args[]) {
  Scanner s = new Scanner(System.in);
  int numSecreto= (int) (Math.random()*100+1);
  int n=0;

    while (n != numSecreto) {
        if (n!=-1){
            System.out.println("Introduzca un numero: ");
            n=s.nextInt();

            if (n== numSecreto ) {
               System.out.println("Acertaste!!!!!");
            }
               if (n < numSecreto && n>0) {
                System.out.println("Casi, el numero secreto es mayor ");
                } 
                else
                if (n > numSecreto) {
                    System.out.println("Casi, el numero secreto es menor ");
                    } 
           
                     
        }
        else {
            break;
        }
        
    }
}
}

    