package objetos;

import utilidades.copy.Entrada;

public class ArraylistEjercicio {

	public static void main(String[] args) {
		try {
		System.out.println("Introduzca un numero");
		int n = Entrada.entero();
		System.out.println("El numero introducido es: " + n);
		} catch(NumberFormatException e) {
			//manejador
			System.out.println("Error");
		}
		System.out.println("Adios");
	}

}
