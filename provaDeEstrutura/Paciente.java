package provaDeEstrutura;

public class Paciente {
	private String nome;
	private String rg;
	private String idade;
	
	public Paciente() {
	}

	public Paciente(String nome, String rg, String idade) {
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", rg=" + rg + ", idade=" + idade + "]";
	}
	
	
	

}
