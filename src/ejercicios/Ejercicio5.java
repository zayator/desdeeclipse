package ejercicios;

import java.util.ArrayList;

public class Ejercicio5 {
	public static void main(String[] args) {
		ArrayList<String> listDias = new ArrayList<>();
		listDias.add("Lunes");
		listDias.add("Martes");
		listDias.add("Miercoles");
		listDias.add("Jueves");
		listDias.add("Viernes");
		listDias.add("Sabado");
		listDias.add("Domingo");
		listDias.set(3, "Juernes");

		ArrayList<String> listDos = new ArrayList<>();
		for (int i = 0; i < listDias.size(); i++) {
			listDos.add(listDias.get(i));

		}
		System.out.println(listDos);

		System.out.println(listDias);

	}
}
