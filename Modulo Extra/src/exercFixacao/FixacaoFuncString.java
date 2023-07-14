package exercFixacao;

public class FixacaoFuncString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		//Recortando a String com base nos espaços e armazenando cada espaço recortado em um vetor
		String s = "potato apple lemon";
		// o split recebe um separador onde a string vai ser recortada com base nele
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		String s01 = original.toLowerCase(); 
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-"); // imprime todos os valores da string em letras minuscula
		System.out.println("toUpperCase: -" + s02 + "-"); // imprime todos os valores da string em letras maisculas
		System.out.println("trim: -" + s03 + "-"); // mantem a String original eliminando os espaços no começo e no fim da string
		System.out.println("substring(2): -" + s04 + "-"); // monta uma nova string apartir do caractere na posição 2
		System.out.println("substring(2, 9): -" + s05 + "-"); // monta uma nova string apartir do caractere na posição 2 ate a posição 9
		System.out.println("replace('a', 'x'): -" + s06 + "-"); // essa função irá trocar qualquer carecter 'a' da string pela letra 'x'
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");  // essa função irá trocar qlqr substring 'abc' da string pelas letras 'xy'
		System.out.println("Index of 'bc': " + i); // mostra a primeira posição do subtring 'bc' na string original
		System.out.println("Last index of 'bc': " + j);  // mostra a ultima posição do subtring 'bc' na sting original
		
	}

}
