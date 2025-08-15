package entities;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private Double nota1bim;
	private Double nota2bim;
	
	public Aluno() {}

	public Aluno(String nome, Double nota1bim, Double nota2bim) {
		this.nome = nome;
		this.nota1bim = nota1bim;
		this.nota2bim = nota2bim;
	}

	public String getNome() {
		return nome;
	}

	public Double getNota1bim() {
		return nota1bim;
	}

	public Double getNota2bim() {
		return nota2bim;
	}
	
	public double calcMedia() {
		double media = (nota1bim + nota2bim) / 2;
		return media;
	}
	
	public static void verifAprovado(Aluno a) {
		if(a.calcMedia() >= 6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
	
	
	
	
	@Override
	public String toString() {
		return "Aluno: " + nome + ", Media: " + String.format("%.2f", calcMedia());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Registre um aluno para verificar sua aprovação");
		System.out.println("Informe o nome do aluno");
		String nome = sc.nextLine();
		System.out.println("Informe a nota do 1° Bimestre");
		double nota1 = sc.nextDouble();
		System.out.println("Informe a nota do 2° Bimestre");
		double nota2 = sc.nextDouble();
		Aluno obj = new Aluno(nome, nota1, nota2);
//		System.out.println();
		System.out.println(obj);
		verifAprovado(obj);
		sc.close();
	}
	
}
