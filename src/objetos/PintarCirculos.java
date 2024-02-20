package objetos;

import java.awt.Color;

import utilidades.copy.StdDraw;

public class PintarCirculos {

	public static void main(String[] args) {
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);

		Punto c = new Punto(4, 5);
		c.setColor(Color.cyan);
		Circulo c1 = new Circulo(c, 12);
		Circulo c2 = new Circulo(50, 50, 10);
		c2.getCentro().setColor(Color.pink);

		c1.dibujar();
		c2.dibujar(0.005);
	}
}