package entities;

import java.util.Scanner;

public class Produto {
	
	private String nome;
	private Double preco;
	private Integer qtd;
	
	
	public Produto() {}

	public Produto(String nome, Double preco, Integer qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	public Double prcTotal() {
		return qtd * preco;
	}
	
	@Override
	public String toString() {
		return "Produto: " + nome + ", R$" + String.format("%.2f", preco) + ", Quantidade: " + qtd + ", Valor total: R$" + String.format("%.2f", prcTotal());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("------Teste para inserir produtos------");
		System.out.println("Quantos produtos deseja comprar?");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		Produto[] produtos = new Produto[qtd];
		
		for(int i = 0; i < produtos.length; i++) {
			System.out.print("Qual o " + (i + 1) + " produto que deseja levar? ");
			String nome_produto = sc.nextLine();
			System.out.print("Quanto custa? ");
			double preco_produto = sc.nextDouble();
			System.out.println("Quantos deseja levar? ");
			int qtd_produto = sc.nextInt();
			sc.nextLine();
			produtos[i] = new Produto(nome_produto, preco_produto, qtd_produto);
		}
		
	 
		for(Produto p : produtos) {
			System.out.println(p.toString());
		}
		
		sc.close();
	}
	
	
}
