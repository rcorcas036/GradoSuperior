import java.util.Scanner;
class sumas{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in); 
         int n1,d,suma;
        d=0;
        suma=0;
         System.out.print("Numero 1: ");
            n1 = s.nextInt();
                        
            if(n1>0){
                while(n1>d){
                    d++;
                    suma=suma+d;            

                    if(n1==d){
                        System.out.println(suma);
                    }                  

                }

            }
            
        }
}                