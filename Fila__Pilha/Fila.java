package Fila__Pilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fila {

	Queue<Celula> fila = new LinkedList<Celula>();

	public void inserir(Celula info) {
		this.fila.add(info);
	}

	public void remover() {
		System.out.println(fila.remove());
	}

	public void verificar() {
		System.out.println(fila.size());
	}

	public void mostrar() {
		System.out.println("\n" + fila.toString());
	}

	public void inverter() {

		Stack<Celula> pilha = new Stack<Celula>();

		for (int a = 0; this.fila.size() >= a; a++) {
			pilha.push(this.fila.remove());
		}
		for (int b = 0; pilha.size() >= b; b++) {
			this.fila.add(pilha.pop());
		}

	}

}
