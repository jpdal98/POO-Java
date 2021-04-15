package exercConversaoRealDolar;

public class Conversao {

	public static double IOF = 0.06;

	public static double dolarParaReal(double valor, double precoDolar) {
		return valor * precoDolar * (1.0 + IOF);
	}
}
