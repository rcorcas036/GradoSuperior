

public class Ej10 {

	public static void main(String[] args) {
		int [] t = {5,7,8,1,6,4};
		int[] s;
		
		System.out.println("Array original:");
		for (int e: t) {
			System.out.print(e +" ");
		}
		System.out.println("\n\nResultado:");
		try {
			s = suma(t,15);
			for (int e: s) {
				System.out.print(e +" ");
			}

			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
		}
		
		
		
		
	}
	
	public static int [] suma (int []t, int nElem) throws Exception {
		
		if (t.length<=nElem) {
			throw new Exception ("nElem no puede ser mayor o igual al número de elementos del array");
		}
		
		int tam = t.length+1-nElem;
		
		int []s=new int [tam];
		
		for (int i = 0; i < tam; i++) {
			for (int j=0;j<nElem;j++) {
				s[i]+=t[i+j];
			}
		}
		
		
		return s;
	}

}
