import java.util.Scanner;

public class diasmes{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        int mes;
        String dia=new String("Enero");

        System.out.print("Introduce mes: ");
        mes = s.nextInt();

        switch (mes) {
            case 1:
                System.out.print(dia);
                break;
        
            default:
                break;
        }
    }
}