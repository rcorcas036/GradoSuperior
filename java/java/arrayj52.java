/*esto va en eclipse*/
public class arrayj52 {
    public static void main(String args[]) {
            int lon=5;
            int []numeros=new length[lon];

            ral(numeros,0,99);
            marr(numeros);
            System.out.println("son primos "+esPrimo(numeros))
          }
          public static void ral(int[] arr, int lw, int up)
            int aux=0;
            if(lw>up){
                aux=lw;
                lw=up;
                up=aux;
            }
            for(int i=0;i<arr.length;i++){
                arr[i]= (int) (Math.random() * (up-lw)) + lw;
            }
            
            public static void marr(int [] arr){
                for(int i=0;i<arr.length;i++)
                system.out.println(arr[i]);
            }
            public static boolean esPrimo(int numero) {
 
                if (numero <= 1) {
                    return false;
                }
         
                int contador = 0;
         
                for (int i = (int) Math.sqrt(numero); i > 1; i--) {
                    if (numero % i == 0) {
                        contador++;
                    }
                }
         
                return contador < 1;
            }
          
               
}