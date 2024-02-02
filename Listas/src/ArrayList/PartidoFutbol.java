package ArrayList;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PartidoFutbol {

	private String equipoLocal;
	private String equipoVisitante;
	private int golesLocal;
	private int golesVisitante;

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public static void main(String[] args) {

		System.out.println("lista de objetos");
		ArrayList<PartidoFutbol> partidos = new ArrayList<PartidoFutbol>();

		// Instanciamos eL fichero donde estan Los datos
		File fichero = new File("D:\\Usuarios\\Aleks\\Descargas\\partidos.txt");
		Scanner s = null;

		try {
			System.out.println("Leer contenido");
			s = new Scanner(fichero);

			while (s.hasNextLine()) {
				String linea = s.nextLine();
				String[] cortarString = linea.split("::");
				PartidoFutbol partido = new PartidoFutbol();

				partido.setEquipoLocal(cortarString[0]);
				partido.setEquipoVisitante(cortarString[1]);
				partido.setGolesLocal(Integer.parseInt(cortarString[2]));
				partido.setGolesVisitante(Integer.parseInt(cortarString[3]));

				partidos.add(partido);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (s != null) {
					s.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		System.out.println("Guardados " + partidos.size() + "partidos");

		System.out.println("RESULTADOS__________________");

		Iterator<PartidoFutbol> itrPartidos = partidos.iterator();
		while (itrPartidos.hasNext()) {
			PartidoFutbol partido = itrPartidos.next();
			System.out.println(partido.getEquipoLocal() + " " + partido.getGolesLocal() + "-"
					+ partido.getGolesVisitante() + " " + partido.getEquipoVisitante());

		}

		System.out.println("TAMAÑO ARRAYLIST ANTES DE ELIMINAR" + partidos.size());
		System.out.println("ELIMINAMOS LOS PARTIDOS NO EMPATADOS");

		itrPartidos = partidos.iterator();
		while (itrPartidos.hasNext()) {
			PartidoFutbol partido = itrPartidos.next();

			if (partido.getGolesLocal() != partido.getGolesVisitante()) {
				itrPartidos.remove();
			}

		}
		
		System.out.println("TAMAÑO ARRAY DESPUES DE ELIMINAR " + partidos.size());
		System.out.println("RESULTADOS PARTIDOS EMPATADOS");
		while(itrPartidos.hasNext()) {
			PartidoFutbol partido = itrPartidos.next();
			
			System.out.println(partido.getEquipoLocal() + " " +
			partido.getGolesLocal() + "-" + partido.getGolesVisitante() + " " + partido.getEquipoVisitante());
		}
	}

}