import model.inter.Veiculo;

public class Aviao extends Transporte implements Veiculo {
	
	private String tipo;
	
	public Aviao() {}
	
	
	public Aviao(String modelo, String tipo) {
		super(modelo);
		this.tipo = tipo;
	}

	
	public String getTipo() {
		return tipo;
	}

	@Override
	public void mover() {
		System.out.println("vraaaaaaaaaau.....");
	}

}
