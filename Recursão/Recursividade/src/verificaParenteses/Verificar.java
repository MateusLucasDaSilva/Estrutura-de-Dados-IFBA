package verificaParenteses;

import java.util.LinkedList;

public class Verificar {

	LinkedList<Character> lista = new LinkedList<Character>();

	int aux = 0;
	int aux2 = 0;
	int a = 0;
	int b = 0;
	String abre = "(";
	String fecha = ")";
	

	public void verificar(String exp) {

		while (aux < exp.length()) {
			lista.add(exp.charAt(aux));
			aux++;

		}

		while (!lista.isEmpty()) {
			String l = Character.toString(lista.removeLast());

			if (l.equalsIgnoreCase(abre)) {
				a++;
			} else if (l.equalsIgnoreCase(fecha)) {
				b++;
			}

		}

		if (b == a) {
			System.out.println("A expresão foi digitada corretamente");
		} else {
			System.out.println("A espresão está errada!");
		}
	}
}
