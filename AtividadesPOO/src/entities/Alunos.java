import atividades.inter.Pessoa;

public class Alunos implements Pessoa {
	
	protected String nome;
	protected String matricula;
	
	public Alunos() {}
	
	
	public Alunos(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}


	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: " +nome+ ", Matricula: "+matricula);
	}
	

}
