package provaDeVetor;

import java.util.Arrays;
import java.util.Scanner;

public class Servico {
	
	Scanner in = new Scanner(System.in);
	Login log = new Login();
	Login vetor[] = new Login[2];
	
	public void addLongin() {
		
		for(int a = 0; a <vetor.length; a++) {
			
			Login log = new Login();
			System.out.print("usuario:");
			log.setUsuario(in.next());
			System.out.print("Senha:");
			log.setSenha(in.next());
			
			vetor[a] = log;
		}
	}
	
	public void listaLogins() {
		System.out.println("             ");
		System.out.println(Arrays.toString(vetor));
	}

	public void procurarLogin(String ler) {
		
		for(int a = 0; a <vetor.length; a++) {
			if (ler.equalsIgnoreCase(vetor[a].getUsuario())) {
				System.out.println(vetor[a].getUsuario());
				System.out.println(vetor[a].getSenha());
			}
			
			
		}
		
	}
	
	public void aumentarVetor() {
		Login vetorNovo[] = new Login[this.vetor.length + 1];
		
		System.arraycopy(this.vetor, 0, vetorNovo, 0, this.vetor.length);
		
		this.vetor = vetorNovo;
	}

	public void addPosição(int pos) {
		
	
		for(int a = this.vetor.length-1; a > pos; a--) {
			this.vetor[a ] = this.vetor[a - 1];
		}
			Login log = new Login();
			System.out.print("usuario:");
			log.setUsuario(in.next());
			System.out.print("Senha:");
			log.setSenha(in.next());
			
			this.vetor[pos] = log;
		
	}
	
	public void excluirPosicao(int e) {
		
		for(int a = e; a < this.vetor.length - 1; a++) {
			this.vetor[a] = this.vetor [a+1];
			
		}
		
		Login vetorNovo1[] = new Login[this.vetor.length-1];
		System.arraycopy(this.vetor, 0, vetorNovo1, 0, this.vetor.length - 1);
		this.vetor = vetorNovo1;
				
	}
}
