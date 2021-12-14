import java.util.Scanner;
class serie{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        int n,m;
        n=-1;
        m=0;
        boolean primero=true;
        while(n!=0){
            System.out.print("Numero:");
            n = s.nextInt();

            if(n!=0){
                if(n>=m||primero){
                        m=n ;
                    }
                    primero=false;
            }

        }
        System.out.println("mayor: "+m);

        
        
    }
}