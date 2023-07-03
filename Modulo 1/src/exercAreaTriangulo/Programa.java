package exercAreaTriangulo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();

		System.out.println("Digite os lados do triangulo X");
		x.a = teclado.nextDouble();
		x.b = teclado.nextDouble();
		x.c = teclado.nextDouble();
		System.out.println("Digite os lados do triangulo X");
		y.a = teclado.nextDouble();
		y.b = teclado.nextDouble();
		y.c = teclado.nextDouble();

		double areaX = x.area();

		double areaY = y.area();

		if (areaX > areaY) {
			System.out.println("A maior area é do triangulo X");
		} else {
			System.out.println("A maior area é do triangulo Y");
		}

		teclado.close();
	}

}
