public class Principal {
	public static void main(String[] args) {
		Alunos aluno = new Alunos("Ana", "123");
		AlunoGraduacao aluno_grad = new AlunoGraduacao("Isabela","456", "Ads");
		AlunoPosGraduacao alunopos = new AlunoPosGraduacao("Sofia", "789", "pedagogia");
		
		aluno.exibirInformacoes();
		aluno_grad.exibirInformacoes();
		alunopos.exibirInformacoes();
	}
}
