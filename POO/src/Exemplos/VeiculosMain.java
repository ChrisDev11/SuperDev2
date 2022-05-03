package Exemplos;

public class VeiculosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Veiculos veiculo1 = new Veiculos();
		veiculo1.marca = "Peugeot";
		veiculo1.modelo = "Boxer";
		veiculo1.ano = 2013;
		veiculo1.altura = 1.60;
		veiculo1.tamanho = 2.30;
		veiculo1.peso = 1600;

		System.out.println("Marca: " + veiculo1.marca);
		System.out.println("Modelo: " + veiculo1.modelo);
		System.out.println("Ano: " + veiculo1.ano);
		System.out.println("Altura: " + veiculo1.altura + "m");
		System.out.println("Tamanho: " + veiculo1.tamanho + "m");
		System.out.println("Peso: " + veiculo1.peso + "Kg");

	}

}
