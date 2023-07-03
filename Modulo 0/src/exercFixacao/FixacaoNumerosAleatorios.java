package exercFixacao;

import java.util.Random;

public class FixacaoNumerosAleatorios {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int v = random.nextInt(100);// armazenando numeros aleatorios de 0 a 100
		int n = random.nextInt(30) + 1; // armazenando numeros aleatorios de 1 ate 100
		int vet[] = new int[n]; // declaração do vetor "v"
		vet[0] = 1;
	
		System.out.println(v);
		//Preenchendo vetor de tamanho aleatorio comvalores aleatorios
		for(int i = 0; i < n; i++) {
			vet[i] = random.nextInt(100);
		}

		System.out.print("[ ");
		for(int i = 0; i < n; i++) {
			System.out.print(vet[i] + " ");
		}
		System.out.print("]");
	}

}
