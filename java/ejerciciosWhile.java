import java.util.Scanner;
//Ejercicios Bucle While
class ejerciciosWhile {
    public static void main(String[] args){
       System.out.println("Ejercicios de bucles");
      
        //todo acabado
    }
    //EJERCICIO 28. NUMEROS PARES ENTRE 1 Y 100
    public static void ejercicio1(){
        int n=1;
        while(n<=100){
             if(n%2==0){
                System.out.println(n);  
             }
             n++;
        }
    }

    //EJERCICIO 29. NUMEROS IMPARES ENTRE DOS NUMEROS INTRODUCIDOS POR TECLADO
    public static void ejercicio2(){
       Scanner teclado = new Scanner(System.in);
       int n1=teclado.nextInt();
       int n2=teclado.nextInt();
       if(n1>n2){
           int tmp=n1;
           n1=n2;
           n2=tmp;
       }
       while(n1<=n2){
           if(n1%2==1){
               System.out.println(n1);
           }
           n1++;
       }
    }
}