package exercVolumeCircunferencia;

public class Circulo {

	//Declarando uma varivel estatica ou seja uma avriavel que seu valor nunca muda
	/*obs: no java as variaveis estaticas so podem ser declaradas se ultilizarmos o "final" 
	 * e se o nome da variavel for todo com letras maisculas
	 */
	public static final double PI = 3.14159;

	//metodos podem ser colocados como estaticos quando sua realização independe de qualquer valor dos objetos da classe
	public static double circunferencia(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
