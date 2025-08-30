public class PagamentoPix extends Pagamento {
	
	public PagamentoPix() {}
	
	
	public PagamentoPix(Double valor) {
		super(valor);
	}



	@Override
	public void processarPagamamento() {
		System.out.print("Pagamento de "+valor+" processado via Pix (instantâneo).");
		
	}
	
	public void exibirValor() {
		System.out.println("Valor: R$"+String.format("%.2f", valor));
	}
	
	
}
