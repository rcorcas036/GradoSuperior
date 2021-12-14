import java.util.Scanner;
class cm{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        int n,m;
        n=-1;
        m=0;
        String dni = "";
        String dni2="";
        
        
        boolean primero=true;
        while(n!=0){
            System.out.print("altura:");
            n = s.nextInt();
            

            if(n!=0){
                if(n>=m||primero){
                           m=n ;
                        dni2=dni;   
                    }
                    primero=false;
                    System.out.print("dni:");
            dni = s.next();
            }

        }
        System.out.println("mayor: "+m);
        System.out.println("dni: "+dni2);
  }
}