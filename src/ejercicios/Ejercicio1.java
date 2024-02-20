package ejercicios;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nombres = new ArrayList<>();
	        nombres.add("Juan");
	        nombres.add("Maria");
	        nombres.add("Pedro");
	        nombres.add("Ana");
	        nombres.add("Luis");
	        nombres.add("Elena");

	        // Mostrar los nombres por pantalla utilizando un bucle for
	        for (String nombre : nombres) {
	            System.out.println(nombre);
	        }
	}

}
