package modelo;

public class animal {
	private String especie;
	private boolean female;
	private static int numeroDeejemplares=0;
	public animal(String especie, boolean female) {
		super();
		this.especie = especie;
		this.female = female;
		animal.numeroDeejemplares++;
	}
	
	public animal() {
		this("Desconocido",true);
		
		/*
		 * La línea de arriba es lo mismo que esta, solo que acortado
		 * this.especie = Desconocido;
			this.female = true;
		 * */
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}

	@Override
	public String toString() {
		return "animal [especie=" + especie + ", female=" + female + "]";
	}
	
	public static String getFunciones() {
		return "Relacion, Nutricion, Reproduccion";
	}
	public static int getNejemplares() {
		return numeroDeejemplares;
	}
}
