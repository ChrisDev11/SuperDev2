package Calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public double valor1;
	public double valor2;
	public double total;
	public int op;
	
	Scanner scan = new Scanner(System.in);
	
	public void entrarDados() {
		System.out.println("Digite o valor 1: ");
		valor1 = scan.nextDouble();
		System.out.println("Digite o valor 2: ");
		valor2 = scan.nextDouble();
		
	}
	public void calcular() {
		System.out.println("1-Soma");
		System.out.println("2-Subtração");
		System.out.println("3-Multiplicação");
		System.out.println("4-Divisão");
		op=scan.nextInt();
		
		if (op == 1) {
			total = valor1 + valor2;
		} else if (op == 2) {
			total = valor1 - valor2;
		} else if (op == 3) {
			total = valor1 * valor2;
		} else if (op == 4) {
			total = valor1 / valor2;
		}
	}
	public void sairDados() {
		System.out.println(total);
	}

}
