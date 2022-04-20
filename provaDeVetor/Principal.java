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
		System.out.println("Digite a posição para inserir uma novo login: ");
		int pos = in.nextInt();
		ser.addPosição(pos);
		ser.listaLogins();
		System.out.println("excluir qual posição? : ");
		int e = in.nextInt();
		ser.excluirPosicao(e);
		ser.listaLogins();
	}

}
