import java.util.Scanner;
class centro{
    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        int edad,total,mayor;
        float media,suma;
        edad=0;
        total=0;
        mayor=0;
        suma=0;
        media=0;

        while(edad>=0){
            System.out.print("Edad:");
            edad = s.nextInt();

            if(n>=0){
                total++;
                suma+=edad;
                    if(edad>=18){
                        mayor++;
                    }
            }

        }
        if(total>0){
            media=suma/total;
        System.out.println("total: "+total);
        System.out.println("mayor edad:" +mayor);
        System.out.println("media: "+media);

        }
        
    }
}