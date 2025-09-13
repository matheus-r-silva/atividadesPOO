package atividadelistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelos.Compras;
/**
 * Dupla: Isabelaaa & Matheus Rocha
 */
public class ListaTarefas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> tarefas = new ArrayList<>();
		
		tarefas.add("0-Lavar Roupas");
		tarefas.add("1-Estudar");
		tarefas.add("2-Jogar o lixo fora");
		tarefas.add("3-Varrer o chão");
		tarefas.add("4-lavar o fogão");
		
		System.out.println("Bem-vindo a lista de tarefas");
		System.out.println();	
		for(String tarefa : tarefas) {
			System.out.println(tarefa);
		}
		System.out.println();
		System.out.println("Deseja remover uma tarefa da Lista (S/N)?");
		char resposta = sc.next().charAt(0); 
		if(resposta == 's') {
			System.out.print("Escreva o numeor da tarefa de 0 a 5: ");
			int indice = sc.nextInt();
			tarefas.remove(indice);
			for(String tarefa: tarefas) {
				System.out.println("Lista atualizada: "+tarefa);
			}
			
		}else {
			System.out.println("Tenha um bom dia!");
		}
		
		sc.close();
		
	}
}
