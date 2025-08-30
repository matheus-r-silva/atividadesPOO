package app;

import java.util.Scanner;

import entity.Dev;
import entity.Funcionario;
import entity.Gerente;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionarios deseja cadastrar?\n");
		int qtd = sc.nextInt();
		Funcionario[] cadastro = new Funcionario[qtd];
		sc.nextLine();
		
		for(int i = 0; i < qtd; i++) {
			System.out.print("Informe o nome do "+(i+1)+" funcionario: ");
			String nome = sc.nextLine();
			System.out.println("Informe o salario do "+(i+1)+" funcionario: ");
			double salario = sc.nextDouble();
			System.out.print("Tipo de funcionario? (Gerente(0) || Dev(1)) ?");
			int opc = sc.nextInt();
			sc.nextLine();
			if(opc == 0) {
				cadastro[i] = new Gerente(nome, salario);
			}else {
				cadastro[i] = new Dev(nome, salario);
			}
		}
		
		for(Funcionario obj : cadastro) {
			obj.exibirInfo();
		}
		
		sc.close();
	}

}
