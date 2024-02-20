package ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random r = new Random();

		int longitud = r.nextInt(11) + 10;
		int valores;

		for (int i = 0; i < longitud; i++) {
			valores = r.nextInt(101);
			numeros.add(valores);
		}

		// suma
		int suma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			suma = suma + numeros.get(i);
		}
		// media
		int media;
		media = suma / numeros.size();

		// maximo
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) > max)
				max = numeros.get(i);
		}

		// minimo
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) < min)
				min = numeros.get(i);
		}

		System.out.println("Los elementos son :" + numeros);
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
		System.out.println("El maximo es: " + max);
		System.out.println("El minimo es: " + min);

	}

}
