package ejercicios;

import java.util.ArrayList;

import utilidades.copy.Entrada;

public class Ejercicio3 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Introduzca 5 numeros enteros");
		for (int i = 0; i < 5; i++) {
			al.add(Entrada.entero());
			if (i < 4)
				System.out.println("Introduzca el siguiente numero");
		}
		// ordenar
		int a;
		for (int i = 1; i < al.size() - 1; i++) {
			for (int j = 0; j < al.size() - 1; j++) {
				if (al.get(j) > al.get(j + 1)) {
					a = al.get(j);
					al.set(j, al.get(j + 1));
					al.set((j + 1), a);
				}

			}
		}
		// mostrar
		System.out.println("");
		System.out.println("Los numeros ordenados son: " + al);

	}

}
