import java.util.Scanner;
class Tryex{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int numero=0;

        System.out.println("Numero:");
        try{
            numero=teclado.nextInt();
            numero/=0;
            System.out.println("Numero es:"+numero);
        }catch(ImputMismatchException ex){
            System.out.println("Error");
        }catch(ArithmeticException ex){
            System.out.println("no entre 0");
        }catch(Exception ex){
            System.out.println("Desconocido");
        }finally{
            System.out.println("siemrpe sew ejecuta");
        }            
        
        
        teclado.close();
    }
}