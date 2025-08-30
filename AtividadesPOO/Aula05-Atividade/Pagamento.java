public abstract class Pagamento {
	protected Double valor;
	
	public Pagamento() {}

	public Pagamento(Double valor) {
		this.valor = valor;
	}

	public abstract void processarPagamamento();
	
	public void exibirValor() {
		System.out.println("Valor: R$"+String.format("%.2f", valor));
	}
}
