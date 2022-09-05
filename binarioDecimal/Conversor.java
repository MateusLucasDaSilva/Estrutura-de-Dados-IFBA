package binarioDecimal;

import java.util.LinkedList;

public class Conversor {
	
	LinkedList<Character> lista = new LinkedList<Character>();
	int aux = 0;
	double aux2;
	double decimal = 0;
	
	public void converter(String num) {
		
		if(aux < num.length()) {
			lista.add(num.charAt(aux));
			aux++;
			System.out.println(lista.toString());
			converter(num);
		}else {
			for (int b = 0; b < num.length(); b++) {
			int unidade = Character.getNumericValue(lista.removeLast());
			System.out.println(lista.toString());
			aux2 = (Math.pow(2, b)) * unidade;
			decimal = decimal + aux2;
			}
			//System.out.println(decimal);

			System.out.println(num + " em decimal é: " + decimal);
		
		}
		
	}
	

}



