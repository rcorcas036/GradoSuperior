import java.util.Scanner;

public class IfFechaCorrecta {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int dia;
    int mes;
    int year;
    boolean esBisiesto=false;

    // Pedimos datos
    System.out.print("Introduce el dia: ");
    dia = s.nextInt();
    System.out.print("Introduce el mes: ");
    mes = s.nextInt();
    System.out.print("Introduce el año: ");
    year = s.nextInt();

    //proceso para año bisiesto
    if(year%4==0){
        if(year%100==0){
            if(year%400==0){
                esBisiesto=true;
            }
        }else{
            esBisiesto=true;
        }
    }


    // Proceso para fecha correcta
    if (year > 0 && mes>=1 && mes<=12 && dia >=1 && dia <=31){ 
        //Febrero
        if(mes==2 && dia <= 29){
			if (dia==29){//si el día es 29 hay que comprobar si el año es bisiesto
				//Son años bisiestos los múltiplos de 4, excepto los múltiplos de 100 (los multiplos de 100 no son bisiestos, salvo los que sean tb multiplos de 400)
				if(esBisiesto){
                    System.out.println("Fecha correcta, el año "+ year + " es bisiesto, puede tener 29 dias");
                }else{
					System.out.println("Fecha incorrecta, el año "+year+" no es bisiesto, febrero no puede tener 29 dias");
                }   	
			}else{//días del 1 al 28, al ser febrero la fecha es correcta
				System.out.println("Fecha correcta");
			}
        }
        else if(dia <=30 && mes==4 || mes==6 || mes==9 || mes==11){
          System.out.println("Fecha correcta");
        }
        else if(dia <=31 && mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
          System.out.println("Fecha correcta");
        }
        else{
          System.out.println("Fecha incorrecta");
        }
    }else{
      System.out.println("Fecha incorrecta");
    }
  }
}