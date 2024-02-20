package dubijos;

import java.awt.Color;

import objetos.Punto;
import utilidades.copy.StdDraw;

public class dibujos {
	public static double redondear(double numRedon, int decimales) {
		double factor = Math.pow(10, decimales);
		double redondeo = Math.round(numRedon * factor);
		return redondeo / factor;
	}

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

	public static void clicks() {
		int cnt = 0;
		boolean salida = false;
		StdDraw.enableDoubleBuffering();
		do {
			if (StdDraw.isMousePressed()) {
				while (!salida) {
					StdDraw.clear();
					cnt++;
					String posRaton = "Numero de clicks: " + cnt;
					StdDraw.text(60, 60, posRaton);
					StdDraw.show();
					salida = true;
				}
			} else
				salida = false;

		} while (true);
	}

	public static void cordenadasraton() {
		StdDraw.enableDoubleBuffering();
		while (true) {

			StdDraw.clear();
			pintarejes();
			double xraton = StdDraw.mouseX();
			double yraton = StdDraw.mouseY();
			String posRaton = "(" + xraton + "," + yraton + ")";

			if (StdDraw.isMousePressed())
				StdDraw.point(xraton, yraton);
			else
				posRaton += "no pulsado";

			StdDraw.text(xraton, yraton, posRaton);
			StdDraw.show();
		}
	}

	public static void pintar() {
		StdDraw.enableDoubleBuffering();
		while (true) {

			if (StdDraw.isMousePressed()) {
				double xraton = StdDraw.mouseX();
				double yraton = StdDraw.mouseY();
				StdDraw.point(xraton, yraton);
				StdDraw.show();
			}

		}
	};

	public static void main(String[] args) {
		// ejes y demas
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		StdDraw.setPenRadius(0.025);
		StdDraw.setPenColor(StdDraw.MAGENTA);

		pintarejes();
		// puntos
		Punto p1 = new Punto().puntoRandom();
		Punto p2 = new Punto().puntoRandom();
		Punto p3 = new Punto();
		p3 = p1.puntoMedio(p2);

		// dibujar puntos
		p1.dibujar(Color.orange, 0.025);
		p3.dibujar(Color.pink, 0.025);
		p2.dibujar(Color.orange, 0.025);
		StdDraw.setPenColor(StdDraw.BLACK);
		p1.nombre("p1");
		p2.nombre("p2");
		p3.nombre("pM");

		// escribir distancia
		StdDraw.text(50.0, 50.0, " La distancia es: " + redondear(p1.distancia(p2), 3));
		StdDraw.setPenRadius(0.005);
		StdDraw.line(p1.getX(), p1.getY(), p2.getX(), p2.getY());

	}
}
