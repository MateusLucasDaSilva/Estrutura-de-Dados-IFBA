package provaDeVetor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Servico ser = new Servico();
		
		ser.addLongin();
		ser.listaLogins();
		System.out.println("Digite o nome do login desejado");
		String ler = in.next();
		ser.procurarLogin(ler);
		ser.aumentarVetor();
		System.out.println("Digite a posi��o para inserir uma novo login: ");
		int pos = in.nextInt();
		ser.addPosi��o(pos);
		ser.listaLogins();
		System.out.println("excluir qual posi��o? : ");
		int e = in.nextInt();
		ser.excluirPosicao(e);
		ser.listaLogins();
	}

}
