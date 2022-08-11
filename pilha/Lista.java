package pilha;

import java.util.LinkedList;

public class Lista {

	LinkedList<Celula> lista = new LinkedList<Celula>();

	public void inserir(Celula info) {
		lista.addLast(info);

	}

	public void remover() {
		lista.removeLast();
	}

	public boolean verificar() {
		return this.lista.isEmpty();
	}

	public void mostrar() {
		System.out.println(this.lista.toString());
	}

}
