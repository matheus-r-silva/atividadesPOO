import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Dupla: Isabela Aquino & Matheus Rocha Silva
 */
public class GerenciadorPlaylist {
	public static List<Musica> playlist = new ArrayList<>();
	public static void adicionarMusica(Scanner sc) {
		System.out.print("Digite a ID da musica (em inteiro): ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o titulo da musica: ");
		String titulo = sc.nextLine();
		System.out.print("Digite o artista: ");
		String artista = sc.nextLine();
		System.out.print("Digite o genero: ");
		String genero = sc.nextLine();
		System.out.print("Digite a duração (em minutos): ");
		double duracao = sc.nextDouble();
		playlist.add(new Musica(id, titulo, artista, genero, duracao));
		
		System.out.println();
		System.out.println("Adicionado com sucesso!!");
		
		sc.nextLine();
	}
	
	
	public static void removerMusica(Scanner sc) {
		System.out.println("Escolha uma música para remover");
		
	}
	
	public static void listarMusicas() {
		for(Musica musicas : playlist) {
			musicas.mostrarInfo();
		}
	}
	
	public static void buscarMusica(Scanner sc) {
		System.out.print("Busce por uma música da sua playlist! (utilize a ID): ");
		int idMusica = sc.nextInt();
		
	}
	
	public static void verDuracaoMusica() {
		double duracao=0.0;
		for(Musica musicas : playlist) {
			duracao += musicas.getDuracao();
		}
		System.out.print("Duração total da playlist: "+ duracao +" min");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resposta;
		
		System.out.println("=== Gerenciador de PlayList ===");
		System.out.println();
		
		do {
			System.out.println("1 - Adicionar Música");
			System.out.println("2 - Remover música");
			System.out.println("3 - Listar músicas");
			System.out.println("4 - Buscar música");
			System.out.println("5 - Duração total da playlist");
			System.out.println("0 - Sair");
			System.out.println();
			int opc = sc.nextInt();
			
			sc.nextLine();
			
			
			switch(opc){
			case 1:
				adicionarMusica(sc);
				break;
				
			case 2:
				removerMusica(sc);
				break;
				
			case 3:
				listarMusicas();
				break;
				
			case 4:
				//TODO
				break;
				
			case 5:
				verDuracaoMusica();
				break;
			
			case 0:
				//TODO
				break;
			
			default:
				System.out.println("Opção incorreta...");
				break;
			}
			
			System.out.println("Deseja sair (sim/nao)?");
			resposta = sc.nextLine();
			if(resposta.equalsIgnoreCase("sim")) {
				break;
			}
			System.out.println();
			
		}while(true);
	}
}
