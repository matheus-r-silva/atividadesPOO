public class PagamentoCartao extends Pagamento{
	
	public PagamentoCartao() {}
	
	public PagamentoCartao(Double valor) {
		super(valor);
	}

	
	@Override
	public void processarPagamamento() {
		System.out.print("Pagamento de "+valor+" processado via Cartão de Crédito com taxa de 2%.");
	}
	
	public void exibirValor() {
		System.out.println("Valor: R$"+String.format("%.2f", valor * 0,02));
	}

}
