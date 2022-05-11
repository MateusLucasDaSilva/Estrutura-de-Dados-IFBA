package exercicioArreyList;

import java.util.ArrayList;

public class CadastroLogin {

	ArrayList<Login> vetor = new ArrayList<Login>();

	public void addConta(String usuario, String senha) {

			Login log = new Login();
			log.setUsuario(usuario);
			log.setSenha(senha);
			vetor.add(log);

		

	}
	
	public void listar() {
		for (int i = 0; i < this.vetor.size(); i++) {
		      System.out.println(vetor.get(i));
		}
		
		//System.out.println(Arrays.toString(vetor));
	}
	
	public void procurar(int p) {
		
		System.out.println(this.vetor.get(p));
		
		
	}
	
	public void remover(int p1) {
		this.vetor.remove(p1);
		listar();
	}

}
