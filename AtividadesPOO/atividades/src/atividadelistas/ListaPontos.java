package atividadelistas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Dupla: Isabelaaa & Matheus Rocha
 */
public class ListaPontos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> pontuacao = new LinkedList<>();
		pontuacao.add(150);
		pontuacao.add(350);
		pontuacao.add(400);
		pontuacao.add(560);
		pontuacao.add(800);

		System.out.println("Bem-vindo a lista de pontuação");
		System.out.println();
		for (Integer pontos : pontuacao) {
			System.out.println("Pontos: " + pontos);
		}
		
		System.out.println();
		System.out.println("Veja a maior pontuação e a menor!");
		System.out.println("Maior Score: "+Collections.max(pontuacao));
		System.out.println("Menor Score: "+Collections.min(pontuacao));
		System.out.println("Quantidade de Score: "+pontuacao.size());
		
//		for (Integer pontos : pontuacao) {
//			System.out.println("Score: " + Collections.max(pontos));
//		}

		sc.close();

	}
}
