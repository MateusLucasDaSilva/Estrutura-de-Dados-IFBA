package bancoo123;

import java.util.Scanner;

public class CadastrarConta {
	Scanner in = new Scanner(System.in);
	Conta vetor[] = new Conta[3];
	String nome;
	int valor;
	String aux;

	public void adiconarConta() {

		for (int i = 0; i < vetor.length; i++) {

			Conta conta = new Conta();
			System.out.print("Digite o nome da conta: ");
			conta.setNome(in.next());
			System.out.print("Digite o valor desta conta: ");
			conta.setValor(in.nextInt());
			vetor[i] = conta;
		}

	}

	public void procurarConta() {

		System.out.println("Digite o nome da  conta que deseja buscar no Banco:");
		aux = in.next();
		for (int i = 0; i < vetor.length; i++) {
			if (aux.equals(vetor[i].getNome())) {
				nome = vetor[i].getNome();
				valor = vetor[i].getValor();
			}

		}
		System.out.println("Conta: " + nome + "\nValor: " + valor);
	}

	public void listarConta() {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Nome: " + vetor[i].getNome() + "\nValor: " + vetor[i].getValor());
			System.out.println("----------------------");
		}

	}

	public void aumentarVetor() {

		Conta vetorNovo[] = new Conta[this.vetor.length + 1];
		System.arraycopy(this.vetor, 0, vetorNovo, 0, this.vetor.length);
		this.vetor = vetorNovo;
	}

	public void addMais(String ler) {

		if (ler.equalsIgnoreCase("s")) {
			for (int i = 0; i < vetor.length; i++) {
				Conta conta = new Conta();
				if (vetor[i] == null) {
					System.out.println("Digite o nome da conta: ");
					conta.setNome(in.next());
					System.out.println("Digite o nome da conta: ");
					conta.setValor(in.nextInt());
					vetor[i] = conta;
				}
			}

		}
	}

}
