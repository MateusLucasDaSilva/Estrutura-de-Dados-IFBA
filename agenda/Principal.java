
package agenda;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Servico s = new Servico();
		Scanner in = new Scanner(System.in);
		String ler = "";

		s.adicionar();
		s.listar();
		s.procurar();

		System.out.println("Deseja inserir alguma conta, se sim digite 's', se n�o digite 'n'.");
		ler = in.next();

		while (ler.equalsIgnoreCase("s")) {
			System.out.println("Digite em qual posi��o vo�� deseja incerir uma nova conta");
			int aux = in.nextInt();
			s.Aumentar(aux);
			s.listar();

			System.out.println("Deseja inserir alguma conta, se sim digite 's', se n�o digite 'n'.");
			String ler2 = in.next();
			ler = ler2;
		}
		System.out.println("Deseja excluir alguma posi��o do vetor? se sim digite 's' se n�o digite 'n'.");
		ler = in.next();
	     
		while (ler.equalsIgnoreCase("s")) {
		System.out.println("Digite em qual posi��o vo�� deseja excluir");
		int aux2 = in.nextInt();
		s.excluir(aux2);
		s.listar();
		System.out.println("Deseja excluir alguma posi��o do vetor? se sim digite 's' se n�o digite 'n'.");
		String ler3 = in.next();
		
		ler = ler3;
		}
		
		
	}
}
