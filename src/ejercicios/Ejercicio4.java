package ejercicios;

import java.util.ArrayList;

import utilidades.copy.Entrada;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 4 Realiza un programa equivalente al anterior, pero en esta ocasión
		 * el programa debe ordenar palabras en lugar de números. Se mostrará la lista
		 * de palabras ordenada. Se borrarán las palabras de la lista que contengan la
		 * letra M (mayúscula o minúscula). Volver a mostrar la lista tras el borrado.
		 */

		// leer
		ArrayList<String> al = new ArrayList<>();
		System.out.println("Introduzca 5 palabras");
		for (int i = 0; i < 5; i++) {
			al.add(Entrada.cadena().toLowerCase());
			if (i < 4)
				System.out.println("Introduzca la siguiente palabra");
		}
		// mostrar lista previa
		al.sort(null);
		System.out.println("La lista ordenada es: " + al);

		// excluir las palabras con m
		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j < (al.get(i)).length(); j++) {
				int cnt = 0;
				if (al.get(i).charAt(j) == 'm') {
					al.remove(i);
					if (cnt == 1)
						i--;
				}
			}
		}

		// ordenar y mostrar

		al.sort(null);
		System.out.println("La lista ordenada sin palabras que contengan m :" + al);

	}

}
