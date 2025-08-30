public class PagamentoBoleto extends Pagamento{

	public PagamentoBoleto() {}
	
	
	
	public PagamentoBoleto(Double valor) {
		super(valor);
	}



	@Override
	public void processarPagamamento() {
		System.out.print("Pagamento de "+valor+" processado via Boleto Bancário (3 dias úteis para compensação).");
	}
	
	public void exibirValor() {
		System.out.println("Valor: R$"+String.format("%.2f", valor));
	}
	
	
}
