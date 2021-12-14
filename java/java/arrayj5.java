/*esto va en eclipse*/
public class arrayj5 {
    public static void main(String args[]) {
            int lon=5;
            int []numeros=new length[lon];

            ral(numeros,0,9);
            marr(numeros);
            System.out.println("la sma es "+sumarr(numeros))
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
            public static int sumarr(int[] arr){
                int suma=0;
                for (int i=0;i<arr.length;i++){
                    suma+=arr[i];
                    suma=suma+arr[i];
                }
            }
            return suma;
}