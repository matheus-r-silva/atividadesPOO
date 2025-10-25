import java.util.Objects;

public class Musica {
	
	private Integer id;
	private String titulo;
	private String artista;
	private String genero;
	private double duracao;
	
	public Musica() {}
	
	public Musica(Integer id, String titulo, String artista, String genero, double duracao) {
		this.id = id;
		this.titulo = titulo;
		this.artista = artista;
		this.genero = genero;
		this.duracao = duracao;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	public void mostrarInfo() {
		System.out.println("("+id+")"+titulo+" | "+artista+" | "+genero+" | "+String.format("%.2f", duracao)+" min");
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		return id == other.id;
	}
	
	
}
