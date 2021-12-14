import java.util.Scanner;
class tipos{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        int n;
        n=2;
        
        
        while(n!=0){
            System.out.print("Numero:");
            n = s.nextInt();
          if(n!=0){
            if(n%2==0){
                System.out.println("par");
            }
    
            else{
                System.out.println("impar");
            }
                

            if(n>0){
                System.out.println("positivo");
            }

            else{
                System.out.println("negativo");
            }   
            System.out.println("el cuadrado es: "+n*n);
        }
          } 
        
    }
}