package agenda;

import java.util.Scanner;

public class Servico {
	Scanner in = new Scanner(System.in);
	Contato vetor[] = new Contato[5];

	public void adicionar() {
		for (int a = 0; a < vetor.length; a++) {
			Contato c = new Contato();
			System.out.print("Digite um nome: ");
			c.setNome(in.next());
			System.out.print("Digite um numero: ");
			c.setNumero(in.next());
			vetor[a] = c;
		}
	}

	public void listar() {
		for (int a = 0; a < vetor.length; a++) {
			System.out.println("Posição: " + a);
			System.out.println("Nome:" + vetor[a].getNome());
			System.out.println("Numero:" + vetor[a].getNumero());

			System.out.println("--------------");
		}
	}

	public void procurar() {
		System.out.println("Digite o nome da pesssoa que procura:");
		String ler = in.next();
		String nomeX = "";
		String numeroY = "";
		for (int a = 0; a < vetor.length; a++) {
			if (ler.equalsIgnoreCase(vetor[a].getNome())) {

				nomeX = vetor[a].getNome();
				numeroY = vetor[a].getNumero();

			}
		}
		System.out.println("Nome: " + nomeX + "\nNumero: " + numeroY);

	}

	public void Aumentar(int aux) {

		Contato vetorNovo[] = new Contato[this.vetor.length + 1];

		System.arraycopy(this.vetor, 0, vetorNovo, 0, this.vetor.length);

		for (int a = vetorNovo.length; a >aux +1 ; a--) {
			vetorNovo[a-1] = vetorNovo[a- 2];
			
		}
		Contato c = new Contato();
		System.out.print("Digite um nome: ");
		c.setNome(in.next());
		System.out.print("Digite um numero: ");
		c.setNumero(in.next());
		vetorNovo[aux] = c;

		this.vetor = vetorNovo;
	}

	public void excluir(int aux2) {
		
		for (int a = aux2 ; a < this.vetor.length -1 ; a++ ) {
			this.vetor[aux2] = this.vetor [aux2+1 ];
		}
		
		Contato vetorNovo2[] = new Contato[this.vetor.length -1 ];
		System.arraycopy(this.vetor, 0, vetorNovo2, 0, this.vetor.length -1  );
		
		this.vetor = vetorNovo2;
		
	}
}
