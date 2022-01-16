package modelo;

public class Guerrero extends personajes{
//Personaje guerrero
	private int AtaqueEspecial;
	
	public Guerrero(String nombre,int ataque,int defensa,int salud,int AtaqueEspecial) {
	
	super(nombre,ataque,defensa,salud);
	this.AtaqueEspecial=AtaqueEspecial;
	
	}

	public Guerrero() {
		this("",0,0,0,0);
	}

	public int getAtaqueEspecial() {
		return AtaqueEspecial;
	}

	public void setAtaqueEspecial(int ataqueEspecial) {
		AtaqueEspecial = ataqueEspecial;
	}

	@Override
	public String toString() {
		return "Guerrero -> "+super.toString()+" \n Ataque Especial:"+AtaqueEspecial;
	}
	
	
}
