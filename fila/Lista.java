package fila;

import java.util.LinkedList;

public class Lista {
	
	LinkedList<Celula> lista = new LinkedList<Celula>();
	
public void inserir(Celula info) {
	
	if(!verificar()) {
		lista.addFirst(info);
	}else {
		lista.addLast(info);
	}
}
public void remover() {
	 this.lista.removeFirst();
}

public boolean verificar() {
	if(lista.isEmpty()) {
		return false;
	}else {
		return true;
	}

}

public void mostrar() {
	System.out.println("\n" + lista.toString());
}
}
