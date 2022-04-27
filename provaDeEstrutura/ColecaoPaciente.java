package provaDeEstrutura;

import java.util.Arrays;
import java.util.Scanner;


public class ColecaoPaciente {

	Scanner in = new Scanner(System.in);
	Paciente pac = new Paciente();
	Paciente vetor[] = new Paciente[2];

	public void cadatrarPaciente() {

		for (int a = 0; a < vetor.length; a++) {

			Paciente pac = new Paciente();
			System.out.print("ADICIONE UM NOME DO PACIENTE: ");
			pac.setNome(in.next());
			System.out.print("ADICIONE UM RG DO PACIENTE: ");
			pac.setRg(in.next());
			System.out.print("ADICIONE UM IDADE DO PACIENTE: ");
			pac.setIdade(in.next());

			vetor[a] = pac;

		}

	}

	public void listarPaciente() {
		System.out.println("");
		System.out.println(Arrays.toString(vetor));
	}

	public void procurarPacientePorNome(String n) {

		for (int a = 0; a < vetor.length; a++) {
			if (n.equalsIgnoreCase(vetor[a].getNome())) {
				System.out.println("");
				System.out.println("NOME: " + vetor[a].getNome());
				System.out.println("RG: " + vetor[a].getRg());
				System.out.println("IDADE: " + vetor[a].getIdade());
				System.out.println("-----------------");
			}
		}

	}

	public void procurarPacientePorPosicao(int p) {

		for (int a = 0; a < vetor.length; a++) {
			if (p == a) {
				System.out.println("");
				System.out.println("NOME: " + vetor[a].getNome());
				System.out.println("RG: " + vetor[a].getRg());
				System.out.println("IDADE: " + vetor[a].getIdade());
				System.out.println("-----------------");
			}
		}

	}

	public void aumentarArray() {
		Paciente vetorNovo[] = new Paciente[this.vetor.length + 1];

		System.arraycopy(this.vetor, 0, vetorNovo, 0, this.vetor.length);

		this.vetor = vetorNovo;
	}

	public void cadastrarPacientePorPosicao(int p2) {

		for (int a = this.vetor.length - 1; a > p2; a--) {
			this.vetor[a] = this.vetor[a - 1];
		}
		Paciente pac = new Paciente();
		System.out.print("ADICIONE UM NOME DO PACIENTE: ");
		pac.setNome(in.next());
		System.out.print("ADICIONE UM RG DO PACIENTE: ");
		pac.setRg(in.next());
		System.out.print("ADICIONE UM IDADE DO PACIENTE: ");
		pac.setIdade(in.next());
		
		vetor[p2] = pac;
	}
	
	public void removerPacientePorPosicao(int e) {

		for (int a = e; a < this.vetor.length - 1; a++) {
			this.vetor[a] = this.vetor[a + 1];

		}

		Paciente vetorNovo1[] = new Paciente[this.vetor.length - 1];
		System.arraycopy(this.vetor, 0, vetorNovo1, 0, this.vetor.length - 1);
		this.vetor = vetorNovo1;

	}
	
	public void quantidade() {
		System.out.println("A QUANTIDADE DE PACIENTES CADASTRADOS É:"+ vetor.length );
	}
}

