package controller;

public class SomaDigitosController {

	public SomaDigitosController() {
		super();
	}

	public int SomaDigitos(int n) {
		
		//Condição de parada: Se o número for zero, a soma dos dígitos será 0
		if (n == 0) {
			return 0;
		} else {
			
			// Soma o último dígito com os dígitos restantes
			return (n % 10) + SomaDigitos(n / 10);
		}
	}
}

