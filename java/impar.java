import java.util.Scanner;
class impar{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in); 
         int n1,n2;
 
         System.out.print("Numero 1: ");
            n1 = s.nextInt();
         System.out.print("Numero 2: ");
            n2 = s.nextInt();

        while(n1<n2){
            if(n1%2==0){
                System.out.print(n1);
                System.out.print("-"); 
                
            }
            n1++;

            if(n1==n2){
                System.out.print(n1);
            }
        }
        while(n2<n1){
            if(n1%2==0){
                System.out.print(n1);
                System.out.print("-"); 
                
            }
            n1--;

            if(n1==n2){
                System.out.print(n1);
            }
        }
     }
 }