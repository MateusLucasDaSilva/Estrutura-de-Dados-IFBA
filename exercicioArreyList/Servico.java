package exercicioArreyList;

import java.util.Scanner;

public class Servico {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CadastroLogin cl = new CadastroLogin();
		String use;
		String sen;
		
		System.out.println("OL�! VAMOS ADICONAR UM NOVO LOGIN?\n");
		System.out.print("QUANTOS LOGINS VOC� DESEJA CADASTRAR?");
		int aux = in.nextInt();
		
		for (int cont = 0; cont < aux; cont++) {
		System.out.print("DIGITE O US�ARIO: ");
		use = in.next();
		System.out.print("DIGITE A SENHA: ");
		sen = in.next();
		cl.addConta(use, sen);
		}
		
		cl.listar();
		
		System.out.print("DIGITE A POSI��O QUE DESEJA BUSCAR: ");
		int p = in.nextInt();
		cl.procurar(p);
		
		
		System.out.print("DIGITE A POSI��O QUE DESEJA REMOVER: ");
		int p1 = in.nextInt();
		cl.remover(p1);
	}

}
