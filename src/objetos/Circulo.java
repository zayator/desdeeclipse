package objetos;

import java.util.Objects;

import utilidades.copy.StdDraw;

public class Circulo {
	private Punto centro;
	private double radio;

	// funciones
	public void dibujar() {
		StdDraw.setPenColor(centro.getColor());
		StdDraw.filledCircle(centro.getX(), centro.getY(), radio);

	}

	public void dibujar(double contorno) {
		StdDraw.setPenColor(centro.getColor());
		StdDraw.setPenRadius(contorno);
		StdDraw.circle(centro.getX(), centro.getY(), radio);

	}

	public boolean seSuperpone(Circulo c) {
		return this.centro.distancia(c.getCentro()) < this.radio + c.getRadio();
	}
	// getters y setters

	public double getRadio() {
		return radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		if (centro == null)
			throw new IllegalArgumentException("El centro no puede ser nulo");
		this.centro = centro;
	}

	public void setRadio(double radio) {
		if (radio <= 0)
			throw new IllegalArgumentException("El radio no puede ser 0 o menor");
		this.radio = radio;
	}

	// toString
	public String toString() {
		return "Circulo [centro=" + centro + ", radio=" + radio + "]";
	}

	// constructores
	public Circulo(Punto p, double radio) {
		centro = p;
		this.radio = radio;
	}

	public Circulo(double x, double y, double radio) {
		this(new Punto(x, y), radio);
	}

	public Circulo() {
		this(new Punto(0, 0), 1);
	}

	// HashCode
	public boolean equals(Circulo otro) {
		return radio == otro.radio && centro.equals(otro.centro);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Objects.equals(centro, other.centro)
				&& Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}

}
