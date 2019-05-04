package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Postagem;

//Interage com as classes 'Comentario' e 'Postagem'
public class Programa2 {
	public static void main (String args[]) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem! ");
		Comentario c2 = new Comentario("Qual é a parada! ");
		
		Postagem p1 = new Postagem(
				sdf.parse("21/06/2018 13:05:44"), 
				"Viajando para Nova Zelândia ", 
				"Vou visitar esse país maravilhoso! ",
				 12);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);
	
	}

}
