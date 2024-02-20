package objetos;

import java.awt.Color;

import utilidades.copy.StdDraw;

public class DosPuntosMoviendose {
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

	public static boolean estaEnSupDer(Punto p, double limiteCercania) {
		Punto verticeSupDer = new Punto(100, 100);
		double d = p.distancia(verticeSupDer);
		return d < limiteCercania;
	}

	public static boolean estaEnSupIzq(Punto p, double limiteCercania) {
		Punto verticeSupDer = new Punto(-100, 100);
		double d = p.distancia(verticeSupDer);
		return d < limiteCercania;
	}

	public static boolean estaEnInfDer(Punto p, double limiteCercania) {
		Punto verticeSupDer = new Punto(100, -100);
		double d = p.distancia(verticeSupDer);
		return d < limiteCercania;
	}

	public static boolean estaEnInfIzq(Punto p, double limiteCercania) {
		Punto verticeSupDer = new Punto(-100, -100);
		double d = p.distancia(verticeSupDer);
		return d < limiteCercania;
	}

	public static void main(String[] args) throws InterruptedException {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		// punto 1
		Punto p1 = new Punto();
		p1=p1.puntoRandom(Color.red);
		p1.setMovX(1);
		p1.setMovY(1);
		// punto 2
		Punto p2 = new Punto();
		p2=p2.puntoRandom(Color.blue);
		p2.setMovX(1);
		p2.setMovY(-1);
		int choques = 0;
		while (true) {
			StdDraw.enableDoubleBuffering();
			StdDraw.clear();
			//pintarejes();
			// moverse en cuadrados el p1 , sentido contrario a las agujas del reloj
			if (p1.getX() >= 95 && p1.getY() <= -95) {
				p1.setMovX(0);
				p1.setMovY(1);
				p1.setX(95);
				p1.setY(-95);
			}
			if (p1.getX() >= 95 && p1.getY() >= 95) {
				p1.setMovX(-1);
				p1.setMovY(0);
				p1.setX(95);
				p1.setY(95);
			}

			if (p1.getX() <= -95 && p1.getY() >= 95) {
				p1.setMovX(0);
				p1.setMovY(-1);
				p1.setX(-95);
				p1.setY(95);
			}
			if (p1.getX() <= -95 && p1.getY() <= -95) {
				p1.setMovX(1);
				p1.setMovY(0);
				p1.setX(-95);
				p1.setY(-95);
			}

			// mover en cuadros el p2 , sentido de las agujas del reloj
			if (p2.getX() >= 95 && p2.getY() <= -95) {
				p2.setMovX(-1);
				p2.setMovY(0);
				p2.setX(95);
				p2.setY(-95);
			}
			if (p2.getX() >= 95 && p2.getY() >= 95) {
				p2.setMovX(0);
				p2.setMovY(-1);
				p2.setX(95);
				p2.setY(95);
			}

			if (p2.getX() <= -95 && p2.getY() >= 95) {
				p2.setMovX(1);
				p2.setMovY(0);
				p2.setX(-95);
				p2.setY(95);
			}
			if (p2.getX() <= -95 && p2.getY() <= -95) {
				p2.setMovX(0);
				p2.setMovY(1);
				p2.setX(-95);
				p2.setY(-95);
			}
			// se han chocado
			if (p1.getX() == p2.getX() && p1.getY() == p2.getY())
				choques++;
			if (choques == 20) {
				p1.setMovX(0);
				p1.setMovY(0);
				p2.setMovX(0);
				p2.setMovY(0);
				StdDraw.clear();
				StdDraw.text(0, 10, "Fin del juego");
				StdDraw.text(0, 0, "Han chocado " + choques + " veces");
				StdDraw.show();
				Thread.sleep(3000);
				System.exit(1);
			}
			StdDraw.text(50, 5, "Han chocado " + choques + " veces");
			p1.dibujar();
			p1.mover();
			p2.dibujar();
			p2.mover();
			StdDraw.pause(1);
			StdDraw.show();

		}

		/*
		 * for (int i = 0; i < 200; i++) { StdDraw.enableDoubleBuffering();
		 * StdDraw.clear(); pintarejes(); p1.dibujar(); p1.mover(); p2.dibujar();
		 * p2.mover(); StdDraw.pause(50); StdDraw.show(); } p1.setMovX(-1);
		 * p1.setMovY(-1); p2.setMovX(-1); p2.setMovY(1); for (int i = 0; i < 200; i++){
		 * StdDraw.enableDoubleBuffering(); StdDraw.clear(); pintarejes(); p1.dibujar();
		 * p1.mover(); p2.dibujar(); p2.mover(); StdDraw.pause(50); StdDraw.show(); }
		 */
	}

}
