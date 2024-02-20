package pruebas;

import java.util.Random;

import utilidades.copy.Entrada;

public class funciones {
	private static double sumar(double n1, double n2) {
		double suma = n1 + n2;
		return suma;
	}

	private static double restar(double n1, double n2) {
		double resta = n1 - n2;
		return resta;
	}

	private static double multiplicar(double n1, double n2) {
		double multiplicacion = n1 * n2;
		return multiplicacion;
	}

	private static double dividir(double n1, double n2) {
		double division = n1 / n2;
		return division;
	}

	public static int random(int r1) {
		Random r = new Random();
		int n;
		n = r.nextInt(r1);
		return n;
	}

	private static double areatriangulo(double base, double altura) {
		double area = (base * altura) / 2;
		return area;
	}

	private static void saludar(String nombre, int cantidad) {
		for (int i = 0; i < cantidad; i++) {

			System.out.println("hola");

			System.out.println(nombre);

			System.out.println("adios");
			System.out.println("");

		}
	}

	private static void mostrararray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	private static int[] ordenararray(int[] a) {
		int n;
		int[] ord = new int[a.length];
		for (int i = 0; i < ord.length; i++) {
			ord[i] = a[i];
		}
		for (int i = 1; i < ord.length - 1; i++) {
			for (int j = 0; j < ord.length - i; j++) {
				if (ord[j] > ord[j + 1]) {
					n = ord[j];
					ord[j] = ord[j + 1];
					ord[j + 1] = n;
				}
			}
		}
		return ord;
	}

	public static double redondear(double numRedon, int decimales) {
		double factor = Math.pow(10, decimales);
		double redondeo = Math.round(numRedon * factor);
		return redondeo / factor;
	}

	private static char[] ordenararray(char[] a) {
		char n;
		char[] ord = new char[a.length];
		for (int i = 0; i < ord.length; i++) {
			ord[i] = a[i];
		}
		for (int i = 1; i < ord.length - 1; i++) {
			for (int j = 0; j < ord.length - i; j++) {
				if (ord[j] > ord[j + 1]) {
					n = ord[j];
					ord[j] = ord[j + 1];
					ord[j + 1] = n;
				}
			}
		}
		return ord;
	}

	private static String[] ordenararray(String[] a) {
		String[] ord = new String[a.length];
		String n;
		for (int i = 0; i < ord.length; i++) {
			ord[i] = a[i];
		}
		for (int i = 1; i < ord.length - 1; i++) {
			for (int j = 0; j < ord.length - i; j++) {
				if (ord[j].compareTo(ord[j + 1]) > 0) {
					n = ord[j];
					ord[j] = ord[j + 1];
					ord[j + 1] = n;
				}
			}
		}

		return ord;
	}

	public static void main(String[] args) {
		int a[] = { 1, 6, -3, 7, 9, 0, 4, 02, 5, 3, 21, 34, 231, 12, 43, 11, 4, 0, -1 };
		mostrararray(a);
		System.out.println("");
		mostrararray(ordenararray(a));
		System.out.println("");
		char c[] = { 'A', 'b', 'a', 'C', 'z', '>', 'Z', '+' };
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println("");
		c = ordenararray(c);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

	}
}
