import java.util.Scanner;
class sec{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        int n;
        int numSecreto=2;//(int)(Math.random()*100+1);
        n=0;
               
       

        while(n!=numSecreto){
            System.out.println("Numero:");
            n = s.nextInt();

            
            }
        
            if(n==2){
                System.out.println("sexo:");
            n = s.nextInt();
            }
            else{
                System.out.println("si:");
            n = s.nextInt();
            }


       
        
        
       
    }
}