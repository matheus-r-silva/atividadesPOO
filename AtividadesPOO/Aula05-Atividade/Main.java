import java.util.Scanner;

import entity.Pagamento;
import entity.PagamentoBoleto;
import entity.PagamentoCartao;
import entity.PagamentoPix;

public class Main {
	/**
	 * Matheus Rocha Silva & Isabela Aquino
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pagamentos deseja cadastrar?\n");
		int qtd = sc.nextInt();
		Pagamento[] cadastro = new Pagamento[qtd];
		sc.nextLine();
		
		for(int i = 0; i < qtd; i++) {
			System.out.println("Informe o valor do "+(i+1)+" metodo de pagamento: ");
			double valor = sc.nextDouble();
			System.out.print("Tipo de pagamento?\n (PagamentoCartao(0) || PagamentoBoleto(1) || PagamentoPix(2) )? ");
			int opc = sc.nextInt();
			sc.nextLine();
			if(opc == 0) {
				cadastro[i] = new PagamentoCartao(valor);
			}else if(opc == 1) {
				cadastro[i] = new PagamentoBoleto(valor);
			}else {
				cadastro[i] = new PagamentoPix(valor);
				
			}
		}
		
		for(Pagamento obj : cadastro) {
			obj.exibirValor();
			System.out.println();
			obj.processarPagamamento();
		}
		
		sc.close();
	}
}
