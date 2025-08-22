
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
// get retorna. que devolve o valor de um atributo privado da classe
	public String getNome() {
		return nome;
	}
// get retorna. que devolve o valor de um atributo privado da classe
	public String getNumero() {
		return numero;
	}
//permite que os programadores personalizem e adaptem o comportamento das classes de forma mais flexível e eficiente.
	@Override
	public String toString() {
		return nome;
	}
	
	
}
