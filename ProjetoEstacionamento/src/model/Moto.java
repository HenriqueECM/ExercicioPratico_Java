package model;

public class Moto extends Veiculo {
	private String cilindrada;
	
	public Moto (String marca, String placa, String cilindrada) {
		super(marca, placa);
		this.cilindrada = cilindrada;
	}
	
	public void mostrarDados() {
		System.out.println("Marca: " + marca);
		System.out.println("Placa: " + placa);
		System.out.println("Cilindrada: " + cilindrada);
	}
	
	public void setCilindrada (String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public String getCilindrada() {
		return cilindrada;
	}
}
