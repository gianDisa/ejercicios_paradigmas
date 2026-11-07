package ejercicio_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, List<Integer>> regEstud = new HashMap<>();
		
		agregarAlumnoNota(regEstud, "Gian", 10);
		agregarAlumnoNota(regEstud, "Gian", 8);
		agregarAlumnoNota(regEstud, "Gian", 10);
		agregarAlumnoNota(regEstud,"Mateo",10);
		agregarAlumnoNota(regEstud,"hernan",10);
		agregarAlumnoNota(regEstud,"hernan",8);
		agregarAlumnoNota(regEstud,"hernan",10);
		
		System.out.println("----------------ALUMNO CON NOTAS-------------");
		mostrarAlumno(regEstud);
		System.out.println("----------------PROMEDIOS-------------");
		mostrarAlumnoPromedio(regEstud,"Gian");
		mostrarAlumnoPromedio(regEstud,"Mateo");
		mostrarAlumnoPromedio(regEstud,"hernan");
		
		System.out.println("----------------NUEVO MAP-------------");
		Map<Integer, List<String>> estudProm = agruparPorProm(regEstud);
		mostrarPromedio(estudProm);
		
	}

	public static void agregarAlumnoNota(Map<String, List<Integer>> regEstud, String alumno, int nota) {

		if (regEstud.containsKey(alumno)) {

			List<Integer> listaNotas = regEstud.get(alumno);
			listaNotas.add(nota);

		} else {
			List<Integer> listaNotas = new ArrayList<>();
			listaNotas.add(nota);
			regEstud.put(alumno, listaNotas);
		}

	}

	public static void mostrarAlumno(Map<String, List<Integer>> regEstud) {

		for (String estudiante : regEstud.keySet()) {
			System.out.println(estudiante);
			for (Integer nota : regEstud.get(estudiante)) {
				System.out.println(nota);
			}
		}

	}

	public static void mostrarAlumnoPromedio(Map<String, List<Integer>> regEstud, String alumno) {

		Integer promedio = 0;
		for (String estudiante : regEstud.keySet()) {
			if (estudiante.equals(alumno)) {
				System.out.println(estudiante);
				for (Integer nota : regEstud.get(estudiante)) {
					promedio += nota;
				}
				System.out.println(promedio / regEstud.get(estudiante).size());
			}
		}

	}
	
	public static Map<Integer,List<String>> agruparPorProm(Map<String, List<Integer>> regEstud) {

		Integer promedio;
		Integer promTot;
		Map<Integer, List<String>> estudProm = new HashMap<>();
		for (String estudiante : regEstud.keySet()) {
			promedio = 0;
				for (Integer nota : regEstud.get(estudiante)) {
					promedio += nota;
				}
				promTot = promedio / regEstud.get(estudiante).size();
				if(estudProm.containsKey(promTot)) {
					List<String> listaProm = estudProm.get(promTot);
					listaProm.add(estudiante);
				}
				else {
					List<String> listaProm = new ArrayList<>();
					listaProm.add(estudiante);
					estudProm.put(promTot, listaProm);
				}
			}
			return estudProm;
		}

	public static void mostrarPromedio(Map<Integer, List<String>> regEstud) {

		for (Integer promedio : regEstud.keySet()) {
			System.out.println(promedio);
			for (String estudiante : regEstud.get(promedio)) {
				System.out.println(estudiante);
			}
		}

	}
}

