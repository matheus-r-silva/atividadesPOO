package app;

import java.util.Scanner;

import excecao.SaldoInsuficienteExcep;
import excecao.ValorInvalidoException;
import model.Caixa;

public class Inicio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Caixa obj = new Caixa();
		int resp = 1;
		do {
			System.out.println("Bem-vindo! O que deseja fazer?");
			System.out.println("1 – Consultar saldo");
			System.out.println("2 – Realizar depósito");
			System.out.println("3 – Realizar saque");
			System.out.println("0 – Sair");
			int opc = sc.nextInt();
			
			switch(opc){
			case 1:
				Caixa.informarSaldo();
				break;
			
			case 2:
				
				try {
					obj.depositar(sc);
				} catch (ValorInvalidoException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				try {
					obj.sacar(sc);
				} catch (SaldoInsuficienteExcep e) {
					System.out.println(e.getMessage()); 
				}
				
			case 0:
				resp = 0;
				break;
			}
			
		}while(resp != 0);
		
		sc.close();
	}

}
