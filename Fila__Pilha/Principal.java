package Fila__Pilha;

public class Principal {

	public static void main(String[] args) {
		
		Celula c1 = new Celula("Teste1");
		Celula c2 = new Celula("Teste2");
		Celula c3 = new Celula("Teste3");
	

		
		Fila fila = new Fila();
		
		fila.inserir(c1);
		fila.inserir(c2);
		fila.inserir(c3);
		fila.mostrar();
		
		fila.inverter();
		fila.mostrar();

	}

}
