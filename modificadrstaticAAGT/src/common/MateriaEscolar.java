package common;

public class MateriaEscolar {

	private static int cantidadTotalMaterias = 0;
    private String nombre;
    private int creditos;

    public MateriaEscolar(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
        cantidadTotalMaterias++;
    }

    public static int getCantidadTotalMaterias() {
        return cantidadTotalMaterias;
    }

    public void mostrarInformacion() {
        System.out.println("Materia: " + nombre);
        System.out.println("Créditos: " + creditos);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public static void setCantidadTotalMaterias(int cantidadTotalMaterias) {
		MateriaEscolar.cantidadTotalMaterias = cantidadTotalMaterias;
	}
    
    
} 	