package exercFixacaoMetodosAbstratos;

public class Circulo extends Forma{

	private static final double PI = 3.14;
	private double raio;
	
	public Circulo() {
		super();
	}

	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return PI * (raio*raio);
	}
	
}
