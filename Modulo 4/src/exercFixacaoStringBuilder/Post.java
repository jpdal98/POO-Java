package exercFixacaoStringBuilder;

	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;

	public class Post {

		private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		private Date data;
		private String titulo;
		private String conteudo;
		private Integer likes;
		private List<Comentario> comentarios = new ArrayList<>();
		
		public Post() {
			
		}

		public Post(Date data, String tiutlo, String conteudo, Integer likes) {
			this.data = data;
			this.titulo = tiutlo;
			this.conteudo = conteudo;
			this.likes = likes;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTiutlo(String tiutlo) {
			this.titulo = tiutlo;
		}

		public String getConteudo() {
			return conteudo;
		}

		public void setConteudo(String conteudo) {
			this.conteudo = conteudo;
		}

		public Integer getLikes() {
			return likes;
		}

		public void setLikes(Integer likes) {
			this.likes = likes;
		}

		public List<Comentario> getComentarios() {
			return comentarios;
		}

		public void addComentario(Comentario comentario) {
			comentarios.add(comentario);
		}

		public void removerComentario(Comentario comentario) {
			comentarios.remove(comentario);
		}
		
		//String Builder
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(titulo + "\n");
			sb.append(likes);
			sb.append(" Likes - ");
			sb.append(sdf.format(data) + "\n");
			sb.append(conteudo + "\n");
			sb.append("Comments:\n");
			for (Comentario c : comentarios) {
				sb.append(c.getText() + "\n");
			}
			return sb.toString();
		}
}
