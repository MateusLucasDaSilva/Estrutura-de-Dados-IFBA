package Fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int guardar;

		for (int i = 0; i < 12; i++) {
			System.out.print(a+ "-");
			guardar = a;
			a = a + b;
			b = guardar;
		}

	}
}
