package exercFixacaoStringBuilder;

import  java.text.ParseException ;
import  java.text.SimpleDateFormat ;


public class Programa {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Boa viagem!");
		Comentario c2 = new Comentario("Uau, isso � incr�vel!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Viajar para a Nova Zel�ndia", 
				"Vou visitar este pa�s maravilhoso!", 
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite");
		Comentario c4 = new Comentario("Que a For�a esteja com voc�");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Boa noite pessoal", 
				"Te vejo amanh�", 
				5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
