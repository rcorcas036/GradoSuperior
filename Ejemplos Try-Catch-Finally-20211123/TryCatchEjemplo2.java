import java.util.InputMismatchException;
import java.util.Scanner;

class TryCatchEjemplo2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean valido=false;
        do{
            try{
                System.out.print("Inserte un número entero: ");
                numero=teclado.nextInt();
                System.out.println("El cuadrado de su número es :"+Math.pow(numero, 2));
                valido=true;
            }catch(InputMismatchException ex){
                System.out.println("Número entero no válido");
                teclado.next();
            }catch(Exception ex){
                System.out.println("Error desconocido");
                ex.printStackTrace();
                valido=true;
            }finally{
                //teclado.close();
            }
        }while(!valido);  //valido==false
        teclado.close();
        System.out.println("Gracias por usar nuestro software");
    }
}