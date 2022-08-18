package Fila__Pilha;

public class Celula {
	
	private String nome;

	public Celula() {
	}

	public Celula(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "" + nome + "";
	}
	
	
	

}
