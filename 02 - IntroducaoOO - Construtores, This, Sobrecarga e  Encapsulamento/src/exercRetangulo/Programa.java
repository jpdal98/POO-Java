package exercRetangulo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a altura e largura do retangulo");
		double altura = teclado.nextDouble();
		double largura = teclado.nextDouble();
		Retangulo retangulo = new Retangulo(altura, largura);
		
		System.out.println("area = " + retangulo.area());
		System.out.println("perimetro = " + retangulo.perimetro());
		System.out.println("diagonal = " + retangulo.diagonal());
		teclado.close();

	}

}
