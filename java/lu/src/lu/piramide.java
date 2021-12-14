package lu;



public class piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []abc= new char[26];
		rellenaLetras(abc);
	for (int i=0;i<abc.length;i++) {
		System.out.print(abc[i]+" ");
		
	}
	System.out.println();
	piramide1(abc,6);
	System.out.println();
	piramide2(abc,6);
	System.out.println();
	piramide3(abc,6);
}
	
	public static void rellenaLetras(char []abc) {
		for (int i=0;i<abc.length;i++) {
			abc[i]=(char)(i+97);
		}
	}

	public static void piramide1(char []abc,int fila) {
		
		for (int i=0;i<fila;i++) {
			for (int j=0;j<i;j++) {
				System.out.print(abc[j]);
				
			}
			System.out.println();
			
		}
	}
	public static void piramide2(char []abc,int fila) {
		for (int i=0;i<fila;i++) {
			for (int j=0;(j<fila-i-1);j++) {
				System.out.print("-");
			}
			for (int j=0;j<=i;j++) {
				System.out.print(abc[j]);
			}
			System.out.println();
		}
	}
	public static void piramide3(char []abc,int fila) {
		for (int i=0;i<fila;i++) {
			for (int j=0;(j<fila-i-1);j++) {
				System.out.print("-");
			}
			for (int j=i;j>=0;j--) {
				System.out.print(abc[j]);
				
			}
			for (int j=1;j<=i;j++) {
				System.out.print(abc[j]);
			}
			System.out.println();
		}
	}
}

