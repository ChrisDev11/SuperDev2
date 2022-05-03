package Calculadora;

import java.util.Scanner;

public class Media {
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	public double media;

	Scanner scan = new Scanner(System.in);
	

	public void entrarDados() {
		System.out.print("Nota 1: ");
		nota1 = scan.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = scan.nextDouble();
		System.out.print("Nota 3: ");
		nota3 = scan.nextDouble();
		System.out.print("Nota 4: ");
		nota4 = scan.nextDouble();
	}
	public void calcular() {
		media = (nota1 + nota2 + nota3 + nota4) / 4;
	}
	public void sairDados() {
		System.out.println("Media: "+media);
	}
	public void aprovado() {
		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}