package exercFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FixacaoArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//adicionando nomes a lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//adicionando o nome marco entre a posição 1 e 3 da lista
		list.add(2, "Marco");
		
		//mostrando o tamanho da lista
		System.out.println(list.size());
		
		//mostrando todos os nomes armazenados na lista
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		//remove um valor da lista
		list.remove("Anna");
		//remove o valor na posição da lista 
		list.remove(1);
		//remove qualquer string da lista que começa com a letra M
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("---------------------");
		//mostrando todos os nomes armazenados na lista
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		//mostra posição dessa string na lista
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		//filtrar os strings da lista que começam com a letra 'A'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("---------------------");
		//mostrando todos os nomes armazenados na lista
		for (String x : result) {
		System.out.println(x);
		}
		
		System.out.println("---------------------");
		//filtra a primeiro string na lista que começa com a letra 'J'. se ninguem for encontrado então retorna nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
