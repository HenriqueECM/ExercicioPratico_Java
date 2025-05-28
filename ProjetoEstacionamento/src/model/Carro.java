package model;

public class Carro extends Veiculo {
	private int numeroPortas;
	
	public Carro(String placa, String marca, int numeroPortas) {
		super(placa, marca);
		this.numeroPortas = numeroPortas;
	}
	
	public void mostrarDados() {
		System.out.println("Marca: " + marca);
		System.out.println("Placa: " + placa);
		System.out.println("Número de portas: " + numeroPortas);
	}
	
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
	public int getNumeroPortas() {
		return numeroPortas;
	}
}
