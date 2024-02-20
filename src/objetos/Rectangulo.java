
package objetos;

import java.awt.Color;
import java.util.Objects;

import utilidades.copy.StdDraw;

public class Rectangulo {
	private int base;
	private int altura;
	private Punto centro;

	// getters y seters
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		if (base < 0)
			throw new IllegalArgumentException("La base tiene que ser >= 0");

		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		if (altura < 0)
			throw new IllegalArgumentException("La altura tiene que ser >= 0");
		this.altura = altura;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	// constructores
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
		setBase(base);
		setAltura(altura);
		centro = new Punto();
		centro.setX(0);
		centro.setY(0);
	}

	public Rectangulo(int base, int altura, Punto centro) {
		super();
		this.base = base;
		this.altura = altura;
		this.centro = centro;
		setBase(base);
		setAltura(altura);
	}
	public Rectangulo(int base, int altura, Punto centro,Color color) {
		super();
		this.base = base;
		this.altura = altura;
		this.centro = centro;
		centro.setColor(color);
		setBase(base);
		setAltura(altura);
	}
	public Rectangulo(int base, int altura, Color color) {
		super();
		this.base = base;
		this.altura = altura;
		centro.setColor(color);
		setBase(base);
		setAltura(altura);
	}

	public Rectangulo(int base, int altura, double x, double y) {
		super();
		this.base = base;
		this.altura = altura;
		setBase(base);
		setAltura(altura);
		Punto centro = new Punto(x, y);
		this.centro = centro;
	}

	// ToString
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", centro=" + centro.getX() + " , " + centro.getY()
				+ "]";
	}

	// .equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		return altura == other.altura && base == other.base && Objects.equals(centro, other.centro);
	}

	// funciones
	public static double area(Rectangulo a) {
		double area = 0;
		area = a.getAltura() * a.getBase();
		return area;
	}
		
		//Dibujar
	public void dibujar(Rectangulo a) {
		StdDraw.rectangle(a.getCentro().getX(), a.getCentro().getY(), (a.getBase() / 2), (a.getAltura() / 2));
	}
	public static void dibujar(Rectangulo a,Boolean relleno) {
		if (relleno==true)
		StdDraw.filledRectangle(a.getCentro().getX(), a.getCentro().getY(), (a.getBase() / 2), (a.getAltura() / 2));
		else
			StdDraw.rectangle(a.getCentro().getX(), a.getCentro().getY(), (a.getBase() / 2), (a.getAltura() / 2));
	}
	public static void dibujar(Rectangulo a,Boolean relleno,Color color) {
		StdDraw.setPenColor(color);
		if (relleno==true)
		StdDraw.filledRectangle(a.getCentro().getX(), a.getCentro().getY(), (a.getBase() / 2), (a.getAltura() / 2));
		else
			StdDraw.rectangle(a.getCentro().getX(), a.getCentro().getY(), (a.getBase() / 2), (a.getAltura() / 2));
	}
	public static void dibujar(Rectangulo a,Double radio ) {	
		StdDraw.setPenRadius(radio);
		StdDraw.rectangle(a.getCentro().getX(), a.getCentro().getY(), (a.getBase() / 2), (a.getAltura() / 2));
}
	public static void dibujar(Rectangulo a,Double radio ,Color color) {	
		StdDraw.setPenRadius(radio);
		StdDraw.setPenColor(color);
		StdDraw.rectangle(a.getCentro().getX(), a.getCentro().getY(), (a.getBase() / 2), (a.getAltura() / 2));
}

	
		//Puntos
	public static Punto InfDer(Rectangulo a) {
		Punto p = new Punto((a.getCentro().getX()+(a.getBase() / 2)),((a.getCentro().getY())-(a.getAltura() / 2)));
		return p;
	}
	public static Punto SupDer(Rectangulo a) {
		Punto p = new Punto((a.getCentro().getX()+(a.getBase() / 2)),((a.getCentro().getY()+(a.getAltura() / 2))));
		return p;
	}
	public static Punto SupIzq(Rectangulo a) {
		Punto p = new Punto(((a.getCentro().getX()-(a.getBase() / 2))),(a.getCentro().getY()+(a.getAltura() / 2)));
		return p;
	}
	public static Punto InfIzq(Rectangulo a) {
		Punto p = new Punto(((a.getCentro().getX()-(a.getBase() / 2))),(a.getCentro().getY()-(a.getAltura() / 2)));
		return p;
	}
	public static Punto InfCentro(Rectangulo a) {
		Punto p = new Punto(a.getCentro().getX(),(a.getCentro().getY()-(a.getAltura() / 2)));
		return p;
	}
	public static Punto SupCentro(Rectangulo a) {
		Punto p = new Punto(a.getCentro().getX(),(a.getCentro().getY()+(a.getAltura() / 2)));
		return p;
	}
	public static Punto CentroDer(Rectangulo a) {
		Punto p = new Punto(a.getCentro().getX()+(a.getBase()/2),a.getCentro().getY());
		return p;
	}
	public static Punto CentroIzq(Rectangulo a) {
		Punto p = new Punto(a.getCentro().getX()-(a.getBase()/2),a.getCentro().getY());
		return p;
	}
}
