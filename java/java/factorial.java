import java.util.Scanner;
class prueba{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in); 
         int n1,d,mul;
        d=1;
        mul=1;
         System.out.print("Numero 1: ");
            n1 = s.nextInt();
            
            while(d<=n1){
                mul=mul*d;
                d++;
            }
           System.out.print(mul);
            
        }
}                