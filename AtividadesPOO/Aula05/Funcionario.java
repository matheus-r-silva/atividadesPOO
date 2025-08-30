public abstract class Funcionario {
	protected String nome;
	protected Double salario;
	
	public Funcionario() {}

	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public abstract double calcularBonus(); 
	
	public void exibirInfo() {
		System.out.println("Nome: "+nome+" || "+" Salario: R$"+String.format("%.2f", salario));
	}
}
