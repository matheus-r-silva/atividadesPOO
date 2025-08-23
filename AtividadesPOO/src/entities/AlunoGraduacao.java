public class AlunoGraduacao extends Alunos {
	private String curso;
	
	public AlunoGraduacao() {}

	public AlunoGraduacao(String nome, String matricula, String curso) {
		super(nome, matricula);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: " +nome+ ", Matricula: "+matricula+ ", Curso: "+ curso);
	}
	
}

