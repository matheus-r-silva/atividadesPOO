package atividadelistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelos.Compras;
/**
 * Dupla: Isabelaaa & Matheus Rocha
 */
public class ListaCompras {
	public static void main(String[] args) {
		List<Compras> carrinho = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		carrinho.add(new Compras("0-Arroz", 25.20, "Alimento"));
		carrinho.add(new Compras("1-Feijão", 20.20, "Alimento"));
		carrinho.add(new Compras("2-Leite", 5.90, "Bebida"));
		carrinho.add(new Compras("3-Café do Sitio", 45.20, "Bebida"));
		carrinho.add(new Compras("4-Ovo Caipira Graudo", 30.00, "Alimento"));
		
		System.out.println("Bem-vindo ao mercado do Seu Zé! VEJA ABIXO A LISTA DE PROMOCÃO DO DIA");
		System.out.println();	
		for(Compras produtos : carrinho) {
			System.out.println(produtos);
		}
		System.out.println();
		System.out.println("Deseja remover um produto do carrinho (S/N)?");
		char resposta = sc.next().charAt(0); 
		
		if(resposta == 's') {
			System.out.print("Escreva o indice do produto de 0 a 4: ");
			int indice = sc.nextInt();
			carrinho.remove(indice);
			for(Compras produtos : carrinho) {
				System.out.println("Carrinho atualizado: "+produtos);
			}
			
		}else {
			System.out.println("Tenha um bom dia!");
		}
		
		
		sc.close();
	}
}
