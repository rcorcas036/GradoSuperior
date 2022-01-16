package modelo;

public class Mago extends personajes{
		//Personaje Mago
		private int DefensaEspecial;
	
	
	public Mago(String nombre,int ataque,int defensa,int salud, int DefensaEspecial) {
		super(nombre,ataque,defensa,salud);
		this.DefensaEspecial=DefensaEspecial;
	}

	
	public Mago() {
		this("",0,0,0,0);
	}


	public int getDefensaEspecial() {
		return DefensaEspecial;
	}


	public void setDefensaEspecial(int defensaEspecial) {
		DefensaEspecial = defensaEspecial;
	}


	@Override
	public String toString() {
		return "Mago -> "+super.toString()+" \n Defensa Especial:"+DefensaEspecial;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
