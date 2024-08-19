package view;

import javax.swing.JOptionPane;

import controller.SomaDigitosController;

public class Principal {

	public static void main(String[] args) {

		SomaDigitosController soma = new SomaDigitosController();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		int resultado = soma.SomaDigitos(n);
		
		System.out.println("A soma dos dígitos de " + n + " é igual a: " + resultado);
	}
}
