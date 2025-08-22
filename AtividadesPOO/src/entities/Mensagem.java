 os valores direto de forma controladapackage entity;

import java.util.Scanner;

public class Mensagem {
	// scanner le entradas do usuario no console
	public static Scanner sc = new Scanner(System.in);

	Contato usuario;
	String texto;

	public Mensagem() { //construtor vazio permite criar objt sem passar valores de cara
		
	}
// construtor com parametro cria a mensagem direta
	public Mensagem(Contato usuario, String texto) {
		this.usuario = usuario;
		this.texto = texto;
	}
//acessa direto de forma controlada os valores
	public Contato getUsuario() {
		return usuario;
	}
//acessa direto de forma controlada os valores
	public String getTexto() {
		return texto;
	}

	@Override
	public String toString() {
		return usuario + " para " + usuario + ": " + texto;
	}

	public static void criarMensagem() {
		Contato[] usuarios = new Contato[2];
		Mensagem[] txt = new Mensagem[2];

		for (int i = 0; i < 2; i++) {
			System.out.println("Informe o nome do " + (i + 1) + " contato");
			String nome = sc.nextLine();
			System.out.println("Informe o numero do " + (i + 1) + " contao");
			String numero = sc.nextLine();
			usuarios[i] = new Contato(nome, numero);
		}

		for (int i = 0; i < 2; i++) {
			System.out.println("Digite a " + (i + 1) + " mensagem");
			String texto = sc.nextLine();
			txt[i] = new Mensagem(usuarios[i], texto);
		}

		System.out.println(usuarios[0] + " para " + usuarios[1] + ": " + txt[0].texto);
		System.out.println();
		System.out.println(usuarios[1] + " para " + usuarios[0] + ": " + txt[1].texto);

//		for(Mensagem men : txt) {
//			System.out.println(men);
//		}

//		for(int i = 0; i < 2; i++) {
//			System.out.println(usuarios[0]+" para "+ usuarios[1]+": "+ txt[i]);
//		}

	}
	
	public static void main(String[] args) {
		criarMensagem();
	}

//	public static void criarUsuario(Scanner sc) {
//		Contato[] usuarios = new Contato[2];
//		
//		for(int i = 0; i < 2; i++) {
//			System.out.println("Informe o nome do "+(i+1)+" contato");
//			String nome = sc.nextLine();
//			System.out.println("Informe o numero do "+(i+1)+" contao");
//			String numero = sc.nextLine();
//			usuarios[i] = new Contato(nome, numero);
//		}
//		
//		for(Contato u : usuarios) {
//			System.out.println(u.getNome()+", ("+ u.getNumero()+")");
//		}
//	}

//	public static void exibirMensagem(Scanner sc) {
//		System.out.println("Crie os contatos");
//		criarUsuario(sc);
//		
//		Mensagem[] txt = new Mensagem[2];
//		
//	}

}
