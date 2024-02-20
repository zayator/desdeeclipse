package objetos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import utilidades.copy.StdDraw;

public class EjercicioRectanguloII {
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

	public static void main(String[] args) throws InterruptedException {
		StdDraw.setScale(-100, 100);

		//definir rectangulos y demas
		Rectangulo r1 = new Rectangulo(40, 20, -15, -15);
		Rectangulo r2 = new Rectangulo(20, 40, 15, -15);
		Rectangulo r3 = new Rectangulo(10, 30, -15, 15);
		Rectangulo r4 = new Rectangulo(30, 40, 15, 15);
		r4.getCentro().setMovX(1);
		r4.getCentro().setMovY(-1);
		r1.getCentro().setMovX(-1);
		r1.getCentro().setMovY(-1);
		r2.getCentro().setMovX(1);
		r2.getCentro().setMovY(-1);
		r3.getCentro().setMovX(1);
		r3.getCentro().setMovY(-1);
		
		while (true) {
			//Interfaz grafica
			StdDraw.enableDoubleBuffering();
			StdDraw.clear();
			pintarejes();
			r1.dibujar(r1,true,Color.cyan);
			r2.dibujar(r2,true,Color.RED);
			r3.dibujar(r3,true,Color.GRAY);
			r4.dibujar(r4,true,Color.PINK);
		
			//movimiento
			r1.getCentro().mover();
			r2.getCentro().mover();
			r3.getCentro().mover();
			r4.getCentro().mover();
			 
			//r1
			if(r1.InfCentro(r1).getY()<=-100) {
				r1.getCentro().setMovY(2.3);
			}
			if(r1.CentroIzq(r1).getX()<=-100) {
				r1.getCentro().setMovX(2.7);
			}
			if(r1.SupCentro(r1).getY()>=0) {
				r1.getCentro().setMovY(-1);
			}
			if(r1.CentroDer(r1).getX()>=0) 
				r1.getCentro().setMovX(-1.3);
			//r2
			if(r2.InfCentro(r2).getY()<=-100) {
				r2.getCentro().setMovY(2.3);
			}
			if(r2.CentroIzq(r2).getX()<=0) {
				r2.getCentro().setMovX(2.4);
			}
			if(r2.SupCentro(r2).getY()>=0) {
				r2.getCentro().setMovY(-1.7);
			}
			if(r2.CentroDer(r2).getX()>=100) 
				r2.getCentro().setMovX(-1.1);
			//r3
			if(r3.InfCentro(r3).getY()<=0) {
				r3.getCentro().setMovY(2.2);
			}
			if(r3.CentroIzq(r3).getX()<=-100) {
				r3.getCentro().setMovX(2.3);
			}
			if(r3.SupCentro(r3).getY()>=100) {
				r3.getCentro().setMovY(-1.7);
			}
			if(r3.CentroDer(r3).getX()>=0) 
				r3.getCentro().setMovX(-1.4);
			//r4
			if(r4.InfCentro(r4).getY()<=0) {
				r4.getCentro().setMovY(2.9);
			}
			if(r4.CentroIzq(r4).getX()<=0) {
				r4.getCentro().setMovX(2.8);
			}
			if(r4.SupCentro(r4).getY()>=100) {
				r4.getCentro().setMovY(-1.7);
			}
			if(r4.CentroDer(r4).getX()>=100) 
				r4.getCentro().setMovX(-1.6);
			
			Thread.sleep(7);
			StdDraw.show();
		}

	}
}
