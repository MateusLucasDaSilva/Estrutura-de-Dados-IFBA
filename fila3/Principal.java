package fila3;

public class Principal {

	public static void main(String[] args) {
		Celula c1 = new Celula("Mateus", "6546846");
		Celula c2 = new Celula("Lucas", "4484646");
		Celula c3 = new Celula("Silva", "86684684");
		Lista l = new Lista();
		l.inserir(c1);
		l.mostrar();
		l.inserir(c2);
		l.mostrar();
		l.inserir(c3);
		l.mostrar();
		l.remover();
		l.mostrar();
		l.remover();
		l.mostrar();

	}
	



}
