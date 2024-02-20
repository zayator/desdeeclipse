package objetos;

import java.util.ArrayList;

import java.util.List;

import utilidades.copy.Entrada;

public class listas {
	private static List<Integer> extraerPares(List<Integer> al) {
		List<Integer> pares = new ArrayList<Integer>();
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 == 0) {
				pares.add(al.get(i));
			}
		}
		return pares;
	}

	private static List<Integer> extraerImpares(List<Integer> al) {
		List<Integer> impares = new ArrayList<Integer>();
		for (int i = 0; i < al.size(); i++) {
			if (!(al.get(i) % 2 == 0)) {
				impares.add(al.get(i));
			}
		}
		return impares;
	}

	private static void multiplicarLista(List<Integer> al, int multiplo) {
		for (int i = 0; i < al.size(); i++) {
			al.set(i, (al.get(i) * multiplo));
		}
	}

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>(10);
		boolean salida = false;
		String t;
		// Pedir numeros
		while (!salida) {
			System.out.println("Introduzca un numero (presione enter para terminar)");
			t = Entrada.cadena();
			salida = t.equals("");
			if (!salida) {
				int n = Integer.valueOf(t);
				al.add(n);
			al.remove(n);
			}
		}

		// Mostrar el ArrayList
		System.out.println("Los numeros pares son: " + extraerPares(al));
		System.out.println("Los numeros impares son: " + extraerImpares(al));
		multiplicarLista(al, 3);
		System.out.println("Lista multiplicada: "+ al);
	}

}
