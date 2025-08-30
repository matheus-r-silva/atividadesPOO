public class Dev extends Funcionario {
	
	public Dev(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularBonus() {
		return salario * 0.10;
	}
	
	
}
