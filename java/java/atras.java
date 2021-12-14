import java.util.Scanner;
class atras{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in); 
         int n1;
 
         System.out.print("Numero:");
            n1 = s.nextInt();

        while(n1>0){
            System.out.print("-");
            System.out.print(n1);
            n1--;
            
        }

    }
}