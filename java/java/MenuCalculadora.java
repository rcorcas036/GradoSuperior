import java.util.Scanner;
public class MenuCalculadora{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion=0,a,b;
        System.out.println("Introduce a");
        a=teclado.nextInt();
        System.out.println("Introduce b");
        b=teclado.nextInt();
        do{
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.println("Elija opcion: ");
            opcion=teclado.nextInt();

            switch(opcion){
            case 1: System.out.println("Suma de "+a+" y "+b+" = "+ (a+b));
                    break;
            case 2: System.out.println("Resta de "+a+" y "+b+" = "+ (a-b));
                    break;
            case 3: System.out.println("Producto de "+a+" y "+b+" = "+ (a*b));
                    break;
            case 4: if(b==0){
                        System.out.println("la division no es posible, no se puede dividir por 0");
                    }else{
                        System.out.println("Division de "+a+" entre "+b+" = "+ (a/b));
                    }
                    break;
            case 5: System.out.println("Ha elegido salir");
                    break;
            default: System.out.println("Opcion incorrecta, elija de nuevo");
            }
        }while(opcion!=5);
}
}