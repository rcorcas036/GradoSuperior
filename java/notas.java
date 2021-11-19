import java.util.Scanner;

public class notas{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        int nota;
        
        System.out.print("Introduce nota: ");
        nota = s.nextInt();

        switch (nota) {
            case 1,2,3,4:
                System.out.print("Suspenso");
                
                break;
            case 5:
                System.out.print("Aprobado");
                
                break;

                case 5:
                System.out.print("Aprobado");
                
                break;
                case 5:
                System.out.print("Aprobado");
                
                break;
                case 5:
                System.out.print("Aprobado");
                
                break;
                case 5:
                System.out.print("Aprobado");
                
                break;
                
            default:
                break;
        }
    }
}