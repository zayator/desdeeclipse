package objetos;

import java.awt.Color;
import java.util.Objects;
import java.util.Random;

import utilidades.copy.StdDraw;

public class Punto {
	private double x;// atributos de una clase
	private double y;
	private Color color;
	private double movX;
	private double movY;

	// equals
	boolean equals(Punto otro) {
		return x == otro.x && y == otro.y;
	}

	// funciones
	public void dibujar(Color c, double radio) {
		StdDraw.setPenColor(c);
		StdDraw.setPenRadius(radio);
		StdDraw.point(x, y);

	}

	public void dibujar() {
		if (color == null)
			dibujar(StdDraw.BLACK, 0.02);
		else
			dibujar(color, 0.02);
	}

	public double distancia(Punto p) {
		double distancia;
		distancia = Math.sqrt(((x - p.x) * (x - p.x)) + ((y - p.y) * (y - p.y)));
		return distancia;
	}

	public Punto puntoMedio(Punto p) {
		Punto pmedio = new Punto(((x + p.x) / 2), (((y + p.y) / 2)));
		return pmedio;
	}

	public void nombre(String nombrepunto) {
		StdDraw.text(x + 10, y, nombrepunto);
	}

	public Punto puntoRandom() {
		Random r = new Random();
		double x = r.nextDouble(200);
		double y = r.nextDouble(200);
		if (x > 100)
			x = -(x - 100);
		if (y > 100)
			y = -(y - 100);
		Punto p = new Punto(x, y);
		return p;
	}

	public Punto puntoRandom(Color color) {
		Random r = new Random();
		double x = r.nextDouble(200);
		double y = r.nextDouble(200);
		if (x > 100)
			x = -(x - 100);
		if (y > 100)
			y = -(y - 100);
		Punto p = new Punto(x, y, color);
		return p;
	}

	public void mover() {
		x = x + movX;
		y = y + movY;
	}

	public Color colorAleatorio() {
		Random r = new Random();
		Color cl = new Color((r.nextInt(256)), (r.nextInt(256)), (r.nextInt(256)));

		return cl;
	}

	// getters
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getMovX() {
		return movX;
	}

	public void setMovX(double movX) {
		this.movX = movX;
	}

	public double getMovY() {
		return movY;
	}

	public void setMovY(double movY) {
		this.movY = movY;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// toString
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + ", color=" + color + ", movX=" + movX + ", movY=" + movY + "]";
	}

	// constructores
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
		this.color = Color.black;
	}

	public Punto() {
		super();
		x = 1;
		this.y = 1;
	}

	public Punto(double x, double y, Color color, double movX, double movY) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
		this.movX = movX;
		this.movY = movY;
	}

	public Punto(double x, double y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}


	// hashcode

	public int hashCode() {
		return Objects.hash(color, movX, movY, x, y);
	}

//equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Objects.equals(color, other.color)
				&& Double.doubleToLongBits(movX) == Double.doubleToLongBits(other.movX)
				&& Double.doubleToLongBits(movY) == Double.doubleToLongBits(other.movY)
				&& Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

}
