package common;

import java.util.ArrayList;
import java.util.List;


public class Estudiante {
	private String nombre;
    private List<MateriaEscolar> materias;
    public static int minimoCreditosAprobatorios = 30;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(String nombre, int creditos) {
        MateriaEscolar materia = new MateriaEscolar(nombre, creditos);
        materias.add(materia);
    }

    // Método que decide si el alumno está aprobado en base a sus créditos acumulados de las materias
    public boolean isAprobado() {
        int totalCreditos = 0;
        for (MateriaEscolar materia : this.materias) {
            totalCreditos += materia.getCreditos();
        }

        return totalCreditos >= minimoCreditosAprobatorios;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Materias:");

        for (MateriaEscolar materia : materias) {
            materia.mostrarInformacion();
        }

        System.out.println("Estado de Aprobación: " + (isAprobado() ? "Aprobado" : "No Aprobado"));
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan");
        estudiante.agregarMateria("Matemáticas", 30);
        estudiante.agregarMateria("Ciencias", 30);
        estudiante.agregarMateria("Historia", 29);

        estudiante.mostrarInformacion();
    }
}