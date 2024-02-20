package pruebas;

import utilidades.copy.Entrada;

public class examenivan {
	public static void main(String[] args) {
		System.out.println("Introduzca numero de aciertos");
		double aciertos = Entrada.entero();
		System.out.println("Introduzca numero de fallos");
		double fallos = Entrada.entero();
		aciertos = aciertos * 0.3448275862;
		fallos = fallos * 0.3448275862 / 2;
		System.out.println("");
		System.out.println("La suma de aciertos es : " + aciertos);
		System.out.println("La suma de fallos es : " + fallos);
		System.out.println("");
		System.out.println("Su nota es " + (aciertos - fallos));

	}
}

//hay 29 preguntas 
//cada fallo resta 2,9/2
//en blanco ni suma ni resta
//cada acierto suma 2,9
//para que puntue sobre 10 cada pregunta tiene que ser 0.3448275862