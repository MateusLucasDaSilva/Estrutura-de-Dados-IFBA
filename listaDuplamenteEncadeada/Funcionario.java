package listaDuplamenteEncadeada;

public class Funcionario {

	private String nome;
	private String cpf;
	private String rg;
	private int idade;

	public Funcionario() {
	}

	public Funcionario(String nome, String cpf, String rg, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", idade=" + idade + "]";
	}

}
