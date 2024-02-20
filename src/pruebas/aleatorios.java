package pruebas;

import java.util.Random;

public class aleatorios {

	public static void main(String[] args) {

		Random r = new Random();
		int n;
		n = r.nextInt(6); // se va a sustituir n por un valor aleatorio entre 0 o 5
		for (int i = 0; i < 3; i++) {
			n = r.nextInt(3);
			switch (n) {
			case 0:
				System.out.println("Piedra");
				break;
			case 1:
				System.out.println("Papel");
				break;
			case 2:
				System.out.println("Tijera");
				break;

			}
		}
		System.out.print(n);
	}
}
