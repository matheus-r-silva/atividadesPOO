package atividadelistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Dupla: Isabelaaa & Matheus Rocha
 */
public class ListaPresenca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> presenca = new ArrayList<>();
		
		presenca.add("0-João");
		presenca.add("1-Theo");
		presenca.add("2-Caio");
		presenca.add("3-Heitor");
		presenca.add("4-Davi");
		
		System.out.println("Bem-vindo a lista de presenca");
		System.out.println();	
		for(String tarefa : presenca) {
			System.out.println(tarefa);
		}
		System.out.println();
		System.out.print("Escreva o nome do aluno que faltou: ");
		String nome = sc.nextLine();
		
		if(presenca.contains(nome)) {
			presenca.remove(nome);
		}
		System.out.println("Quantidade de alunos: "+presenca.size());
		
		for(String nomes: presenca) {
			System.out.println("Lista atualizada: "+nomes);
		}
			
		sc.close();
		
	}
}
