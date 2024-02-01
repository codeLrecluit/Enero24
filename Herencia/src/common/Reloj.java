package common;

//public final class Reloj
//BLOQUEA LA HERENCIA

public  class Reloj {
	
	String tipo;
	
	int minutos;
	int horas;
	int segundos;
	
	String material;
	
	//FINAL NIVEL 1 : CREAR CONSTANTE
	public static final int HORAS_MAX = 23;
	public static final int MINUTOS_MAX = 59;
	public static final int SEGUNDOS_MAX = 59;
	
	
	public static int getHorasMax() {
		return HORAS_MAX;
	}

	public static int getMinutosMax() {
		return MINUTOS_MAX;
	}

	public static int getSegundosMax() {
		return SEGUNDOS_MAX;
	}

	
	
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

	@Override
	public String toString() {
		return "Reloj [tipo=" + tipo + ", minutos=" + minutos + ", horas=" + horas + ", segundos=" + segundos
				+ ", material=" + material + "]";
	}
	
	//FINAL
	//CREA METODOS QUE NO SE PUEDEN SOBREESCRIBIR
	public void mostrarhora() {
		System.out.println("Muestra la hora");
	}
	
	//ACTUA EN LOS ARGUMENTOS EN LA CANTIDAD Y TIPO DE LOS METODOS
	//CONSTRUCTURES, DEPENDIENDO LO QUE RECIVA
	
	//SOBREESCRITURA, EN AMBOS LADOS SE TIENE EL MISMO METODO
	//SOLO CAMBIA LA LOGICA DEL METODO

}
