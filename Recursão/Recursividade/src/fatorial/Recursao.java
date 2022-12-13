package fatorial;

public class Recursao {

	double total;
	
	public double contar(double n) {
		
		if(n ==0) {
			return 1;
		}
		
		System.out.println("Pilha-->" +n);
		
		total = n*contar(n-1);
		System.out.println("Desmontagem da pelha -->" + total);
		return total;
	}
	
	
}
