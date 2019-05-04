package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Criada para interagir com a classe 'Comentario'
public class Postagem {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String comentario;
	private Integer likes;
	
	private List<Comentario> comentt = new ArrayList<>();
	
	
	public Postagem() {
		
	}


	public Postagem(Date momento, String titulo, String comentario, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.comentario = comentario;
		this.likes = likes;
	}


	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public Integer getLikes() {
		return likes;
	}


	public void setLikes(Integer likes) {
		this.likes = likes;
	}


	public List<Comentario> getComent() {
		return comentt;
	}


	public void addComentario(Comentario coment) {
		comentt.add(coment);
	}
	
	public void removeComentario(Comentario coment) {
		comentt.remove(coment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();	//StringBuilder para montar a cadeia de caracteres da string
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(comentario + "\n");
		sb.append("Comentários \n");
		
		for (Comentario c : comentt) {
			sb.append(c.getTexto()+ "\n");
		}
		
		return sb.toString();		
	}
	
}
