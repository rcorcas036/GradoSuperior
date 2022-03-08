import modelo.animal;
public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println(animal.getFunciones());
		
		animal a1=new animal();
		System.out.println(a1);
		
		System.out.println(a1.getEspecie());
		System.out.println(a1.getFunciones());
		System.out.println(animal.getNejemplares());
		
		animal a2=new animal("Mamíferos",false);
		System.out.println(a2.getEspecie());
		System.out.println(a2.getFunciones());
		System.out.println(animal.getNejemplares());
		*/
		
		/*
		 * Esto se muestra en Utils
		 * */
		int n=InOut.leeEntero();
		animal a1=new animal();
		InOut.s(a1.getEspecie());
		System.out.println(animal.getNejemplares());
		
		
	}

}
