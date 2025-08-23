import model.inter.Veiculo;

public class Barco extends Transporte implements Veiculo {
	
	private String cor;
	
	public Barco() {}
	
	
	public Barco(String modelo, String cor) {
		super(modelo);
		this.cor = cor;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	@Override
	public void mover() {
		System.out.println("frooooooooommm...");
	}

}
