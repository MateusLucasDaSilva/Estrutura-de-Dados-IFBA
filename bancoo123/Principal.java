package bancoo123;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CadastrarConta cc = new CadastrarConta();
		String ler;
		cc.adiconarConta();
		cc.listarConta();
		cc.procurarConta();

		System.out.println("Deseja adicionar mais contas ao banco? se Sim digite 's', se nao digite 'n' !");
		ler = in.next();
		while (ler.equalsIgnoreCase("s")) {
			cc.aumentarVetor();
			cc.addMais(ler);
			cc.listarConta();
			System.out.println("Deseja adicionar mais contas ao banco? se Sim digite 's', se nao digite 'n' !");
			ler = in.next();

		}
		System.out.println("Operação encerrada");
	}
}
