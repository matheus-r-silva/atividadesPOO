import atividades.inter.Pessoa;

public class AlunoPosGraduacao extends Alunos implements Pessoa{
	private String pesquisa;
	
	public AlunoPosGraduacao() {}

	public AlunoPosGraduacao(String nome, String matricula, String pesquisa) {
		super(nome, matricula);
		this.pesquisa = pesquisa;
	}

	public String getPesquisa() {
		return pesquisa;
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: " +nome+ ", Matricula: "+matricula+ ", Pesquisa: " + pesquisa);
	}
	
