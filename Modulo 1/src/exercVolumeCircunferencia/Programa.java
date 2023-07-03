package exercVolumeCircunferencia;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o raio: ");
		double raio = teclado.nextDouble();
		
		/* como os metodos circunferencia e volume independe de qualquer valor de qlqr objeto do tipo Circulo, 
		 * não a necessidade de instanciar objetos do tipo circulo para usar esses metodos.
		 */
		double c = Circulo.circunferencia(raio);
		double v = Circulo.volume(raio);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Circulo.PI);

		teclado.close();
	}

}
