package excepciones;

import utilidades.copy.Entrada;

public class validarDNI {
	public static String validarMatricula(String mat) {
		char[] letras = { 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'P', 'Q', 'R', 'S', 'T', 'V', 'W',
				'X', 'Y', 'Z' };
		if (mat == null)
			return null;
		String normalizado = mat.trim().toUpperCase();
		if(normalizado.matches("[0-9]{4}[B-DF-HJ-]")) {}
		
		
		
		return "a";
	}

//1º validar la longitud
	// comprobar si es nie o dni
	// añadir 0 en los necesarios
	public static void main(String[] args) {
		while (true) {
			System.out.println("Introduzca una matricula");
			String t = Entrada.cadena();
			System.out.println("");

			if (t.matches("\b.{1,7}")) {
				System.out.println("Espacio");
			} else {
				System.out.println("no espacio");
			}
		}
	}

}
