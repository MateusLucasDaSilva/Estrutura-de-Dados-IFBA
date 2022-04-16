

package agenda;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Servico s = new Servico();
		Scanner in = new Scanner(System.in);
		s.adicionar();
		s.listar();
		s.procurar();
		System.out.println("Digite em qual posição voçê deseja incerir uma nova conta");
		int aux = in.nextInt();
		s.Aumentar(aux);
        s.listar();
        System.out.println("Digite em qual posição voçê deseja excluir");
		int aux2 = in.nextInt();
		s.excluir(aux2);
		s.listar();

	}
}


