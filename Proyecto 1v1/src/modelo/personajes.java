package modelo;

public class personajes {
//Plantilla para personajes	
	private String nombre;
	private int ataque;
	private int defensa;
	private int salud;
	
	public personajes(String nombre,int ataque,int defensa, int salud) {
		this.nombre=nombre;
		this.ataque=ataque;
		this.defensa=defensa;
		this.salud=salud;
	}

	public personajes() {
		this("",0,0,0);
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n Ataque: " + ataque + "\n Defensa: " + defensa + "\n Salud: " + salud;
		
	}
	
	public boolean increaseSalud(double aumento) {
		boolean correcto=false;
		if(aumento>0) {
			this.salud+=aumento;
			correcto=true;
		}
		return correcto;
	}
	
	
	
	
	
	
	
	
	
	
	
}
