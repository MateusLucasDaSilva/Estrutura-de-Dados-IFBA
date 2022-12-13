package binarioDecimal;

import java.util.LinkedList;

public class Conversor {

	LinkedList<Character> p = new LinkedList<Character>();

	int b = 0;
	int aux = 0;
	double dec = 0;

	public void converter(String num) {

		if (aux < num.length()) {
			p.add(num.charAt(aux));
			aux++;
			converter(num);
		} else if(b < num.length()) {
				int a = Character.getNumericValue(p.removeLast());
				dec += +((Math.pow(2, b)) * a);
				b++;

			}

			System.out.println(num + " em decimal é: " + dec);

		}

	}


