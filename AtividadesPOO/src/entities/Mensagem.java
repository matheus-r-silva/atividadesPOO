package entity;

import java.util.Scanner;

public class Mensagem {
	public static Scanner sc = new Scanner(System.in);
	
	Contato usuario;
	String texto;
	
	public Mensagem() {}

	public Mensagem(Contato usuario, String texto) {
		this.usuario = usuario;
		this.texto = texto;
	}

	public Contato getUsuario() {
		return usuario;
	}

	public String getTexto() {
		return texto;
	}

	@Override
	public String toString() {
		return usuario + " para " + usuario + ": " + texto;
	}
	
	
	public static void exibirMensagem(Scanner sc) {
		Contato[] usuarios = new Contato[2];
		
		for(int i = 0; i < usuarios.length; i++) {
			System.out.print("Digite o nome do "+(i + 1)+ " usuario");
			String remetente = sc.nextLine();
			System.out.print("Digite o numero do " +(i+1)+" usuario");
			String numero = sc.nextLine();
		
			usuarios[i] = new Contato(remetente, numero);
			
		}
		
	}
	
	public static void main(String[] args) {
		
	}
//
//      Método exibirMensagem() que mostre no formato:
//
//      Maria para João: Oi João! 
//
//  Na classe principal (Main):
//
//      Crie dois objetos Contato.
//
//      Crie duas mensagens trocadas entre esses contatos.
//
//      Chame o método exibirMensagem() para mostrar as mensagens na tela.
//	Maria para João: Oi João!
//	João para Maria: Oi Maria! Tudo bem

}
