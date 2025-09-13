package atividadelistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Dupla: Isabelaaa & Matheus Rocha
 */
public class FilmesCatalogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> filmes = new ArrayList<>();
		
		filmes.add("0-Nosferatu");
		filmes.add("1-Invocação do Mal 4");
		filmes.add("2-Gente Grande 2");
		filmes.add("3-Todo Mundo em Panico");
		filmes.add("4-Moana");
		
		System.out.println("Bem-vindo ao catalogo de filmes");
		System.out.println();	
		for(String cat : filmes) {
			System.out.println(cat);
		}
		System.out.println();
		System.out.println("Qual filme deseja ver?");
		String resposta = sc.nextLine(); 
		if(filmes.equals(resposta)) {
			System.out.println("Filme: "+filmes);
		}
		
		System.out.println("Troque um filme da lista inserindo nome e numero");
		String troca = sc.nextLine();
		int numero = sc.nextInt();
		filmes.set(numero, troca);
		for(String cat: filmes) {
			System.out.println("Lista atualizada: "+cat);
		}
		
		sc.close();
		
	}
}
