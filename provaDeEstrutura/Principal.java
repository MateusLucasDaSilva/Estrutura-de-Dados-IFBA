package provaDeEstrutura;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ColecaoPaciente c = new ColecaoPaciente();
		c.cadatrarPaciente();
		c.listarPaciente();
		System.out.println("DIGITE O NOME QUE DESEJA BUSCAR: ");
		String n = in.next();
		c.procurarPacientePorNome(n);
		System.out.println("DIGITE A POSIÇÃO QUE DESEJA BUSCAR: ");
		int p = in.nextInt();
		c.procurarPacientePorPosicao(p);
		c.aumentarArray();
		System.out.println("DIGITE A POSIÇÃO QUE DESEJA CADASTAR UM PACIENTE: ");
		int p2 = in.nextInt();
		c.cadastrarPacientePorPosicao(p2);
		c.listarPaciente();
		System.out.println("DIGITE A POSIÇÃO QUE DESEJA REMOVER: ");
		int e = in.nextInt();
		c.removerPacientePorPosicao(e);
		c.listarPaciente();
		c.quantidade();
	
	}
	

}
