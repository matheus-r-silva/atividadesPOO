package model;

import java.util.Scanner;

import excecao.SaldoInsuficienteExcep;
import excecao.ValorInvalidoException;

public class Caixa {
	public static double saldo = 1000.0;
	
	public void depositar(Scanner sc) throws ValorInvalidoException {
		System.out.print("Quanto deseja depositar?");
		double valor = sc.nextDouble();
		if(valor == 0 || valor < 0) {
			throw new ValorInvalidoException("Valor negativo ou zero");
		}else {
			saldo = saldo + valor;
			System.out.println("Deposito realizado! R$"+String.format("%.2f", saldo));
			System.out.println();
		}
	}
	
	public void sacar (Scanner sc) throws SaldoInsuficienteExcep{
		System.out.print("Quanto deseja sacar?");
		double valor = sc.nextDouble();
		if(valor > saldo) {
			throw new SaldoInsuficienteExcep("Saldo Insuficiente");
		}else {
			saldo = saldo - valor;
			System.out.println("Saque realizado! R$"+String.format("%.2f", saldo));
			System.out.println();
		}
	}
	
	public static void informarSaldo() {
		System.out.println("Saldo R$" + String.format("%.2f", saldo));
		System.out.println();
	}
	
	
}
