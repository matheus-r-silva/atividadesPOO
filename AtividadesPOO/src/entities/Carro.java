import model.inter.Veiculo;

public class Carro extends Transporte implements Veiculo {
	
	private String cor;
	
	public Carro() {}
	
		
	public Carro(String modelo, String cor) {
		super(modelo);
		this.cor = cor;
	}


	public String getCor() {
		return cor;
	}


	@Override
	public void mover() {
		System.out.println("vrum... vruuum!!!!");
	}
	
}
