package excepciones;

import utilidades.copy.Entrada;

public class ConceptosBasicos {

	public static void main(String[] args) {
		boolean salida=false;
		do {
			try {
				System.out.println("Introduzca un numero");
				int n = Entrada.entero();
				System.out.println("El numero introducido es: " + n);
				salida=true;
			} catch (NumberFormatException e) {
				// manejador
				System.out.print("ERROR,");
			}
		} while (!salida);
		System.out.println("Adios");
	}
}
// una expresion que coja cualquier palabra que contenga mar (en minuscula)
