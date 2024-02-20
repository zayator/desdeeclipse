package objetos;

import java.util.ArrayList;
import java.util.List;

public class Probarcosas {
	public static void duplicar(int n) {
		n = n * 2;
		System.out.println(n);
	}

	public static void main(String[] args) {
		Circulo c1 = new Circulo(4, 4, 8);
		Circulo c2 = new Circulo(4, 4, 5);
		Circulo c3 = new Circulo(4, 4, 8);

		List<Circulo> al = new ArrayList<Circulo>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(new Circulo(8, 8, 9));
		al.add(0, new Circulo(9, 9, 9));

		System.out.println("Circulos en la lista:" + al.size());
		System.out.println(al);
	}

}
