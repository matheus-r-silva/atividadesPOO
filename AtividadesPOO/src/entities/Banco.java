package entities;

import java.util.Scanner;

public class Banco {
	private int numeroConta;
	private String titular;
	private double carteira;

	public Banco() {

	}

	public Banco(int numeroConta, String titular, double carteira) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.carteira = carteira;
	}

	public Banco(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCarteira() {
		return carteira;
	}

	public void fazerDeposito(double valor) {
		this.carteira += valor;
	}

	public void fazerSaque(double saque) {
		saque += 5.0;
		this.carteira -= saque;
	}

	public String toString() {
		return "Nº Conta [" + getNumeroConta() + "] Titular - " + getTitular() + ". Saldo R$" + getCarteira();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("----BANCO APP BETA---\n");
		System.out.print("Insira o numero do titular: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Insira o nome: ");
		String nome = sc.nextLine();
		System.out.println("Insira o saldo inicial. (se não tiver deixe em branco):");
		double saldo = sc.nextDouble();
		var cliente = new Banco(numero, nome, saldo);
		System.out.println(cliente);

		sc.nextLine();

		System.out.print("Novo nome: ");
		String novoNome = sc.nextLine();
		cliente.setTitular(novoNome);
		System.out.println(cliente);

		System.out.print("Fazer deposito: ");
		double valor = sc.nextDouble();
		cliente.fazerDeposito(valor);
		System.out.println(cliente);

		System.out.print("Fazer saque: ");
		double saque = sc.nextDouble();
		cliente.fazerSaque(saque);
		System.out.println(cliente);
		
		sc.close();
	}

}
