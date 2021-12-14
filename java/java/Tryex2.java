import java.util.InputMismatchException;
import java.util.Scanner;
class Tryex2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        boolean valid=false;
        do{
            try{
                System.out.println("Numero");
                num=teclado.nextInt(); 
                System.out.println("cuadrado es: "+Math.pow(num, 2));
                valid=true;
            }catch(InputMismatchException ex){
                System.out.println("Entero no valido");
    
            }catch(Exception ex){
                System.out.println("Error no valido");
                valid=true;
            }finally{
                teclado.close();
            }
        }while(!valid);
        System.out.println("Fin");
        
    }
}