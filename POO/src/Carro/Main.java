package Carro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1 = new Carro();

		carro1.nome = "Fox";
		carro1.cor = "Vermelho";
		System.out.println(carro1.nome);

		System.out.println(carro1.cor);
		carro1.setCor("Azul");
		System.out.println(carro1.getCor());
	
	}

}
