package fila3;

import java.util.LinkedList;
import java.util.Queue;

public class Lista {
	
	Queue<Celula> lista = new LinkedList<Celula>();
	
public void inserir(Celula info) {
	
	lista.add(info);
}
public void remover() {
	 System.out.println(lista.remove());
}

public void verificar() {
	System.out.println(lista.size());
}

public void mostrar() {
	System.out.println("\n" + lista.toString());
}
}
