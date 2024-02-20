package clicker;

import utilidades.copy.StdDraw;

public class Juego {
	private static boolean segundo(int i) {
		boolean esta = false;
		if (i == 36 || i == 36 * 2 || i == 36 * 3 || i == 36 * 4 || i == 36 * 5 || i == 36 * 6 || i == 36 * 7
				|| i == 36 * 8 || i == 36 * 9 || i == 36 * 10)
			esta = true;
		return esta;
	}

	private static void dibujarClickers(int mouse, int i) {
		switch (mouse) {
		case 0:
			StdDraw.picture(0, 10, "imagenes/manos0.png", 230, 190, -i);

			break;
		case 1:
			StdDraw.picture(0, 10, "imagenes/manosI.png", 230, 190, -i);
			break;
		case 2:
			StdDraw.picture(0, 10, "imagenes/manosII.png", 230, 190, -i);
			break;
		case 3:
			StdDraw.picture(0, 10, "imagenes/manosIII.png", 230, 190, -i);
			break;
		case 4:
			StdDraw.picture(0, 10, "imagenes/manosIV.png", 230, 190, -i);
			break;
		case 5:
			StdDraw.picture(0, 10, "imagenes/manosV.png", 230, 190, -i);
			break;
		case 6:
			StdDraw.picture(0, 10, "imagenes/manosVI.png", 230, 190, -i);
			break;
		case 7:
			StdDraw.picture(0, 10, "imagenes/manosVII.png", 230, 190, -i);
			break;
		case 8:
			StdDraw.picture(0, 10, "imagenes/manosVIII.png", 230, 190, -i);
			break;
		case 9:
			StdDraw.picture(0, 10, "imagenes/manosIX.png", 230, 190, -i);
			break;
		case 10:
			StdDraw.picture(0, 10, "imagenes/manosX.png", 230, 190, -i);
			break;
		case 11:
			StdDraw.picture(0, 10, "imagenes/manosXI.png", 230, 190, -i);
			break;
		case 12:
			StdDraw.picture(0, 10, "imagenes/manosXII.png", 230, 190, -i);
			break;
		case 13:
			StdDraw.picture(0, 10, "imagenes/manosXIII.png", 230, 190, -i);
			break;
		case 14:
			StdDraw.picture(0, 10, "imagenes/manosXIV.png", 230, 190, -i);
			break;

		default:
			StdDraw.picture(0, 10, "imagenes/manosXV.png", 230, 190, -i);
			break;
		}
	}

	private static void interfaz(int i, int clicks) {
		StdDraw.clear();
		StdDraw.picture(0, 0, "imagenes/background.jpg", 200, 200);
		StdDraw.picture(0, 10, "imagenes/cookieSinF.png", 90, 60, i);
		StdDraw.picture(78, 65, "imagenes/iconoMano.png", 300, 300);
		String textoClicks = "Numero de clicks: " + clicks;
		StdDraw.text(0, 60, textoClicks);
	}

	public static void main(String[] args) {
		// variables y demás
		boolean salida = true; // menuClicks = false;
		int clicks = 0, inflacion = 0, mouse = 0;
		
		StdDraw.setXscale(-100, 100);
		StdDraw.setYscale(-100, 100);
		StdDraw.setPenRadius(0.0030);
		StdDraw.enableDoubleBuffering();
		clicks = 1000;

		for (int i = 0; i <= 360; i++) {
			// interfaz gráfica
			interfaz(i, clicks);
			String textoClicks = "Numero de clicks: " + clicks;
			// inflacion
			inflacion = 100 + (mouse * 5);
			// comprar el mouse si se puede
			if (StdDraw.mouseX() >= 35 && StdDraw.mouseX() <= 95 && StdDraw.mouseY() >= 80 && StdDraw.mouseY() <= 95
					&& clicks >= (inflacion) && StdDraw.isMousePressed() && salida == false) {
				mouse++;
				clicks = clicks - (inflacion);
				salida = true;
			}


			// si hace click encima de la galleta , cuenta , si no, no
			if (StdDraw.mouseX() >= -25 && StdDraw.mouseX() <= 25 && StdDraw.mouseY() >= -15 && StdDraw.mouseY() <= 35
					&& StdDraw.isMousePressed() && salida == false) {

				// animacion al hacer click en la galleta
				StdDraw.clear();
				StdDraw.picture(0, 0, "imagenes/background.jpg", 200, 200);
				StdDraw.picture(0, 10, "imagenes/cookieSinF.png", 80, 50, i);
				StdDraw.picture(78, 65, "imagenes/iconoMano.png", 300, 300);
				StdDraw.text(0, 60, textoClicks);
				StdDraw.text(57, 93, "Precio: " + (inflacion));
				StdDraw.text(48, 76, "Mouse: " + (mouse));

				clicks++;
				salida = true;

			}
			// realizar la funcion de los mouse
			if (mouse > 0 && segundo(i)) {
				for (int j = 0; j < mouse; j++) {
					clicks++;
				}
			}

			// mostrar precio del mouse y los mouse
			StdDraw.text(57, 93, "Precio: " + (inflacion));
			StdDraw.text(48, 76, "Mouse: " + (mouse));

			// dibujar mouses
			dibujarClickers(mouse, i);

			// mostrar
			StdDraw.show();
			// comprobar que se levanta el raton
			if (!StdDraw.isMousePressed())
				salida = false;
			// reiniciar el bucle
			if (i == 360)
				i = 0;
		}

	}

}
