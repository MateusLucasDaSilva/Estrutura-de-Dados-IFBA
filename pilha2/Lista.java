package pilha2;


import java.util.Stack;

public class Lista {

	Stack<Celula> lista = new Stack<Celula>();

	public void inserir(Celula info) {
		lista.push(info);

	}

	public void remover() {
		lista.pop();
	}

	public boolean verificar() {
		return this.lista.isEmpty();
	}

	public void mostrar() {
		System.out.println(this.lista.toString());
	}

}
