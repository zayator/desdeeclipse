package objetos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import utilidades.copy.StdDraw;

public class DosCirculosMoviendose {

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
		Random r = new Random();
		List<Punto> p = new ArrayList<Punto>();

		for (int i = 0; i < 8; i++) {
			p.add(new Punto(-95 + (i), 95));

			p.get(i).setMovX(r.nextInt(1, 10));
			p.get(i).setMovX(r.nextInt(1, 10));
			Color cl = new Color((r.nextInt(256)), (r.nextInt(256)), (r.nextInt(256)));
			p.get(i).setColor(cl);
		}
		int cnt = 0;
		long inicio = System.currentTimeMillis();
		Long tiempo = (long) 1.0;
		boolean empezar = false;
		// int choques = 0;
		double rad = r.nextInt(2, 20);
		while (true) {
			long actual = System.currentTimeMillis();
			StdDraw.enableDoubleBuffering();
			StdDraw.clear();

			for (int i = 0; i < p.size(); i++) {
				if (p.get(i) != null) {
					if (p.get(i).getX() >= 95 && p.get(i).getY() <= -95) {
						p.get(i).setMovX(-(r.nextInt(1, 3)));
						p.get(i).setMovY(0);
						p.get(i).setX(95);
						p.get(i).setY(-95);
					}
					if (p.get(i).getX() >= 95 && p.get(i).getY() >= 95) {
						p.get(i).setMovX(0);
						p.get(i).setMovY(-(r.nextInt(1, 3)));
						p.get(i).setX(95);
						p.get(i).setY(95);
					}

					if (p.get(i).getX() <= -95 && p.get(i).getY() >= 95) {
						p.get(i).setMovX(r.nextInt(1, 3));
						p.get(i).setMovY(0);
						p.get(i).setX(-95);
						p.get(i).setY(95);
					}
					if (p.get(i).getX() <= -95 && p.get(i).getY() <= -95) {
						p.get(i).setMovX(0);
						p.get(i).setMovY(r.nextInt(1, 3));
						p.get(i).setX(-95);
						p.get(i).setY(-95);
					}
				}
			}
			// dibujar el array de puntos
			for (int i = 0; i < p.size(); i++) {
				if (p.get(i) != null) {
					Circulo C = new Circulo(p.get(i), rad);
					C.dibujar();
					p.get(i).mover();
				}
			}
			// contador
			if (tiempo > 0) {
				StdDraw.setPenColor(Color.black);
				actual = (inicio - actual) * 1000;
				tiempo = (actual / 1000000) + 5;
				StdDraw.text(0, 0, "Empieza en : " + tiempo);
			} else {
				empezar = true;
				StdDraw.setPenColor(Color.black);
				StdDraw.text(0, 0, "YAA!!");
			}

			// empezar

			// se han chocado
			if (empezar) {
				for (int i = p.size() - 1; i >= 1; i--) {
					for (int j = i - 1; j >= 0; j--) {
						if (i < p.size() && (p.get(i).getX() == p.get(j).getX())
								&& (p.get(i).getY() == p.get(j).getY())) {
							p.remove(i);
							p.remove(j);
						}

					}

				}
				for (int i = 0; i < p.size(); i++) {
					cnt = 0;
					if (p.get(i) == null) {

						cnt++;
					}
					if (cnt == p.size())
						System.exit(1);

				}
			}

			if(p.size()<=1) {
				StdDraw.clear();
				StdDraw.setPenColor(Color.red);
				StdDraw.text(0, 0, "Fin del juego");
				Thread.sleep(3000);
				System.exit(2);
			}
			StdDraw.pause(2);
			StdDraw.show();

		}

	}

}
