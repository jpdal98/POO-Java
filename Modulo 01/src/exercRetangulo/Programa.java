package exercRetangulo;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		System.out.println("Digite a altura e largura do retangulo");
		retangulo.altura = teclado.nextDouble();
		retangulo.largura = teclado.nextDouble();
		
		System.out.println("area = " + retangulo.area());
		System.out.println("perimetro = " + retangulo.perimetro());
		System.out.println("diagonal = " + retangulo.diagonal());
		teclado.close();

	}

}
