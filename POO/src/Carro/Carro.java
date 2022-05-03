package Carro;

import java.util.Scanner;

public class Carro {
	public String nome;
	public String cor;
	Scanner scan = new Scanner(System.in);
	public void setCor(String cor) {
		this.cor= cor;
	}
	public String getCor() {
		return this.cor;
	}
}
