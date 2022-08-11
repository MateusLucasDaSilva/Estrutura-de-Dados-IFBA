package listaDuplamenteEncadeada;


public class ListaSimples {

	private Celula cabeca;
	private Celula cauda;

	private int totalElementos = 0;

	public void adicionaNoComeco(Object obj) {
		Celula cel = new Celula();
		cel.setObjeto(obj);
		cel.setAnterior(null);
		cel.setProxima(this.cabeca);
		if (this.cabeca != null) {
			this.cabeca.setAnterior(cel);
		}
		this.cabeca = cel;
		if (totalElementos == 0) {
			this.cauda = cel;
		}
		totalElementos++;
	}

	public String toString() {

		if (this.totalElementos == 0) {
			return "[]";
		}

		String str = "{" + totalElementos + "} ";
		Celula local = cabeca;
		while (local != null) {
			str += local.getObjeto() + " ";
			local = local.getProxima();

		}
		return str;
	}

	public void adicionaNoFinal(Object obj) {

		Celula cel = new Celula();
		cel.setObjeto(obj);
		cel.setProxima(null);
		cel.setAnterior(cauda);
		if (cauda != null) {
			this.cauda.setProxima(cel);

		}
		this.cauda = cel;
		if (totalElementos == 0) {
			this.cabeca = this.cauda;
		}
		totalElementos++;
	}

	public void adicionarPorPosicao(int posicao, Object obj) {

		if (posicao <= 0) {
			adicionaNoComeco(obj);
		} else if (posicao >= totalElementos) {
			adicionaNoFinal(obj);
		} else {
			Celula local = this.cabeca;
			for (int i = 0; i < posicao - 1; i++) {
				local = local.getProxima();
			}
			Celula cel = new Celula();
			cel.setObjeto(obj);
			cel.setAnterior(local);
			cel.setProxima(local.getProxima());
			local.setProxima(cel);
			cel.getProxima().setAnterior(cel);
			totalElementos++;

		}
	}

	public Object removerDoInicio() {
		if (cabeca == null) {
			return null;
		}
		Object out = cauda.getObjeto();
		cabeca = cabeca.getProxima();
		if (cabeca != null) {
			cabeca.setAnterior(null);
		} else {
			cauda = null;
		}
		totalElementos--;
		return out;

	}

	public Object RemoverDoFinal() {
		if (cauda == null) {
			return null;
		}
		Object obj = cauda.getObjeto();
		cauda = cauda.getAnterior();
		if (cauda != null) {
			cauda.setProxima(null);
		} else {
			cabeca = null;
		}
		totalElementos--;
		return obj;
	}

	public Object RemoverPorPosicao(int posicao) {
		if (posicao < 0 || posicao >= totalElementos || cabeca == null) {
			return null;
		} else if (posicao == 0) {
			return removerDoInicio();
		} else if (posicao == totalElementos - 1) {
			return RemoverDoFinal();
		}
		Celula local = cabeca;
		for (int i = 0; i < posicao; i++) {
			local = local.getProxima();
		}
		local.getAnterior().setProxima(local.getProxima());
		local.getProxima().setAnterior(local.getAnterior());
		totalElementos--;
		return"";
	}

	public boolean verificarPosica(int posicao) {
		return posicao >= 0 && posicao < this.totalElementos;
	}
}