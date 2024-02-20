package pruebas;

import java.util.Random;

public class caracruz {

	public static void main(String[] args) {
		Random r = new Random();
		int n, cara, cruz;
		cara = 0;
		cruz = 0;
		System.out.println("TIRAS UNA MONEDA AL AIRE:");
		for (int a = 0; a < 1000000; a++) {

			for (int i = 0; i < 20; i++) {
				n = r.nextInt(2);

				if (n < 1) {
					cara = cara + 1;
				} else {
					cruz = cruz + 1;
				}

			}
		}
		System.out.println("");
		System.out.println("HAS OBTENIDO " + cara + " CARAS Y " + cruz + " CRUCES");
	}

}
