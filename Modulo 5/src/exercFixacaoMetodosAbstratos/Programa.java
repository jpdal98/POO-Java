package exercFixacaoMetodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero de formas geometricas: ");
		int n = teclado.nextInt();
		List<Forma> formas = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados da figura " + i);
			System.out.println("Retangulo ou circulo(r/c)?");
			char r = teclado.next().charAt(0);
			System.out.println("Cor(BLACK/BLUE/RED)?");
			String cor = teclado.nextLine();
			if (r == 'r') {
				System.out.print("Altura: ");
				double altura = teclado.nextDouble();
				System.out.print("Largura: ");
				double largura = teclado.nextDouble();
				formas.add(new Retangulo(Cor.valueOf(cor), altura, largura));
			}else {
				System.out.print("Raio: ");
				double raio = teclado.nextDouble();
				formas.add(new Circulo(Cor.valueOf(cor), raio));
			}
		}
		
		System.out.println("Areas:");
		for(Forma f : formas) {
			System.out.println(f.area());
		}
		teclado.close();

	}

}
