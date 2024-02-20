package objetos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import utilidades.copy.Entrada;
import utilidades.copy.StdDraw;

public class EjercicioRectangulos {
	public static void pintarejes() {
		int cnt = 0;
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(-100, 0, 100, 0);
		// x0 y0 hasta x1 y1
		StdDraw.line(0, -100, 0, 100);
		StdDraw.text(2, 98, "y");
		StdDraw.text(98, 2, "x");
		// eje y
		for (int i = 0; i < 100; i++) {
			if (cnt == 5) {
				StdDraw.line(1, i, -1, i);
				cnt = 0;
			}
			cnt++;
		}
		for (int i = 0; i > -100; i--) {
			if (cnt == 5) {
				StdDraw.line(1, i, -1, i);
				cnt = 0;
			}
			cnt++;
		}
		// eje x
		for (int i = 0; i < 100; i++) {
			if (cnt == 5) {
				StdDraw.line(i, 1, i, -1);
				cnt = 0;
			}
			cnt++;
		}
		for (int i = 0; i > -100; i--) {
			if (cnt == 5) {
				StdDraw.line(i, 1, i, -1);
				cnt = 0;
			}
			cnt++;
		}
	}

	private static void pausa() throws InterruptedException {
		Thread.sleep(2);
		StdDraw.clear();
		pintarejes();
		StdDraw.setPenColor(Color.black);
		StdDraw.setPenRadius(0.005);
		StdDraw.show();
	}

	private static void randomPenCol() {
		Punto p = new Punto();
		p.setColor(p.colorAleatorio());
		StdDraw.setPenColor(p.getColor());
	}

	public static void main(String[] args) throws InterruptedException {
		StdDraw.setScale(-100, 100);

		// Introducir cantidad de rectangulos
		Rectangulo r = new Rectangulo(5, 5);
		List<Rectangulo> al = new ArrayList<Rectangulo>();
		System.out.println("Cuantos rectángulos quieres dibujar?");
		int cant = Entrada.entero();

		for (int i = 0; i < cant; i++) {
			Rectangulo r2 = new Rectangulo(r.getBase() + ((200 / cant) * i), r.getAltura() + ((200 / cant) * i));
			al.add(i, r2);
		}

		do {
			pausa();

			// dibujar la "expansion"
			for (int i = 0; i < cant; i++) {
				randomPenCol();
				r.dibujar(al.get(i));
				Thread.sleep(50);
			}

			pausa();

			// dibujar la "disminucion"
			for (int i = cant - 1; i >= 0; i--) {
				randomPenCol();
				r.dibujar(al.get(i));
				Thread.sleep(50);
			}
			Thread.sleep(2);
		} while (true);

	}

}
