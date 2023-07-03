package exercAreaTriangulo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		

		System.out.println("Digite os lados do triangulo X");
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		Triangulo x = new Triangulo(a, b, c);
		
		double areaX = x.area();

		System.out.println(areaX);
		
		teclado.close();
	}

}
