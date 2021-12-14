package test;
import java.util.Scanner;
public class calc {
	public static void main(String[] args) {
		int a,n1,n2;
		a=0;
		n1=0;
		n2=0;
		
		 System.out.print("Numero 1: ");
         n1 = s.nextInt();
         
      System.out.print("Numero 2: ");
         n2 = s.nextInt();
         
		switch (a) {
		case 1: {
			
			sum(n1,n2);
		}
			
		case 2: {
			
			res(n1,n2);
		}
		case 3: {
			
			mul(n1,n2);
		}
		case 4: {

			div(n1,n2);
		}
		}
		
	}
	public static void sum(int n1,int n2){
		int sum=(n1+n2);
		System.out.println("la suma es "+sum);
	}
	public static void res(int n1,int n2){
		int res=(n1-n2);
		System.out.println("la resta es "+res);
	}
	public static void mul(int n1,int n2){
		int mul=(n1*n2);
		System.out.println("la multiplicacion es "+mul);
	}
	public static void div(int n1,int n2){
		int div=(n1/n2);
		System.out.println("la division es "+div);
	}
}
