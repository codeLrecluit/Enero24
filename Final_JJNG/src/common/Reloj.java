package common;

//final 3: bloquea la herencia
public final class Reloj {
	
	String tipo;
	
	int minutos;
	int horas;
	int segundos;
	// final nivel 1: crear una constante
	public static final int HORAS_MAX = 23;
	public static final int MINUTOS_MAX = 59;
	public static final int SEGUNDOS_MAX = 59;
	
	String material;
	
	public Reloj() {
		
	}

	public Reloj(String tipo, int minutos, int horas, int segundos, String material) {
		super();
		this.tipo = tipo;
		this.minutos = minutos;
		this.horas = horas;
		this.segundos = segundos;
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public static int getHorasMax() {
		return HORAS_MAX;
	}

	public static int getMinutosMax() {
		return MINUTOS_MAX;
	}

	public static int getSegundosMax() {
		return SEGUNDOS_MAX;
	}

	@Override
	public String toString() {
		return "Reloj [tipo=" + tipo + ", minutos=" + minutos + ", horas=" + horas + ", segundos=" + segundos
				+ ", material=" + material + "]";
	}
	
	//Metodo nativo
	//final 2: crea metodos que no se pueden sobreescribir
	public final void mostrarHora() {
		System.out.println("La hora es ....");
	}
	
	
	public double multiplicar(double a, double b) {		
		return a*b;
	}
	
	
	

}