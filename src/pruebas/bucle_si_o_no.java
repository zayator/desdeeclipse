package pruebas;

import utilidades.copy.Entrada;

public class bucle_si_o_no {

	public static void main(String[] args) {
		boolean error;
		error = false;
		String decision;

///////////////////////////////////////////////////////////////////////////////////////
		System.out.println("¿QUIERES ?");
		System.out.print(">");
		decision = Entrada.cadena().toLowerCase();
		if (decision.equals("si") || decision.equals("no")) {
			error = false;
		} else {
			error = true;
		}
		if (!error) {
			if (decision.equals("si")) {
				
			}
			if (decision.equals("no")) {
			}
		}
		while (error) {
			System.out.println("¿QUIERES ?");
			System.out.print(">");
			decision = Entrada.cadena().toLowerCase();
			if (decision.equals("si")) {
				error = false;
			}
			if (decision.equals("no")) {
				error = false;
			}
		}
///////////////////////////////////////////////////////////////////////////////////////
		System.out.println("VALE");
	}
}
