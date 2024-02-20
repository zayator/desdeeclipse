package objetos;

public class Persona {
	private String nombre;
	private double altura;// Altura en metros
	private int edad;

	// to string
	@Override
	public String toString() {
		return "Persona: " + nombre + " , " + altura + " metros" + " , " + edad + " años";

	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0 || altura > 3)
			throw new IllegalArgumentException("La altura debe ser positiva e inferior a 4 metros");
		this.altura = altura;
	}

	public int getEdad() {
		if (edad < 0)
			throw new IllegalArgumentException("La edad no puede ser menor que 0");
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// constructores
	public Persona(String nombre, double altura, int edad) {
		super();
		setNombre(nombre);
		setAltura(altura);
		setEdad(edad);
	}

	public Persona() {
		super();
		this.nombre = "nombre";
		this.altura = 1;
		this.edad = 20;
	}

}
