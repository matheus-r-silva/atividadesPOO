
// Classe Contato
public class Contato  {
	// Campos da classe
	private String nome;
	private String numero;

	// Construtor Padrão
	public Contato() {}

	//Construtor
	public Contato(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
}
