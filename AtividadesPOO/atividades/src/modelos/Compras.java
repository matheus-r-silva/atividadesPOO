package modelos;

public class Compras {
	private String nome_produto;
	private double preco_produto;
	private String cat_produto;
	
	
	public Compras() {}


	public Compras(String nome_produto, double preco_produto, String cat_produto) {
		this.nome_produto = nome_produto;
		this.preco_produto = preco_produto;
		this.cat_produto = cat_produto;
	}


	public String getNome_produto() {
		return nome_produto;
	}


	public double getPreco_produto() {
		return preco_produto;
	}


	public String getCat_produto() {
		return cat_produto;
	}


	@Override
	public String toString() {
		return nome_produto+": R$"+String.format("%.2f", preco_produto)+": ("+cat_produto+")";
	}

	
	
}
