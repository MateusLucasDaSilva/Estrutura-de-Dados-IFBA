package pilha2;

public class Principal {

	public static void main(String[] args) {

		Celula c1 = new Celula("Mateus", "68438434");
		Celula c2 = new Celula("Lucas", "654686846");
		Celula c3 = new Celula("Silva", "534656446");

		Lista lista = new Lista();
		lista.mostrar();
		lista.inserir(c1);
		lista.mostrar();
		lista.inserir(c2);
		lista.mostrar();
		lista.inserir(c3);
		lista.mostrar();
		lista.remover();
		lista.mostrar();
		lista.remover();
		lista.mostrar();
		lista.remover();
		lista.mostrar();

	}
}
