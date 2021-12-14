import java.util.InputMismatchException;
import java.util.Scanner;
public class efo{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in); 
        int i2;
        boolean valido=false;
        do{
            try{
                System.out.print("Numero:");
            i2 = s.nextInt();
            valido=true;
                }catch(InputMismatchException ex){
                    System.out.println("no valido");
                    teclado.next();
                }
            }while(!valido || i2<=0);
            }

        }
        
          for(int i=1;i<=i2;i++){
                if(i2%i==0){
                    System.out.println();
                }

          }
            /*
            if(i2>0&&i2<12){
                for(int i=0;i<=10;i++){
                    System.out.println(i2+"x"+i+"="+(i2*i));
                }
            }
        */
    }
}
